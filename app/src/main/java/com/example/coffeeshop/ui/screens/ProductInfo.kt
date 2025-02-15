package com.example.coffeeshop.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import com.example.coffeeshop.R
import com.example.coffeeshop.model.entities.Coffee
import com.example.coffeeshop.ui.components.ProductInfoScreen.TopPanel
import com.example.coffeeshop.ui.theme.White
import com.example.coffeeshop.viewmodel.HomeScreenViewModel

@Composable
fun ProductInfo(
    //viewModel: HomeScreenViewModel = hiltViewModel(),
    coffee : Coffee,
) {
    Column(
        modifier =  Modifier
            .fillMaxSize()
            .background(White)
    ) {
        TopPanel(
            modifier = Modifier
                .padding(top = 24.dp)
        )
        Image(
            painter = painterResource(coffee.image),
            contentDescription = "",
            modifier = Modifier
                .clip(RoundedCornerShape(16.dp))
                .size(330.dp, 200.dp)
                .padding(top = 24.dp)
                .align(Alignment.CenterHorizontally),
            contentScale = ContentScale.Crop
        )
    }
}

@Preview
@Composable
private fun prev() {
    ProductInfo(
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