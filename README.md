# sell
Spring Boot Enterprise WeChat Food Ordering System<br>

## API

### Product List

```
GET /sell/buyer/product/list
```

Parameters

```
None
```

Response

```
{
    "code": 0,
    "msg": "Success",
    "data": [
        {
            "name": "Hot List",
            "type": 1,
            "foods": [
                {
                    "id": "123456",
                    "name": "Century Egg Porridge",
                    "price": 1.2,
                    "description": "Delicious century egg porridge",
                    "icon": "http://xxx.com",
                }
            ]
        },
        {
            "name": "Delicious",
            "type": 2,
            "foods": [
                {
                    "id": "123457",
                    "name": "Mousse Cake",
                    "price": 10.9,
                    "description": "Delicious and refreshing",
                    "icon": "http://xxx.com",
                }
            ]
        }
    ]
}
```


### Create Order

```
POST /sell/buyer/order/create
```

Parameters

```
name: "Andy Wang"
phone: "6510000000"
address: "Andy Home"
openid: "ew3euwhd7sjw9diwkq" // User's WeChat OpenID
items: [{
    productId: "1423113435324",
    productQuantity: 2 // Purchase quantity
}]

```

Response

```
{
  "code": 0,
  "msg": "Success",
  "data": {
      "orderId": "147283992738221" 
  }
}
```

### Order List

```
GET /sell/buyer/order/list
```

Parameters

```
openid: 18eu2jwk2kse3r42e2e
page: 0 // Starting from page 0
size: 10
```

Response

```
{
  "code": 0,
  "msg": "Success",
  "data": [
    {
      "orderId": "161873371171128075",
      "buyerName": "Andy Wang",
      "buyerPhone": "651000000",
      "buyerAddress": "Andy Home",
      "buyerOpenid": "18eu2jwk2kse3r42e2e",
      "orderAmount": 0,
      "orderStatus": 0,
      "payStatus": 0,
      "createTime": 1490171219,
      "updateTime": 1490171219,
      "orderDetailList": null
    },
    {
      "orderId": "161873371171128076",
      "buyerName": "Andy Wang",
      "buyerPhone": "651000000",
      "buyerAddress": "Andy Home",
      "buyerOpenid": "18eu2jwk2kse3r42e2e",
      "orderAmount": 0,
      "orderStatus": 0,
      "payStatus": 0,
      "createTime": 1490171219,
      "updateTime": 1490171219,
      "orderDetailList": null
    }]
}
```

### Query Order Details

```
GET /sell/buyer/order/detail
```

Parameters

```
openid: 18eu2jwk2kse3r42e2e
orderId: 161899085773669363
```

Response

```
{
    "code": 0,
    "msg": "Success",
    "data": {
          "orderId": "161899085773669363",
          "buyerName": "Mark Lee",
          "buyerPhone": "18868877111",
          "buyerAddress": "Mark House",
          "buyerOpenid": "18eu2jwk2kse3r42e2e",
          "orderAmount": 18,
          "orderStatus": 0,
          "payStatus": 0,
          "createTime": 1490177352,
          "updateTime": 1490177352,
          "orderDetailList": [
            {
                "detailId": "161899085974995851",
                "orderId": "161899085773669363",
                "productId": "157875196362360019",
                "productName": "Signature Milk Tea",
                "productPrice": 9,
                "productQuantity": 2,
                "productIcon": "http://xxx.com",
                "productImage": "http://xxx.com"
            }
        ]
    }
}
```

### Cancel Order

```
POST /sell/buyer/order/cancel
```

Parameters

```
openid: 18eu2jwk2kse3r42e2e
orderId: 161899085773669363
```

Response

```
{
    "code": 0,
    "msg": "Success",
    "data": null
}
```

### Get OpenID

```
Redirect to /sell/wechat/authorize
```

Parameters

```
returnUrl: http://xxx.com/abc  // [Required]
```

Response

```
http://xxx.com/abc?openid=oZxSYw5ldcxv6H0EU67GgSXOUrVg
```

### Pay for Order
```
Redirect /sell/pay/create
```

Parameters

```
orderId: 161899085773669363
returnUrl: http://xxx.com/abc/order/161899085773669363
```

Response

```
http://xxx.com/abc/order/161899085773669363
```
