package com.example.foodbooking.data

class Combo_food{
    lateinit var ImageCbFood :String
    lateinit var NameCbFood :String
    lateinit var CostCbFood :String
    lateinit var food1 :String
    lateinit var LogocbRestaurant :String
    lateinit var NamecbRestaurant :String
    lateinit var DetailcbRestaurant :String

    constructor(nameCbFood :String, costCbFood :String,food1 :String,nameCbRes :String,detailCbRes :String){
        this.NameCbFood = nameCbFood
        this.CostCbFood = costCbFood
        this.food1 = food1
        this.NamecbRestaurant = nameCbRes
        this.DetailcbRestaurant = detailCbRes

    }
}