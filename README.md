##inventory
curl -XGET -H "Content-type: application/json" -d '{}' http://127.0.0.1:8080/mishipay/inventory

##order

curl -XPOST -H "Content-type: application/json" -d '[{"variant_id":33032334901315,"quantity":2,"price":"40000.00"},{"variant_id":33032802566211,"quantity":1,"price":"40000.00"}]' http://127.0.0.1:8080/mishipay/order