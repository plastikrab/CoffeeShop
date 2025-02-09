package com.example.coffeeshop.model.api

import com.example.coffeeshop.R
import com.example.coffeeshop.model.entities.Coffee
import javax.inject.Inject

class CoffeeRepository@Inject constructor() {

    private val coffeeList = listOf(
        Coffee(
            name = "Caffe Mocha",
            description = "Эспрессо с шоколадным сиропом и молоком",
            price = 4.53,
            image = R.drawable.property_1_coffee__property_2_1,
            type = "Deep Foam",
            rating = 4.8
        ),
        Coffee(
            name = "Flat White",
            description = "Двойной эспрессо с тонким слоем молока",
            price = 3.53,
            image = R.drawable.property_1_coffee__property_2_2,
            type = "Espresso",
            rating = 4.5
        ),
        Coffee(
            name = "Americano",
            description = "Эспрессо, разбавленный горячей водой",
            price = 2.53,
            image = R.drawable.property_1_coffee__property_2_3,
            type = "Espresso",
            rating = 4.2
        ),
        Coffee(
            name = "Cappuccino",
            description = "Эспрессо с молоком и пенкой",
            price = 3.83,
            image = R.drawable.property_1_coffee__property_2_4,
            type = "Deep Foam",
            rating = 4.6
        ),
        Coffee(
            name = "Iced Latte",
            description = "Эспрессо с молоком и льдом",
            price = 4.03,
            image = R.drawable.property_1_coffee__property_2_5,
            type = "Iced",
            rating = 4.3
        ),
        Coffee(
            name = "Cold Brew",
            description = "Кофе, заваренный холодным способом",
            price = 4.33,
            image = R.drawable.property_1_coffee__property_2_1, // Пример чередования
            type = "Cold Brew",
            rating = 4.7
        ),
        Coffee(
            name = "Espresso",
            description = "Концентрированный кофейный напиток",
            price = 2.03,
            image = R.drawable.property_1_coffee__property_2_2, // Пример чередования
            type = "Espresso",
            rating = 4.4
        ),
        Coffee(
            name = "Macchiato",
            description = "Эспрессо с небольшим количеством пенки",
            price = 3.03,
            image = R.drawable.property_1_coffee__property_2_3, // Пример чередования
            type = "Deep Foam",
            rating = 4.0
        ),
        Coffee(
            name = "Ristretto",
            description = "Более концентрированный эспрессо",
            price = 2.33,
            image = R.drawable.property_1_coffee__property_2_4, // Пример чередования
            type = "Espresso",
            rating = 4.1
        ),
        Coffee(
            name = "Lungo",
            description = "Эспрессо, приготовленный с большим количеством воды",
            price = 2.83,
            image = R.drawable.property_1_coffee__property_2_5, // Пример чередования
            type = "Espresso",
            rating = 3.9
        ),
        Coffee(
            name = "Doppio",
            description = "Двойной эспрессо",
            price = 3.33,
            image = R.drawable.property_1_coffee__property_2_1, // Пример чередования
            type = "Espresso",
            rating = 4.3
        ),
        Coffee(
            name = "Cortado",
            description = "Эспрессо с небольшим количеством теплого молока",
            price = 3.23,
            image = R.drawable.property_1_coffee__property_2_2, // Пример чередования
            type = "Espresso",
            rating = 4.2
        ),
        Coffee(
            name = "Red Eye",
            description = "Кофе с добавлением эспрессо",
            price = 3.73,
            image = R.drawable.property_1_coffee__property_2_3, // Пример чередования
            type = "Drip",
            rating = 4.0
        ),
        Coffee(
            name = "Irish Coffee",
            description = "Кофе с виски и сливками",
            price = 5.03,
            image = R.drawable.property_1_coffee__property_2_4, // Пример чередования
            type = "Alcoholic",
            rating = 4.5
        ),
        Coffee(
            name = "Affogato",
            description = "Эспрессо с шариком мороженого",
            price = 4.83,
            image = R.drawable.property_1_coffee__property_2_5, // Пример чередования
            type = "Dessert",
            rating = 4.7
        )
    )


    fun getCoffeeMenu(): List<Coffee> {
        return coffeeList.sortedBy { it.type }
    }
}