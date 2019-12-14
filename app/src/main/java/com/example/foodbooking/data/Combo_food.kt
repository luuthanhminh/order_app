package com.example.foodbooking.data

class Combo_food {
    lateinit var ImagePro: String
    lateinit var NamePro: String
    lateinit var CostPro: String
    lateinit var Promotions: ArrayList<Promotion>
    lateinit var AddressPro: String
    lateinit var CusinesPro: String

    constructor(
        imagePro: String,
        namePro: String,
        costPro: String,
        promotions: ArrayList<Promotion>,
        addressPro: String,
        cusinesPro: String
    ) {
        this.ImagePro = imagePro
        this.NamePro = namePro
        this.AddressPro = addressPro
        this.CostPro = costPro
        this.Promotions = promotions
        this.CusinesPro = cusinesPro

    }
}

class Promotion(val icon: String, val distcount: String)