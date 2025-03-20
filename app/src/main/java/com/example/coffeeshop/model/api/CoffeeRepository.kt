package com.example.coffeeshop.model.api

import com.example.coffeeshop.R
import com.example.coffeeshop.model.entities.Coffee
import javax.inject.Inject

class CoffeeRepository@Inject constructor() {
    private val coffeeList = MockData.coffeeList


    fun getCoffeeMenu(): List<Coffee> {
        return coffeeList.sortedBy { it.type }
    }

    fun makeOrder(){

    }
}