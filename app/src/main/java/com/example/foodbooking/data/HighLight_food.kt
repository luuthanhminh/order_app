package com.example.foodbooking.data


class HighLight_food{
     var ImageHighlightFood :String
     var NameHighlightFood :String
     var PriceFood :String

     var LogoHighlightRestaurant :String
     var NameHighlightRestaurant :String
     var DetailHighlightRestaurant :String

    constructor(imgHighLightFood :String,nameFood :String, priceFood :String, logoHighLight:String, nameRestaurant:String, detailRestaurant:String){
        this.NameHighlightFood = nameFood
        this.PriceFood = priceFood
        this.NameHighlightRestaurant = nameRestaurant
        this.DetailHighlightRestaurant = detailRestaurant
        this.ImageHighlightFood = imgHighLightFood
        this.LogoHighlightRestaurant = logoHighLight
    }
}