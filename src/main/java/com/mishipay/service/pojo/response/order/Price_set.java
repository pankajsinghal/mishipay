package com.mishipay.service.pojo.response.order;

public class Price_set
{
    private Shop_money shop_money;

    private Presentment_money presentment_money;

    public void setShop_money(Shop_money shop_money){
        this.shop_money = shop_money;
    }
    public Shop_money getShop_money(){
        return this.shop_money;
    }
    public void setPresentment_money(Presentment_money presentment_money){
        this.presentment_money = presentment_money;
    }
    public Presentment_money getPresentment_money(){
        return this.presentment_money;
    }
}
