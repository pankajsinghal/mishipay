package com.mishipay.service.pojo;

public class InventoryLevel
{
    private String updated_at;

    private String admin_graphql_api_id;

    private long inventory_item_id;

    private long location_id;

    private long available;

    public void setUpdated_at(String updated_at){
        this.updated_at = updated_at;
    }
    public String getUpdated_at(){
        return this.updated_at;
    }
    public void setAdmin_graphql_api_id(String admin_graphql_api_id){
        this.admin_graphql_api_id = admin_graphql_api_id;
    }
    public String getAdmin_graphql_api_id(){
        return this.admin_graphql_api_id;
    }
    public void setInventory_item_id(long inventory_item_id){
        this.inventory_item_id = inventory_item_id;
    }
    public long getInventory_item_id(){
        return this.inventory_item_id;
    }
    public void setLocation_id(long location_id){
        this.location_id = location_id;
    }
    public long getLocation_id(){
        return this.location_id;
    }
    public void setAvailable(long available){
        this.available = available;
    }
    public long getAvailable(){
        return this.available;
    }
}