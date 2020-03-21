package com.mishipay.service.pojo;

import java.util.List;

public class InventoryLevels
{
    private List<InventoryLevel> inventory_levels;

    public void setInventoryLevel(List<InventoryLevel> inventory_levels){
        this.inventory_levels = inventory_levels;
    }
    public List<InventoryLevel> getInventoryLevel(){
        return this.inventory_levels;
    }
}

