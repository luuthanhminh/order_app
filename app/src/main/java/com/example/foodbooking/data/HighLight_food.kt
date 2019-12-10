package com.example.foodbooking.data


class HighLight_food{
    lateinit var ImageHighlightFood :String
    lateinit var NameHighlightFood :String
    lateinit var CostFood :String

    lateinit var LogoHighlightRestaurant :String
    lateinit var NameHighlightRestaurant :String
    lateinit var DetailHighlightRestaurant :String

    constructor(nameFood :String, costFood :String, nameRestaurant:String, detailRestaurant:String){
        this.NameHighlightFood = nameFood
        this.CostFood = costFood
        this.NameHighlightRestaurant = nameRestaurant
        this.DetailHighlightRestaurant = detailRestaurant
    }
}