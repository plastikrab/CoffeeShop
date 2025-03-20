package com.example.coffeeshop.ui.screens

import android.util.Log
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.gestures.Orientation
import androidx.compose.foundation.gestures.scrollable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.PreviewParameter
import androidx.compose.ui.tooling.preview.datasource.LoremIpsum
import androidx.compose.ui.unit.dp
import com.example.coffeeshop.R
import com.example.coffeeshop.model.entities.Coffee
import com.example.coffeeshop.ui.components.productDetailsScreen.Description
import com.example.coffeeshop.ui.components.productDetailsScreen.GeneralInfoBlock
import com.example.coffeeshop.ui.components.productDetailsScreen.SizeBlockSelector
import com.example.coffeeshop.ui.components.productDetailsScreen.TopPanel
import com.example.coffeeshop.ui.theme.White
import com.example.coffeeshop.ui.theme.myTypography

@Composable
fun ProductInfo(
    //viewModel: HomeScreenViewModel = hiltViewModel(),
    coffee : Coffee,
    modifier: Modifier = Modifier
) {
    var size by remember { mutableStateOf("M") }
    val scrollState = rememberScrollState()


    Column(
        modifier = modifier
            .background(White)
            .width(330.dp)
            .fillMaxHeight()
            .scrollable(
                state = scrollState,
                orientation = Orientation.Vertical
                )
    ) {
        TopPanel(
            modifier = Modifier
                .padding(top = 24.dp)
        )
        Image(
            painter = painterResource(coffee.image),
            contentDescription = "",
            modifier = Modifier
                .padding(top = 24.dp)
                .clip(RoundedCornerShape(16.dp))
                .size(330.dp, 200.dp)
                .align(Alignment.CenterHorizontally),
            contentScale = ContentScale.Crop
        )
        GeneralInfoBlock(
            coffee = coffee
        )
        Description(
            modifier = Modifier
                .padding(top = 24.dp),
            description = coffee.description
        )
        Text(
            text = "Size",
            style = myTypography.bodySubtitle,
            modifier = Modifier
                .padding(top = 24.dp)
        )
        SizeBlockSelector(
            modifier = Modifier
                .padding(top = 16.dp)
                .align(Alignment.CenterHorizontally),
            onClick = {
                size = it
            },
            sizes = listOf("S", "M", "L"),
            selectedSize = size
        )

    }
}

@Preview
@Composable
private fun prev(
    @PreviewParameter(LoremIpsum::class)text : String
) {
    ProductInfo(
        coffee = Coffee(
            name = "Caffe Mocha",
            description = text,
            price = 4.53,
            image = R.drawable.property_1_coffee__property_2_1,
            type = "Deep Foam",
            rating = 4.8
        )
    )
}