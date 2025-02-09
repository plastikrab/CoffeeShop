package com.example.coffeeshop.model.entities

data class Coffee(
    val name: String,
    val description: String,
    val price: Double,
    val image: Int,
    val type: String,
    val rating: Double
)
