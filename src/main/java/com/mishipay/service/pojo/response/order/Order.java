package com.mishipay.service.pojo.response.order;

import java.util.List;

public class Order
{
    private long id;

    private String email;

    private String closed_at;

    private String created_at;

    private String updated_at;

    private long number;

    private String note;

    private String token;

    private String gateway;

    private boolean test;

    private String total_price;

    private String subtotal_price;

    private long total_weight;

    private String total_tax;

    private boolean taxes_included;

    private String currency;

    private String financial_status;

    private boolean confirmed;

    private String total_discounts;

    private String total_line_items_price;

    private String cart_token;

    private boolean buyer_accepts_marketing;

    private String name;

    private String referring_site;

    private String landing_site;

    private String cancelled_at;

    private String cancel_reason;

    private String total_price_usd;

    private String checkout_token;

    private String reference;

    private String user_id;

    private String location_id;

    private String source_identifier;

    private String source_url;

    private String processed_at;

    private String device_id;

    private String phone;

    private String customer_locale;

    private long app_id;

    private String browser_ip;

    private String landing_site_ref;

    private long order_number;

    private List<String> discount_applications;

    private List<String> discount_codes;

    private List<String> note_attributes;

    private List<String> payment_gateway_names;

    private String processing_method;

    private String checkout_id;

    private String source_name;

    private String fulfillment_status;

    private List<String> tax_lines;

    private String tags;

    private String contact_email;

    private String order_status_url;

    private String presentment_currency;

    private Total_line_items_price_set total_line_items_price_set;

    private Total_discounts_set total_discounts_set;

    private Total_shipping_price_set total_shipping_price_set;

    private Subtotal_price_set subtotal_price_set;

    private Total_price_set total_price_set;

    private Total_tax_set total_tax_set;

    private String admin_graphql_api_id;

    private List<String> shipping_lines;

    private List<Line_items> line_items;

    private List<String> fulfillments;

    private List<String> refunds;

