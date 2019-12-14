package com.example.foodbooking.data

class Category_foods_detail {
    lateinit var ImageCateFood: String
    lateinit var NameCateFood: String
    lateinit var PriceCateFood: String

    lateinit var LogoCateFoodRestaurant: String
    lateinit var NameCateFoodRestaurant: String
    lateinit var DetailCateFood: String
    lateinit var CusecuisCateFood: String

    constructor(
        imgCateFoodd: String,
        nameCateFood: String,
        priceCateFood: String,
        detailCateFood: String,
        logoCateFood: String,
        nameCateFoodres: String,
        cusecuiCateFood:String
    ) {
        this.ImageCateFood = imgCateFoodd
        this.NameCateFood = nameCateFood
        this.PriceCateFood = priceCateFood
        this.DetailCateFood = detailCateFood
        this.LogoCateFoodRestaurant = logoCateFood
        this.NameCateFoodRestaurant = nameCateFoodres
        this.CusecuisCateFood = cusecuiCateFood
    }
}