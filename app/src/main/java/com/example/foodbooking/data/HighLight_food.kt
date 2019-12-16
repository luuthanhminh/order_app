package com.example.foodbooking.data


class HighLight_food{
     var ImageHighlightFood :String
     var NameHighlightFood :String
     var PriceFood :priceHighliht
     var LogoHighlightRestaurant :String
     var NameHighlightRestaurant :String
     var DetailHighlightRestaurant :String
     var CuisicuiHighLightRestaurant:String
    constructor(imgHighLightFood :String,nameFood :String, priceFood :priceHighliht, logoHighLight:String, nameRestaurant:String, detailRestaurant:String, cusecui:String){
        this.NameHighlightFood = nameFood
        this.PriceFood = priceFood
        this.NameHighlightRestaurant = nameRestaurant
        this.DetailHighlightRestaurant = detailRestaurant
        this.ImageHighlightFood = imgHighLightFood
        this.LogoHighlightRestaurant = logoHighLight
        this.CuisicuiHighLightRestaurant = cusecui
    }
}
class priceHighliht(val text:String, val unit:String,value:Int)