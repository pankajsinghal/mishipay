package com.mishipay.service.pojo;

import java.util.List;

public class InventoryItem {
        private String sku;

        private String created_at;

        private String province_code_of_origin;

        private boolean tracked;

        private long id;

        private List<String> country_harmonized_system_codes;

        private String cost;

        private boolean requires_shipping;

        private String admin_graphql_api_id;

        private String updated_at;

        private String harmonized_system_code;

        private String country_code_of_origin;
        private String quantity;
        private String location;

        public void setSku(String sku){
        this.sku = sku;
    }
        public String getSku(){
        return this.sku;
    }
        public void setCreated_at(String created_at){
        this.created_at = created_at;
    }
        public String getCreated_at(){
        return this.created_at;
    }
        public void setProvince_code_of_origin(String province_code_of_origin){
        this.province_code_of_origin = province_code_of_origin;
    }
        public String getProvince_code_of_origin(){
        return this.province_code_of_origin;
    }
        public void setTracked(boolean tracked){
        this.tracked = tracked;
    }
        public boolean getTracked(){
        return this.tracked;
    }
        public void setId(long id){
        this.id = id;
    }
        public long getId(){
        return this.id;
    }
        public void setCountry_harmonized_system_codes(List<String> country_harmonized_system_codes){
        this.country_harmonized_system_codes = country_harmonized_system_codes;
    }
        public List<String> getCountry_harmonized_system_codes(){
        return this.country_harmonized_system_codes;
    }
        public void setCost(String cost){
        this.cost = cost;
    }
        public String getCost(){
        return this.cost;
    }
        public void setRequires_shipping(boolean requires_shipping){
        this.requires_shipping = requires_shipping;
    }
        public boolean getRequires_shipping(){
        return this.requires_shipping;
    }
        public void setAdmin_graphql_api_id(String admin_graphql_api_id){
        this.admin_graphql_api_id = admin_graphql_api_id;
    }
        public String getAdmin_graphql_api_id(){
        return this.admin_graphql_api_id;
    }
        public void setUpdated_at(String updated_at){
        this.updated_at = updated_at;
    }
        public String getUpdated_at(){
        return this.updated_at;
    }
        public void setHarmonized_system_code(String harmonized_system_code){
        this.harmonized_system_code = harmonized_system_code;
    }
        public String getHarmonized_system_code(){
        return this.harmonized_system_code;
    }
        public void setCountry_code_of_origin(String country_code_of_origin){
        this.country_code_of_origin = country_code_of_origin;
    }
        public String getCountry_code_of_origin(){
        return this.country_code_of_origin;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
