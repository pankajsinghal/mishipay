package com.mishipay.service.pojo;

import java.util.List;

public class Order
{
    private List<LineItems> line_items;

    public void setLine_items(List<LineItems> line_items){
        this.line_items = line_items;
    }
    public List<LineItems> getLine_items(){
        return this.line_items;
    }
}