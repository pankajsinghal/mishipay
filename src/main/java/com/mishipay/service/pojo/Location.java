package com.mishipay.service.pojo;

public class Location
{
    private long id;

    private boolean active;

    private String created_at;

    private String country_code;

    private String address2;

    private String province;

    private boolean legacy;

    private String country_name;

    private String admin_graphql_api_id;

    private String address1;

    private String name;

    private String city;

    private String phone;

    private String zip;

    private String updated_at;

    private String province_code;

    private String country;

    public void setId(long id){
        this.id = id;
    }
    public long getId(){
        return this.id;
    }
    public void setActive(boolean active){
        this.active = active;
    }
    public boolean getActive(){
        return this.active;
    }
    public void setCreated_at(String created_at){
        this.created_at = created_at;
    }
    public String getCreated_at(){
        return this.created_at;
    }
    public void setCountry_code(String country_code){
        this.country_code = country_code;
    }
    public String getCountry_code(){
        return this.country_code;
    }
    public void setAddress2(String address2){
        this.address2 = address2;
    }
    public String getAddress2(){
        return this.address2;
    }
    public void setProvince(String province){
        this.province = province;
    }
    public String getProvince(){
        return this.province;
    }
    public void setLegacy(boolean legacy){
        this.legacy = legacy;
    }
    public boolean getLegacy(){
        return this.legacy;
    }
    public void setCountry_name(String country_name){
        this.country_name = country_name;
    }
    public String getCountry_name(){
        return this.country_name;
    }
    public void setAdmin_graphql_api_id(String admin_graphql_api_id){
        this.admin_graphql_api_id = admin_graphql_api_id;
    }
    public String getAdmin_graphql_api_id(){
        return this.admin_graphql_api_id;
    }
    public void setAddress1(String address1){
        this.address1 = address1;
    }
    public String getAddress1(){
        return this.address1;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public void setCity(String city){
        this.city = city;
    }
    public String getCity(){
        return this.city;
    }
    public void setPhone(String phone){
        this.phone = phone;
    }
    public String getPhone(){
        return this.phone;
    }
    public void setZip(String zip){
        this.zip = zip;
    }
    public String getZip(){
        return this.zip;
    }
    public void setUpdated_at(String updated_at){
        this.updated_at = updated_at;
    }
    public String getUpdated_at(){
        return this.updated_at;
    }
    public void setProvince_code(String province_code){
        this.province_code = province_code;
    }
    public String getProvince_code(){
        return this.province_code;
    }
    public void setCountry(String country){
        this.country = country;
    }
    public String getCountry(){
        return this.country;
    }
}