package com.example.coffeeshop.ui.components.menuScreen

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.coffeeshop.R
import com.example.coffeeshop.model.entities.Coffee
import com.example.coffeeshop.ui.theme.White
import com.example.coffeeshop.ui.theme.Yellow
import com.example.coffeeshop.ui.theme.myTypography

@Composable
fun CoffeeCard(
    coffee: Coffee,
    modifier: Modifier = Modifier,
    onAddToCart: (Coffee) -> Unit = {},
    onInfoClick: (Coffee) -> Unit = {}
) {
    Card(
        modifier = modifier
            .size(width = 156.dp, height = 238.dp)
            .clickable {
                onInfoClick(coffee)
            },
        colors = CardDefaults.cardColors(
            containerColor = White
        )
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(7.dp),
        ) {
            Box(
                modifier = Modifier
                    .align(CenterHorizontally)
            ){
                Image(
                    painter = painterResource(id = coffee.image),
                    contentDescription = null,
                    modifier = Modifier
                        .clip(RoundedCornerShape(12.dp))
                        .size(width = 140.dp, height = 128.dp)
                        .align(Alignment.Center),
                    contentScale = ContentScale.Crop
                )
                Column(
                    modifier = Modifier
                        .fillMaxWidth(),
                    horizontalAlignment = Alignment.End
                ){
                    Row(
                        modifier = Modifier
                            .padding(end = 10.dp, top = 8.dp),
                        verticalAlignment = Alignment.CenterVertically,
                    ) {
                        Icon(
                            painter = painterResource(id = com.example.coffeeshop.R.drawable.star),
                            contentDescription = null,
                            modifier = Modifier
                                .size(10.dp),
                            tint = Yellow
                        )
                        Text(
                            text = coffee.rating.toString(),
                            style = myTypography.coffeeCardRating,
                            modifier = Modifier
                                .padding(start = 4.dp, top = 1.dp),

                        )
                    }
                }
            }
            Column(

            ){
                Text(
                    text = coffee.name,
                    style = myTypography.coffeeCardName,
                    modifier = Modifier
                        .padding(top = 10.dp, bottom = 6.dp)
                )
                Text(
                    text = coffee.type,
                    style = myTypography.coffeeCardType,
                    modifier = Modifier
                        .padding(bottom = 8.dp)
                )
            }
            Row(
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text = "$"+ coffee.price.toString(),
                    style = myTypography.coffeeCardPrice,
                    modifier = Modifier
                        .weight(1f)
                )
                IconButton(
                    onClick = {

                    }
                ) {
                    Image(
                        painter = painterResource(
                            id = com.example.coffeeshop.R.drawable.type_default__library_plus),
                        contentDescription = null,
                        modifier = Modifier
                            .size(32.dp)
                    )
                }
            }
        }
    }
}

@Preview
@Composable
private fun prev() {

    CoffeeCard(
        coffee = Coffee(
            name = "Caffe Mocha",
            description = "Description",
            price = 4.53,
            image = R.drawable.property_1_coffee__property_2_1,
            type = "Deep Foam",
            rating = 4.8
        )
    )


}