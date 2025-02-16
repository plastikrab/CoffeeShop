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
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.coffeeshop.R
import com.example.coffeeshop.model.entities.Coffee
import com.example.coffeeshop.ui.theme.Primary
import com.example.coffeeshop.ui.theme.myTypography

@Composable
fun PriceBottomPanel(
    modifier: Modifier = Modifier,
    coffee : Coffee
) {

    Box(
        modifier = modifier
            .fillMaxWidth()
            .height(130.dp)
            .clip(RoundedCornerShape(topStart = 24.dp, topEnd = 24.dp))
            .background(Color.White)
    ){
        Row(
            modifier = Modifier
                .width(330.dp)
                .padding(top = 15.dp)
                .align(Alignment.TopCenter),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Column {
                Text(
                    text = "Price",
                    style = myTypography.bodyText
                )
                Text(
                    text = "$ ${coffee.price.toString()}",
                    style = myTypography.bodyPrice,
                    modifier = Modifier
                        .padding(top = 3.dp)
                )
            }
            Spacer(modifier = Modifier.weight(1f))
            Button(
                shape = RoundedCornerShape(10.dp),
                onClick = {},
                colors = ButtonDefaults.buttonColors(
                    containerColor = Primary
                ),
                modifier = Modifier
                    .size(215.dp, 55.dp)

            ) {
                Text(
                    text = "Buy Now",
                    style = myTypography.typeSelected
                )
            }
        }
    }

}


@Preview
@Composable
private fun Prev() {
    PriceBottomPanel(
        coffee = Coffee(
            name = "Caffe Mocha",
            description = "Description",
            price = 4.5,
            image = R.drawable.property_1_coffee__property_2_1,
            type = "Deep Foam",
            rating = 4.8,
        )
    )
}