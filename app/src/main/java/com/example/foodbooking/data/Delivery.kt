package com.example.foodbooking.data

class Delivery{
    lateinit var DeliveryName:String
    lateinit var DeliveryId :Number
    lateinit var DeliveryDescription:String
    lateinit var DeliveryPrice:String
    lateinit var DeliveryImage:String

    constructor(
        DeliveryName: String,
        DeliveryId: Number,
        DeliveryDescription: String,
        DeliveryPrice: String,
        DeliveryImage: String
    ) {
        this.DeliveryName = DeliveryName
        this.DeliveryId = DeliveryId
        this.DeliveryDescription = DeliveryDescription
        this.DeliveryPrice = DeliveryPrice
        this.DeliveryImage = DeliveryImage
    }
}
//class price(val text:String,val unit:String,val value:Int)