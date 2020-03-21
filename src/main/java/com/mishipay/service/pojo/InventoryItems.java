package com.mishipay.service.pojo;

import java.util.List;

public class InventoryItems {
        private List<InventoryItem> inventory_items;

        public void setInventoryItem (List < InventoryItem > inventory_items) {
        this.inventory_items = inventory_items;
    }
        public List<InventoryItem> getInventoryItem () {
        return this.inventory_items;
    }
}
