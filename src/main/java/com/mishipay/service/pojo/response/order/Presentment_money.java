package com.mishipay.service.pojo.response.order;

public class Presentment_money
{
    private String amount;

    private String currency_code;

    public void setAmount(String amount){
        this.amount = amount;
    }
    public String getAmount(){
        return this.amount;
    }
    public void setCurrency_code(String currency_code){
        this.currency_code = currency_code;
    }
    public String getCurrency_code(){
        return this.currency_code;
    }
}
