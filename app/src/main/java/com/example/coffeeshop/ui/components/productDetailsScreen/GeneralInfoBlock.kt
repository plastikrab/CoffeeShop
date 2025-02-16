package com.example.coffeeshop.ui.components.productDetailsScreen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.coffeeshop.R
import com.example.coffeeshop.model.entities.Coffee
import com.example.coffeeshop.ui.theme.ContainerUnselected
import com.example.coffeeshop.ui.theme.White
import com.example.coffeeshop.ui.theme.Yellow
import com.example.coffeeshop.ui.theme.myTypography

@Composable
fun GeneralInfoBlock(
    modifier: Modifier = Modifier,
    coffee: Coffee
) {

    Column(
        modifier = modifier
            .fillMaxWidth()
    ) {
        Text(
            text = coffee.name,
            style = myTypography.bodyTitle,
            modifier = Modifier
                .padding(top = 16.dp)
        )
        Text(
            text = coffee.type,
            style = myTypography.coffeeType,
            modifier = Modifier
                .padding(top = 8.dp)
        )
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .padding(top = 16.dp)
        ) {
            Icon(
                painter = painterResource(R.drawable.star),
                contentDescription = "",
                tint = Yellow,
                modifier = Modifier
                    .padding(top = 8.dp)
                    .size(20.dp)
            )
            Text(
                text = coffee.rating.toString(),
                style = myTypography.bodyRating,
                modifier = Modifier
                    .padding(top = 8.dp, start = 4.dp)
            )
        }
        Spacer(
            modifier = Modifier
                .align(Alignment.CenterHorizontally)
                .padding(top = 16.dp)
                .fillMaxWidth(0.9f)
                .height(1.dp)
                .background(ContainerUnselected)
        )
    }
}

@Preview
@Composable
private fun Prev() {
    Box(
        modifier = Modifier
            .background(White)
            .fillMaxWidth()
    ){
        GeneralInfoBlock(
            coffee = Coffee(
                name = "Caffe Mocha",
                description = "Эспрессо с шоколадным сиропом и молоком",
                price = 4.53,
                image = R.drawable.property_1_coffee__property_2_1,
                type = "Deep Foam",
                rating = 4.8
            )
        )

    }

}