package com.example.coffeeshop.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.BottomSheetDefaults
import androidx.compose.material3.BottomSheetScaffold
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.rememberModalBottomSheetState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import com.example.coffeeshop.R
import com.example.coffeeshop.ui.components.menuScreen.CoffeeCard
import com.example.coffeeshop.ui.components.menuScreen.FilterTag
import com.example.coffeeshop.ui.components.menuScreen.SearchField
import com.example.coffeeshop.ui.theme.GradientEnd
import com.example.coffeeshop.ui.theme.GradientStart
import com.example.coffeeshop.ui.theme.WhiteSecondary
import com.example.coffeeshop.ui.theme.myTypography
import com.example.coffeeshop.viewmodel.HomeScreenViewModel

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(
    viewModel: HomeScreenViewModel = hiltViewModel()
) {

    val coffeeMenu by viewModel.coffeeMenu.observeAsState(initial = emptyList())
    val typesList by viewModel.typesList.observeAsState(initial = emptyList())
    val selectedCoffee by viewModel.selectedCoffee.observeAsState(initial = null)

    var selectedType by remember { mutableStateOf("All Coffee") }
    var bottomSheetVisible by remember { mutableStateOf(false) }

    val bottomSheetState = rememberModalBottomSheetState()

    BottomSheetScaffold(
        sheetDragHandle = {},
        sheetShape = BottomSheetDefaults.HiddenShape,
        modifier = Modifier
            .fillMaxSize(),
        sheetPeekHeight = 550.dp,
        sheetContainerColor = WhiteSecondary,
        sheetContent = {
            Spacer(
                Modifier.height(20.dp)
            )
            LazyRow(
                modifier = Modifier
                    .width(330.dp)
                    .align(Alignment.CenterHorizontally),
                horizontalArrangement = Arrangement.spacedBy(16.dp)
            ) {
                items(typesList){
                    FilterTag(
                        text = it,
                        onClick = { type->
                            selectedType = type
                        },
                        isActive = selectedType == it
                    )
                }
            }
            LazyVerticalGrid(
                horizontalArrangement = Arrangement.spacedBy(15.dp),
                columns = GridCells.Fixed(2),
                modifier = Modifier
                    .width(330.dp)
                    .align(Alignment.CenterHorizontally)
                    .padding(bottom = 100.dp),
            ) {
                items(coffeeMenu){
                    if (selectedType == "All Coffee"){
                        CoffeeCard(
                            it,
                            modifier = Modifier
                                .padding(vertical = 12.dp),
                            onInfoClick = {coffee->
                                viewModel.setSelectedCoffee(coffee)
                                viewModel.setOpenDetails(true)
                            }
                        )
                    }else{
                        if (it.type == selectedType){
                            CoffeeCard(
                                it,
                                modifier = Modifier
                                    .padding(vertical = 12.dp),
                                onInfoClick = {coffee->
                                    viewModel.setSelectedCoffee(coffee)
                                    viewModel.setOpenDetails(true)
                                }
                            )
                        }
                    }
                }
            }
        }

    ) {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(Brush.horizontalGradient(listOf(GradientStart, GradientEnd)))
        ){
            Column(
                modifier = Modifier
                    .padding(top = 45.dp)
                    .width(330.dp)
                    .align(Alignment.TopCenter),
            ) {
                Text(
                    text = "Location",
                    style = myTypography.location,
                    modifier = Modifier
                        .padding(vertical = 10.dp)
                )
                Text(
                    text = "Bilzen, Tanjungbalai",
                    style = myTypography.locationSelector,
                )
                SearchField(
                    modifier = Modifier
                        .align(Alignment.CenterHorizontally)
                        .padding(top = 24.dp)
                )
                Image(
                    painter = painterResource(R.drawable.banner),
                    contentDescription = null,
                    modifier = Modifier
                        .width(330.dp)
                        .height(165.dp)
                        .padding(top = 24.dp)
                        .align(Alignment.CenterHorizontally)
                )
            }
        }
    }
}

@Preview
@Composable
private fun prev() {
    HomeScreen()
}