package com.example.coffeeshop.model.api

import com.example.coffeeshop.R
import com.example.coffeeshop.model.entities.Coffee

object MockData {

    private val loremIpsum = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Maecenas quis feugiat libero. Maecenas posuere tempus nibh ut maximus. Donec ac neque dapibus, laoreet sapien sed, scelerisque ipsum. Sed quis luctus tortor. Vivamus dapibus tristique massa quis blandit. Suspendisse sed massa diam. Proin in justo semper, feugiat turpis et, vestibulum ex. In dapibus venenatis libero eget eleifend. Aliquam facilisis porttitor nisl in feugiat. In hac habitasse platea dictumst. Aenean tempus euismod lectus ac semper. Quisque nec ligula et nisi finibus commodo eu quis nunc. Praesent eget rhoncus lacus."
    val coffeeList = listOf(
        // Espresso
        Coffee(
            name = "Espresso",
            description = loremIpsum,
            price = 2.50,
            image = R.drawable.property_1_coffee__property_2_1,
            type = "Espresso",
            rating = 4.5
        ),
        Coffee(
            name = "Doppio",
            description = loremIpsum,
            price = 3.50,
            image = R.drawable.property_1_coffee__property_2_2,
            type = "Espresso",
            rating = 4.7
        ),
        Coffee(
            name = "Ristretto",
            description = loremIpsum,
            price = 2.80,
            image = R.drawable.property_1_coffee__property_2_3,
            type = "Espresso",
            rating = 4.6
        ),
        Coffee(
            name = "Lungo",
            description = loremIpsum,
            price = 3.00,
            image = R.drawable.property_1_coffee__property_2_4,
            type = "Espresso",
            rating = 4.4
        ),
        Coffee(
            name = "Macchiato",
            description = loremIpsum,
            price = 3.20,
            image = R.drawable.property_1_coffee__property_2_5,
            type = "Espresso",
            rating = 4.3
        ),
        Coffee(
            name = "Cortado",
            description = loremIpsum,
            price = 3.30,
            image = R.drawable.property_1_coffee__property_2_1,
            type = "Espresso",
            rating = 4.4
        ),
        Coffee(
            name = "Americano",
            description = loremIpsum,
            price = 3.00,
            image = R.drawable.property_1_coffee__property_2_2,
            type = "Espresso",
            rating = 4.2
        ),
        Coffee(
            name = "Red Eye",
            description = loremIpsum,
            price = 3.75,
            image = R.drawable.property_1_coffee__property_2_3,
            type = "Espresso",
            rating = 4.0
        ),

        //Milk Based
        Coffee(
            name = "Latte",
            description = loremIpsum,
            price = 4.00,
            image = R.drawable.property_1_coffee__property_2_4,
            type = "Milk Based",
            rating = 4.5
        ),
        Coffee(
            name = "Cappuccino",
            description = loremIpsum,
            price = 4.20,
            image = R.drawable.property_1_coffee__property_2_5,
            type = "Milk Based",
            rating = 4.6
        ),
        Coffee(
            name = "Flat White",
            description = loremIpsum,
            price = 4.30,
            image = R.drawable.property_1_coffee__property_2_1,
            type = "Milk Based",
            rating = 4.7
        ),
        Coffee(
            name = "Mocha",
            description = loremIpsum,
            price = 4.50,
            image = R.drawable.property_1_coffee__property_2_2,
            type = "Milk Based",
            rating = 4.8
        ),
        Coffee(
            name = "Caramel Macchiato",
            description = loremIpsum,
            price = 4.70,
            image = R.drawable.property_1_coffee__property_2_3,
            type = "Milk Based",
            rating = 4.6
        ),
        Coffee(
            name = "Vanilla Latte",
            description = loremIpsum,
            price = 4.40,
            image = R.drawable.property_1_coffee__property_2_4,
            type = "Milk Based",
            rating = 4.5
        ),
        Coffee(
            name = "Almond Milk Latte",
            description = loremIpsum,
            price = 4.60,
            image = R.drawable.property_1_coffee__property_2_5,
            type = "Milk Based",
            rating = 4.4
        ),
        Coffee(
            name = "Oat Milk Latte",
            description = loremIpsum,
            price = 4.80,
            image = R.drawable.property_1_coffee__property_2_1,
            type = "Milk Based",
            rating = 4.7
        ),

        //Iced Coffee
        Coffee(
            name = "Iced Latte",
            description = loremIpsum,
            price = 4.20,
            image = R.drawable.property_1_coffee__property_2_2,
            type = "Iced",
            rating = 4.4
        ),
        Coffee(
            name = "Iced Coffee",
            description = loremIpsum,
            price = 3.50,
            image = R.drawable.property_1_coffee__property_2_3,
            type = "Iced",
            rating = 4.2
        ),
        Coffee(
            name = "Cold Brew",
            description = loremIpsum,
            price = 4.50,
            image = R.drawable.property_1_coffee__property_2_4,
            type = "Iced",
            rating = 4.7
        ),
        Coffee(
            name = "Iced Americano",
            description = loremIpsum,
            price = 3.70,
            image = R.drawable.property_1_coffee__property_2_5,
            type = "Iced",
            rating = 4.3
        ),
        Coffee(
            name = "Iced Mocha",
            description = loremIpsum,
            price = 4.80,
            image = R.drawable.property_1_coffee__property_2_1,
            type = "Iced",
            rating = 4.6
        ),
        Coffee(
            name = "Iced Caramel Macchiato",
            description = loremIpsum,
            price = 5.00,
            image = R.drawable.property_1_coffee__property_2_2,
            type = "Iced",
            rating = 4.5
        ),
        Coffee(
            name = "Thai Iced Coffee",
            description = loremIpsum,
            price = 4.70,
            image = R.drawable.property_1_coffee__property_2_3,
            type = "Iced",
            rating = 4.8
        ),
        Coffee(
            name = "Vietnamese Iced Coffee",
            description = loremIpsum,
            price = 4.60,
            image = R.drawable.property_1_coffee__property_2_4,
            type = "Iced",
            rating = 4.7
        ),

        // Drip Coffee
        Coffee(
            name = "Drip Coffee",
            description = loremIpsum,
            price = 2.75,
            image = R.drawable.property_1_coffee__property_2_5,
            type = "Drip",
            rating = 4.1
        ),
        Coffee(
            name = "French Press",
            description = loremIpsum,
            price = 3.25,
            image = R.drawable.property_1_coffee__property_2_1,
            type = "Drip",
            rating = 4.3
        ),
        Coffee(
            name = "Pour Over",
            description = loremIpsum,
            price = 3.00,
            image = R.drawable.property_1_coffee__property_2_2,
            type = "Drip",
            rating = 4.2
        ),
        Coffee(
            name = "Cold Brew Drip",
            description = loremIpsum,
            price = 4.00,
            image = R.drawable.property_1_coffee__property_2_3,
            type = "Drip",
            rating = 4.5
        ),
        Coffee(
            name = "Aeropress",
            description = loremIpsum,
            price = 3.50,
            image = R.drawable.property_1_coffee__property_2_4,
            type = "Drip",
            rating = 4.4
        ),
        Coffee(
            name = "Batch Brew",
            description = loremIpsum,
            price = 2.90,
            image = R.drawable.property_1_coffee__property_2_5,
            type = "Drip",
            rating = 4.0
        ),
        Coffee(
            name = "Filter Coffee",
            description = loremIpsum,
            price = 3.10,
            image = R.drawable.property_1_coffee__property_2_1,
            type = "Drip",
            rating = 4.2
        ),
        Coffee(
            name = "Siphon Coffee",
            description = loremIpsum,
            price = 4.50,
            image = R.drawable.property_1_coffee__property_2_2,
            type = "Drip",
            rating = 4.6
        ),

        //Alcoholic Coffee
        Coffee(
            name = "Irish Coffee",
            description = loremIpsum,
            price = 6.00,
            image = R.drawable.property_1_coffee__property_2_3,
            type = "Alcoholic",
            rating = 4.7
        ),
        Coffee(
            name = "Espresso Martini",
            description = loremIpsum,
            price = 7.00,
            image = R.drawable.property_1_coffee__property_2_4,
            type = "Alcoholic",
            rating = 4.8
        ),
        Coffee(
            name = "Coffee Old Fashioned",
            description = loremIpsum,
            price = 8.00,
            image = R.drawable.property_1_coffee__property_2_5,
            type = "Alcoholic",
            rating = 4.9
        ),
        Coffee(
            name = "White Russian Coffee",
            description = loremIpsum,
            price = 6.50,
            image = R.drawable.property_1_coffee__property_2_1,
            type = "Alcoholic",
            rating = 4.6
        ),
        Coffee(
            name = "Black Russian Coffee",
            description = loremIpsum,
            price = 6.20,
            image = R.drawable.property_1_coffee__property_2_2,
            type = "Alcoholic",
            rating = 4.5
        ),
        Coffee(
            name = "Kahlua Coffee",
            description = loremIpsum,
            price = 5.80,
            image = R.drawable.property_1_coffee__property_2_3,
            type = "Alcoholic",
            rating = 4.4
        ),
        Coffee(
            name = "Bailey's Coffee",
            description = loremIpsum,
            price = 6.30,
            image = R.drawable.property_1_coffee__property_2_4,
            type = "Alcoholic",
            rating = 4.7
        ),
        Coffee(
            name = "Corretto",
            description = loremIpsum,
            price = 5.50,
            image = R.drawable.property_1_coffee__property_2_5,
            type = "Alcoholic",
            rating = 4.3
        ),

        //Flavored Coffee
        Coffee(
            name = "Vanilla Coffee",
            description = loremIpsum,
            price = 3.80,
            image = R.drawable.property_1_coffee__property_2_1,
            type = "Flavored",
            rating = 4.4
        ),
        Coffee(
            name = "Hazelnut Coffee",
            description = loremIpsum,
            price = 3.90,
            image = R.drawable.property_1_coffee__property_2_2,
            type = "Flavored",
            rating = 4.5
        ),
        Coffee(
            name = "Caramel Coffee",
            description = loremIpsum,
            price = 4.00,
            image = R.drawable.property_1_coffee__property_2_3,
            type = "Flavored",
            rating = 4.6
        ),
        Coffee(
            name = "Mocha Coffee",
            description = loremIpsum,
            price = 4.20,
            image = R.drawable.property_1_coffee__property_2_4,
            type = "Flavored",
            rating = 4.7
        ),
        Coffee(
            name = "Pumpkin Spice Latte",
            description = loremIpsum,
            price = 4.50,
            image = R.drawable.property_1_coffee__property_2_5,
            type = "Flavored",
            rating = 4.8
        ),
        Coffee(
            name = "Peppermint Mocha",
            description = loremIpsum,
            price = 4.40,
            image = R.drawable.property_1_coffee__property_2_1,
            type = "Flavored",
            rating = 4.7
        ),
        Coffee(
            name = "Cinnamon Coffee",
            description = loremIpsum,
            price = 3.70,
            image = R.drawable.property_1_coffee__property_2_2,
            type = "Flavored",
            rating = 4.3
        ),
        Coffee(
            name = "Butterscotch Coffee",
            description = loremIpsum,
            price = 4.10,
            image = R.drawable.property_1_coffee__property_2_3,
            type = "Flavored",
            rating = 4.5
        )
    )


}