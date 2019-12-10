package com.example.foodbooking.data

class Plan_food{
    lateinit var ImageFood :String
    lateinit var NameFood :String
    lateinit var DetailFood :String

    lateinit var LogoRestaurant :String
    lateinit var NameRestaurant :String
    lateinit var DetailRestaurant :String

    constructor(nameFood :String, detailFood :String, nameRestaurant:String, detailRestaurant:String){
        this.NameFood = nameFood
        this.DetailFood = detailFood
        this.NameRestaurant = nameRestaurant
        this.DetailRestaurant = detailRestaurant
    }
}