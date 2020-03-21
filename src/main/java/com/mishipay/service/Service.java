package com.mishipay.service;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.mishipay.service.pojo.*;
import com.mishipay.service.pojo.response.order.OrderResponse;
import com.mishipay.utils.JSONResponseHandler;
import com.mishipay.utils.NetworkCommunicationException;
import com.mishipay.utils.PooledHttpRequestMaker;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.stream.Collectors;


@org.springframework.stereotype.Service
public class Service {

    private static final Logger logger = LoggerFactory.getLogger(Service.class);

    PooledHttpRequestMaker pooledHttpRequestMaker = new PooledHttpRequestMaker();

    String url="https://a38f4a6a8cb713fe2bebdbf3df331f54:3182dcd29ff6c3f6f2dd325ba99b4216@mishipaytestdevelopmentemptystore.myshopify.com/";
    String locationUrl = url+"admin/api/2020-01/locations.json";
    String inventoryLevelUrl = url+"admin/api/2020-01/inventory_levels.json?location_ids=";
    String inventoryUrl = url+"admin/api/2020-01/inventory_items.json?ids=";
    String inventoryUpdateUrl = url+"/admin/api/2020-01/inventory_levels/adjust.json";
    String orderUrl = url+"admin/api/2020-01/orders.json";

    Gson gson = new Gson();

    Map<String,String> location = new HashMap<>();

    public String getInventory() throws NetworkCommunicationException {

        Locations locations = pooledHttpRequestMaker.executeHttpGet(locationUrl,new HashMap<>(),new JSONResponseHandler<>(Locations.class));

        String locationids = locations.getLocations().stream().map(Location::getId).filter(Objects::nonNull).map(Objects::toString).collect(Collectors.joining(","));
        InventoryLevels inventoryLevels = pooledHttpRequestMaker.executeHttpGet(inventoryLevelUrl+locationids,new HashMap<>(),new JSONResponseHandler<>(InventoryLevels.class));
        String inventoryids = inventoryLevels.getInventoryLevel().stream().map(InventoryLevel::getInventory_item_id).filter(Objects::nonNull).map(Objects::toString).collect(Collectors.joining(","));

        Map<String,String>available = inventoryLevels.getInventoryLevel().stream().collect(Collectors.toMap(inventoryLevel -> inventoryLevel.getInventory_item_id()+"",inventoryLevel -> inventoryLevel.getAvailable()+""));
        Map<String,String> location1 = inventoryLevels.getInventoryLevel().stream().collect(Collectors.toMap(inventoryLevel -> inventoryLevel.getInventory_item_id()+"",inventoryLevel -> inventoryLevel.getLocation_id()+""));
        location.putAll(location1);

        InventoryItems inventoryItems = pooledHttpRequestMaker.executeHttpGet(inventoryUrl+inventoryids,new HashMap<>(),new JSONResponseHandler<>(InventoryItems.class));

        inventoryItems.getInventoryItem().stream().forEach(inventoryItem -> inventoryItem.setQuantity(available.get(inventoryItem.getId()+"")));

        return gson.toJson(inventoryItems);
    }

    public String placeOrder(List<LineItems> items) throws NetworkCommunicationException {


        Order order = new Order();
        order.setLine_items(items);

        Orders orders = new Orders();
        orders.setOrder(order);
        OrderResponse orderResponse;
        try {
            orderResponse = pooledHttpRequestMaker.executeHttpPost(orderUrl,gson.toJson(orders),new JSONResponseHandler<>(OrderResponse.class),"application/json");
        } catch (NetworkCommunicationException e) {
            e.printStackTrace();
            return e.getMessage();
        }

        List<InventoryAdjust> inventoryAdjusts = items.stream().map(item -> new InventoryAdjust(Long.parseLong(location.get(item.getVariant_id()+"")),item.getVariant_id(),-1*item.getQuantity())).collect(Collectors.toList());


        for (InventoryAdjust inventoryAdjust : inventoryAdjusts) {
            try {
                pooledHttpRequestMaker.executeHttpPost(inventoryUpdateUrl,gson.toJson(inventoryAdjust),new JSONResponseHandler<>(JsonObject.class),"application/json");
            } catch (NetworkCommunicationException e) {
            }
        }

        return gson.toJson(orderResponse);

    }


}