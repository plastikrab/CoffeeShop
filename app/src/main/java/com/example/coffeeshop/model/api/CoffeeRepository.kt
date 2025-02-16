package com.example.coffeeshop.model.api

import com.example.coffeeshop.R
import com.example.coffeeshop.model.entities.Coffee
import javax.inject.Inject

class CoffeeRepository@Inject constructor() {
    private val loremIpsum = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Maecenas quis feugiat libero. Maecenas posuere tempus nibh ut maximus. Donec ac neque dapibus, laoreet sapien sed, scelerisque ipsum. Sed quis luctus tortor. Vivamus dapibus tristique massa quis blandit. Suspendisse sed massa diam. Proin in justo semper, feugiat turpis et, vestibulum ex. In dapibus venenatis libero eget eleifend. Aliquam facilisis porttitor nisl in feugiat. In hac habitasse platea dictumst. Aenean tempus euismod lectus ac semper. Quisque nec ligula et nisi finibus commodo eu quis nunc. Praesent eget rhoncus lacus."
    private val coffeeList = listOf(
        Coffee(
            name = "Caffe Mocha",
            description = loremIpsum,
            price = 4.53,
            image = R.drawable.property_1_coffee__property_2_1,
            type = "Deep Foam",
            rating = 4.8
        ),
        Coffee(
            name = "Flat White",
            description = loremIpsum,
            price = 3.53,
            image = R.drawable.property_1_coffee__property_2_2,
            type = "Espresso",
            rating = 4.5
        ),
        Coffee(
            name = "Americano",
            description = loremIpsum,
            price = 2.53,
            image = R.drawable.property_1_coffee__property_2_3,
            type = "Espresso",
            rating = 4.2
        ),
        Coffee(
            name = "Cappuccino",
            description = loremIpsum,
            price = 3.83,
            image = R.drawable.property_1_coffee__property_2_4,
            type = "Deep Foam",
            rating = 4.6
        ),
        Coffee(
            name = "Iced Latte",
            description = loremIpsum,
            price = 4.03,
            image = R.drawable.property_1_coffee__property_2_5,
            type = "Iced",
            rating = 4.3
        ),
        Coffee(
            name = "Cold Brew",
            description = loremIpsum,
            price = 4.33,
            image = R.drawable.property_1_coffee__property_2_1,
            type = "Cold Brew",
            rating = 4.7
        ),
        Coffee(
            name = "Espresso",
            description = loremIpsum,
            price = 2.03,
            image = R.drawable.property_1_coffee__property_2_2,
            type = "Espresso",
            rating = 4.4
        ),
        Coffee(
            name = "Macchiato",
            description = loremIpsum,
            price = 3.03,
            image = R.drawable.property_1_coffee__property_2_3,
            type = "Deep Foam",
            rating = 4.0
        ),
        Coffee(
            name = "Ristretto",
            description = loremIpsum,
            price = 2.33,
            image = R.drawable.property_1_coffee__property_2_4,
            type = "Espresso",
            rating = 4.1
        ),
        Coffee(
            name = "Lungo",
            description = loremIpsum,
            price = 2.83,
            image = R.drawable.property_1_coffee__property_2_5,
            type = "Espresso",
            rating = 3.9
        ),
        Coffee(
            name = "Doppio",
            description = loremIpsum,
            price = 3.33,
            image = R.drawable.property_1_coffee__property_2_1,
            type = "Espresso",
            rating = 4.3
        ),
        Coffee(
            name = "Cortado",
            description = loremIpsum,
            price = 3.23,
            image = R.drawable.property_1_coffee__property_2_2,
            type = "Espresso",
            rating = 4.2
        ),
        Coffee(
            name = "Red Eye",
            description = loremIpsum,
            price = 3.73,
            image = R.drawable.property_1_coffee__property_2_3,
            type = "Drip",
            rating = 4.0
        ),
        Coffee(
            name = "Irish Coffee",
            description = loremIpsum,
            price = 5.03,
            image = R.drawable.property_1_coffee__property_2_4,
            type = "Alcoholic",
            rating = 4.5
        ),
        Coffee(
            name = "Affogato",
            description = loremIpsum,
            price = 4.83,
            image = R.drawable.property_1_coffee__property_2_5,
            type = "Dessert",
            rating = 4.7
        )
    )


    fun getCoffeeMenu(): List<Coffee> {
        return coffeeList.sortedBy { it.type }
    }

    fun makeOrder(){

    }
}