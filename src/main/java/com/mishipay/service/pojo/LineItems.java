package com.mishipay.service.pojo;

public class LineItems {
    private long variant_id;

    private long quantity;
    private String price;
    private String name = "phone";
    private String title = "phone";

    public void setVariant_id(long variant_id){
        this.variant_id = variant_id;
    }
    public long getVariant_id(){
        return this.variant_id;
    }
    public void setQuantity(long quantity){
        this.quantity = quantity;
    }
    public long getQuantity(){
        return this.quantity;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}