    public void setId(long id){
        this.id = id;
    }
    public long getId(){
        return this.id;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public String getEmail(){
        return this.email;
    }
    public void setClosed_at(String closed_at){
        this.closed_at = closed_at;
    }
    public String getClosed_at(){
        return this.closed_at;
    }
    public void setCreated_at(String created_at){
        this.created_at = created_at;
    }
    public String getCreated_at(){
        return this.created_at;
    }
    public void setUpdated_at(String updated_at){
        this.updated_at = updated_at;
    }
    public String getUpdated_at(){
        return this.updated_at;
    }
    public void setNumber(long number){
        this.number = number;
    }
    public long getNumber(){
        return this.number;
    }
    public void setNote(String note){
        this.note = note;
    }
    public String getNote(){
        return this.note;
    }
    public void setToken(String token){
        this.token = token;
    }
    public String getToken(){
        return this.token;
    }
    public void setGateway(String gateway){
        this.gateway = gateway;
    }
    public String getGateway(){
        return this.gateway;
    }
    public void setTest(boolean test){
        this.test = test;
    }
    public boolean getTest(){
        return this.test;
    }
    public void setTotal_price(String total_price){
        this.total_price = total_price;
    }
    public String getTotal_price(){
        return this.total_price;
    }
    public void setSubtotal_price(String subtotal_price){
        this.subtotal_price = subtotal_price;
    }
    public String getSubtotal_price(){
        return this.subtotal_price;
    }
    public void setTotal_weight(long total_weight){
        this.total_weight = total_weight;
    }
    public long getTotal_weight(){
        return this.total_weight;
    }
    public void setTotal_tax(String total_tax){
        this.total_tax = total_tax;
    }
    public String getTotal_tax(){
        return this.total_tax;
    }
    public void setTaxes_included(boolean taxes_included){
        this.taxes_included = taxes_included;
    }
    public boolean getTaxes_included(){
        return this.taxes_included;
    }
    public void setCurrency(String currency){
        this.currency = currency;
    }
    public String getCurrency(){
        return this.currency;
    }
    public void setFinancial_status(String financial_status){
        this.financial_status = financial_status;
    }
    public String getFinancial_status(){
        return this.financial_status;
    }
    public void setConfirmed(boolean confirmed){
        this.confirmed = confirmed;
    }
    public boolean getConfirmed(){
        return this.confirmed;
    }
    public void setTotal_discounts(String total_discounts){
        this.total_discounts = total_discounts;
    }
    public String getTotal_discounts(){
        return this.total_discounts;
    }
    public void setTotal_line_items_price(String total_line_items_price){
        this.total_line_items_price = total_line_items_price;
    }
    public String getTotal_line_items_price(){
        return this.total_line_items_price;
    }
    public void setCart_token(String cart_token){
        this.cart_token = cart_token;
    }
    public String getCart_token(){
        return this.cart_token;
    }
    public void setBuyer_accepts_marketing(boolean buyer_accepts_marketing){
        this.buyer_accepts_marketing = buyer_accepts_marketing;
    }
    public boolean getBuyer_accepts_marketing(){
        return this.buyer_accepts_marketing;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public void setReferring_site(String referring_site){
        this.referring_site = referring_site;
    }
    public String getReferring_site(){
        return this.referring_site;
    }
    public void setLanding_site(String landing_site){
        this.landing_site = landing_site;
    }
    public String getLanding_site(){
        return this.landing_site;
    }
    public void setCancelled_at(String cancelled_at){
        this.cancelled_at = cancelled_at;
    }
    public String getCancelled_at(){
        return this.cancelled_at;
    }
    public void setCancel_reason(String cancel_reason){
        this.cancel_reason = cancel_reason;
    }
    public String getCancel_reason(){
        return this.cancel_reason;
    }
    public void setTotal_price_usd(String total_price_usd){
        this.total_price_usd = total_price_usd;
    }
    public String getTotal_price_usd(){
        return this.total_price_usd;
    }
    public void setCheckout_token(String checkout_token){
        this.checkout_token = checkout_token;
    }
    public String getCheckout_token(){
        return this.checkout_token;
    }
    public void setReference(String reference){
        this.reference = reference;
    }
    public String getReference(){
        return this.reference;
    }
    public void setUser_id(String user_id){
        this.user_id = user_id;
    }
    public String getUser_id(){
        return this.user_id;
    }
    public void setLocation_id(String location_id){
        this.location_id = location_id;
    }
    public String getLocation_id(){
        return this.location_id;
    }
    public void setSource_identifier(String source_identifier){
        this.source_identifier = source_identifier;
    }
    public String getSource_identifier(){
        return this.source_identifier;
    }
    public void setSource_url(String source_url){
        this.source_url = source_url;
    }
    public String getSource_url(){
        return this.source_url;
    }
    public void setProcessed_at(String processed_at){
        this.processed_at = processed_at;
    }
    public String getProcessed_at(){
        return this.processed_at;
    }
    public void setDevice_id(String device_id){
        this.device_id = device_id;
    }
    public String getDevice_id(){
        return this.device_id;
    }
    public void setPhone(String phone){
        this.phone = phone;
    }
    public String getPhone(){
        return this.phone;
    }
    public void setCustomer_locale(String customer_locale){
        this.customer_locale = customer_locale;
    }
    public String getCustomer_locale(){
        return this.customer_locale;
    }
    public void setApp_id(long app_id){
        this.app_id = app_id;
    }
    public long getApp_id(){
        return this.app_id;
    }
    public void setBrowser_ip(String browser_ip){
        this.browser_ip = browser_ip;
    }
    public String getBrowser_ip(){
        return this.browser_ip;
    }
    public void setLanding_site_ref(String landing_site_ref){
        this.landing_site_ref = landing_site_ref;
    }
    public String getLanding_site_ref(){
        return this.landing_site_ref;
    }
    public void setOrder_number(long order_number){
        this.order_number = order_number;
    }
    public long getOrder_number(){
        return this.order_number;
    }
    public void setDiscount_applications(List<String> discount_applications){
        this.discount_applications = discount_applications;
    }
    public List<String> getDiscount_applications(){
        return this.discount_applications;
    }
    public void setDiscount_codes(List<String> discount_codes){
        this.discount_codes = discount_codes;
    }
    public List<String> getDiscount_codes(){
        return this.discount_codes;
    }
    public void setNote_attributes(List<String> note_attributes){
        this.note_attributes = note_attributes;
    }
    public List<String> getNote_attributes(){
        return this.note_attributes;
    }
    public void setPayment_gateway_names(List<String> payment_gateway_names){
        this.payment_gateway_names = payment_gateway_names;
    }
    public List<String> getPayment_gateway_names(){
        return this.payment_gateway_names;
    }
    public void setProcessing_method(String processing_method){
        this.processing_method = processing_method;
    }
    public String getProcessing_method(){
        return this.processing_method;
    }
    public void setCheckout_id(String checkout_id){
        this.checkout_id = checkout_id;
    }
    public String getCheckout_id(){
        return this.checkout_id;
    }
    public void setSource_name(String source_name){
        this.source_name = source_name;
    }
    public String getSource_name(){
        return this.source_name;
    }
    public void setFulfillment_status(String fulfillment_status){
        this.fulfillment_status = fulfillment_status;
    }
    public String getFulfillment_status(){
        return this.fulfillment_status;
    }
    public void setTax_lines(List<String> tax_lines){
        this.tax_lines = tax_lines;
    }
    public List<String> getTax_lines(){
        return this.tax_lines;
    }
    public void setTags(String tags){
        this.tags = tags;
    }
    public String getTags(){
        return this.tags;
    }
    public void setContact_email(String contact_email){
        this.contact_email = contact_email;
    }
    public String getContact_email(){
        return this.contact_email;
    }
    public void setOrder_status_url(String order_status_url){
        this.order_status_url = order_status_url;
    }
    public String getOrder_status_url(){
        return this.order_status_url;
    }
    public void setPresentment_currency(String presentment_currency){
        this.presentment_currency = presentment_currency;
    }
    public String getPresentment_currency(){
        return this.presentment_currency;
    }
    public void setTotal_line_items_price_set(Total_line_items_price_set total_line_items_price_set){
        this.total_line_items_price_set = total_line_items_price_set;
    }
    public Total_line_items_price_set getTotal_line_items_price_set(){
        return this.total_line_items_price_set;
    }
    public void setTotal_discounts_set(Total_discounts_set total_discounts_set){
        this.total_discounts_set = total_discounts_set;
    }
    public Total_discounts_set getTotal_discounts_set(){
        return this.total_discounts_set;
    }
    public void setTotal_shipping_price_set(Total_shipping_price_set total_shipping_price_set){
        this.total_shipping_price_set = total_shipping_price_set;
    }
    public Total_shipping_price_set getTotal_shipping_price_set(){
        return this.total_shipping_price_set;
    }
    public void setSubtotal_price_set(Subtotal_price_set subtotal_price_set){
        this.subtotal_price_set = subtotal_price_set;
    }
    public Subtotal_price_set getSubtotal_price_set(){
        return this.subtotal_price_set;
    }
    public void setTotal_price_set(Total_price_set total_price_set){
        this.total_price_set = total_price_set;
    }
    public Total_price_set getTotal_price_set(){
        return this.total_price_set;
    }
    public void setTotal_tax_set(Total_tax_set total_tax_set){
        this.total_tax_set = total_tax_set;
    }
    public Total_tax_set getTotal_tax_set(){
        return this.total_tax_set;
    }
    public void setAdmin_graphql_api_id(String admin_graphql_api_id){
        this.admin_graphql_api_id = admin_graphql_api_id;
    }
    public String getAdmin_graphql_api_id(){
        return this.admin_graphql_api_id;
    }
    public void setShipping_lines(List<String> shipping_lines){
        this.shipping_lines = shipping_lines;
    }
    public List<String> getShipping_lines(){
        return this.shipping_lines;
    }
    public void setLine_items(List<Line_items> line_items){
        this.line_items = line_items;
    }
    public List<Line_items> getLine_items(){
        return this.line_items;
    }
    public void setFulfillments(List<String> fulfillments){
        this.fulfillments = fulfillments;
    }
    public List<String> getFulfillments(){
        return this.fulfillments;
    }
    public void setRefunds(List<String> refunds){
        this.refunds = refunds;
    }
    public List<String> getRefunds(){
        return this.refunds;
    }
}
