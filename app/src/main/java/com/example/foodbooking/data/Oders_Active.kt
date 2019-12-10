package com.example.foodbooking.data

class Oders_Active{
    lateinit var ImageOrderActive :String
    lateinit var NameOrderActive :String
    lateinit var CostOrderActive :String
    lateinit var CountOrderACtive :String


    constructor(nameOdersActive :String, countOrderActive :String,costOrderActive:String){
        this.NameOrderActive = nameOdersActive
        this.CountOrderACtive = countOrderActive
        this.CostOrderActive = costOrderActive
    }
}