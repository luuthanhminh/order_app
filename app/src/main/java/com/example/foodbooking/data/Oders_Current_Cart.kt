package com.example.foodbooking.data

class Oders_Current_Cart{
    lateinit var ImageCurrenCart :String
    lateinit var NameCurrenCart :String
    lateinit var CostCurrenCart :String
    var CountCurrenCart :Int = 0

    constructor(nameCurrenCart:String,costCurrenCart:String){
        this.NameCurrenCart = nameCurrenCart
        this.CostCurrenCart = costCurrenCart

    }
}