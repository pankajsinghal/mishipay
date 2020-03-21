package com.mishipay.service.pojo;

public class InventoryAdjust {

    public long location_id;
    public long inventory_item_id;
    public long available_adjustment;

    public InventoryAdjust(long location_id, long inventory_item_id, long available_adjustment) {
        this.location_id = location_id;
        this.inventory_item_id = inventory_item_id;
        this.available_adjustment = available_adjustment;
    }

    public long getLocation_id() {
        return location_id;
    }

    public void setLocation_id(long location_id) {
        this.location_id = location_id;
    }

    public long getInventory_item_id() {
        return inventory_item_id;
    }

    public void setInventory_item_id(long inventory_item_id) {
        this.inventory_item_id = inventory_item_id;
    }

    public long getAvailable_adjustment() {
        return available_adjustment;
    }

    public void setAvailable_adjustment(long available_adjustment) {
        this.available_adjustment = available_adjustment;
    }
}
