package com.example.foodbooking.data

class Plan_food{
    lateinit var ImagePlanFood :String
    lateinit var NamePlanFood :String
    lateinit var DetailPlanFood :String
    lateinit var CuisicesPlan :String
    lateinit var AddressPlan :String

    constructor(imgPlan:String,nameFood :String, detailFood :String, cuisices:String, addressPlan:String){
        this.ImagePlanFood = imgPlan
        this.NamePlanFood = nameFood
        this.DetailPlanFood = detailFood
        this.CuisicesPlan = cuisices
        this.AddressPlan = addressPlan

    }
}