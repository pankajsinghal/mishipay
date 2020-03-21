##inventory


- % curl -XGET -H "Content-type: application/json" -d '{}' http://127.0.0.1:8080/mishipay/inventory | json_pp

{
   "inventory_items" : [
      {
         "quantity" : "90",
         "requires_shipping" : true,
         "updated_at" : "2020-02-27T11:28:22-05:00",
         "country_harmonized_system_codes" : [],
         "id" : 33032334901315,
         "tracked" : true,
         "sku" : "ONEPLUS",
         "created_at" : "2020-02-27T11:28:22-05:00",
         "cost" : "40000.00",
         "admin_graphql_api_id" : "gid://shopify/InventoryItem/33032334901315"
      },
      {
         "updated_at" : "2020-02-27T12:45:17-05:00",
         "requires_shipping" : true,
         "quantity" : "17",
         "admin_graphql_api_id" : "gid://shopify/InventoryItem/33032802566211",
         "cost" : "40000.00",
         "sku" : "ONEPLUS",
         "created_at" : "2020-02-27T12:45:17-05:00",
         "tracked" : true,
         "id" : 33032802566211,
         "country_harmonized_system_codes" : []
      }
   ]
}

##order

 - % curl -XPOST -H "Content-type: application/json" -d '[{"variant_id":33032334901315,"quantity":2,"price":"40000.00"},{"variant_id":33032802566211,"quantity":1,"price":"40000.00"}]' http://127.0.0.1:8080/mishipay/order
   {"order":{"id":2018483765315,"email":"","created_at":"2020-03-21T08:05:45-04:00","updated_at":"2020-03-21T08:05:45-04:00","number":7,"token":"891690f0dc48e36d540d3083b15eda87","gateway":"","test":false,"total_price":"120000.00","subtotal_price":"120000.00","total_weight":0,"total_tax":"0.00","taxes_included":false,"currency":"INR","financial_status":"paid","confirmed":true,"total_discounts":"0.00","total_line_items_price":"120000.00","buyer_accepts_marketing":false,"name":"#1007","total_price_usd":"1589.81","processed_at":"2020-03-21T08:05:45-04:00","app_id":3493297,"order_number":1007,"discount_applications":[],"discount_codes":[],"note_attributes":[],"payment_gateway_names":[],"processing_method":"","source_name":"3493297","tax_lines":[],"tags":"","order_status_url":"https://mishipaytestdevelopmentemptystore.myshopify.com/1545896003/orders/891690f0dc48e36d540d3083b15eda87/authenticate?key\u003dbee35475f3922813b955932b4a0b3f33","presentment_currency":"INR","total_line_items_price_set":{"shop_money":{"amount":"120000.00","currency_code":"INR"},"presentment_money":{"amount":"120000.00","currency_code":"INR"}},"total_discounts_set":{"shop_money":{"amount":"0.00","currency_code":"INR"},"presentment_money":{"amount":"0.00","currency_code":"INR"}},"total_shipping_price_set":{"shop_money":{"amount":"0.00","currency_code":"INR"},"presentment_money":{"amount":"0.00","currency_code":"INR"}},"subtotal_price_set":{"shop_money":{"amount":"120000.00","currency_code":"INR"},"presentment_money":{"amount":"120000.00","currency_code":"INR"}},"total_price_set":{"shop_money":{"amount":"120000.00","currency_code":"INR"},"presentment_money":{"amount":"120000.00","currency_code":"INR"}},"total_tax_set":{"shop_money":{"amount":"0.00","currency_code":"INR"},"presentment_money":{"amount":"0.00","currency_code":"INR"}},"admin_graphql_api_id":"gid://shopify/Order/2018483765315","shipping_lines":[],"line_items":[{"id":4426841915459,"variant_id":0,"title":"phone","quantity":2,"fulfillment_service":"manual","product_id":0,"requires_shipping":true,"taxable":true,"gift_card":false,"name":"phone","properties":[],"product_exists":false,"fulfillable_quantity":2,"grams":0,"price":"40000.00","total_discount":"0.00","price_set":{"shop_money":{"amount":"40000.00","currency_code":"INR"},"presentment_money":{"amount":"40000.00","currency_code":"INR"}},"total_discount_set":{"shop_money":{"amount":"0.00","currency_code":"INR"},"presentment_money":{"amount":"0.00","currency_code":"INR"}},"discount_allocations":[],"admin_graphql_api_id":"gid://shopify/LineItem/4426841915459","tax_lines":[]},{"id":4426841948227,"variant_id":0,"title":"phone","quantity":1,"fulfillment_service":"manual","product_id":0,"requires_shipping":true,"taxable":true,"gift_card":false,"name":"phone","properties":[],"product_exists":false,"fulfillable_quantity":1,"grams":0,"price":"40000.00","total_discount":"0.00","price_set":{"shop_money":{"amount":"40000.00","currency_code":"INR"},"presentment_money":{"amount":"40000.00","currency_code":"INR"}},"total_discount_set":{"shop_money":{"amount":"0.00","currency_code":"INR"},"presentment_money":{"amount":"0.00","currency_code":"INR"}},"discount_allocations":[],"admin_graphql_api_id":"gid://shopify/LineItem/4426841948227","tax_lines":[]}],"fulfillments":[],"refunds":[]}}
   

##updated inventory 

 - % curl -XGET -H "Content-type: application/json" -d '{}' http://127.0.0.1:8080/mishipay/inventory | json_pp
 
 
   {
      "inventory_items" : [
         {
            "quantity" : "88",
            "admin_graphql_api_id" : "gid://shopify/InventoryItem/33032334901315",
            "country_harmonized_system_codes" : [],
            "sku" : "ONEPLUS",
            "created_at" : "2020-02-27T11:28:22-05:00",
            "requires_shipping" : true,
            "tracked" : true,
            "id" : 33032334901315,
            "updated_at" : "2020-02-27T11:28:22-05:00",
            "cost" : "40000.00"
         },
         {
            "country_harmonized_system_codes" : [],
            "quantity" : "16",
            "admin_graphql_api_id" : "gid://shopify/InventoryItem/33032802566211",
            "sku" : "ONEPLUS",
            "tracked" : true,
            "created_at" : "2020-02-27T12:45:17-05:00",
            "requires_shipping" : true,
            "cost" : "40000.00",
            "id" : 33032802566211,
            "updated_at" : "2020-02-27T12:45:17-05:00"
         }
      ]
   }
