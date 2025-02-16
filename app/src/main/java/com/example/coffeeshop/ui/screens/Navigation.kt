package com.example.coffeeshop.ui.screens

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.BottomSheetDefaults
import androidx.compose.material3.BottomSheetScaffold
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.rememberBottomSheetScaffoldState
import androidx.compose.material3.rememberModalBottomSheetState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import com.example.coffeeshop.ui.components.NavigationPanel
import com.example.coffeeshop.ui.components.productDetailsScreen.PriceBottomPanel
import com.example.coffeeshop.ui.theme.White
import com.example.coffeeshop.ui.theme.WhiteSecondary
import com.example.coffeeshop.viewmodel.HomeScreenViewModel
import kotlinx.coroutines.launch

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Navigation(
    modifier: Modifier = Modifier,
    viewModel: HomeScreenViewModel = hiltViewModel()
) {
    val selectedCoffee by viewModel.selectedCoffee.observeAsState(initial = null)
    val openDetails by viewModel.openDetails.observeAsState(initial = false)

    val bottomSheetState = rememberBottomSheetScaffoldState()
    val coroutineScope = rememberCoroutineScope()
    var activeScreen by remember { mutableStateOf("Home") }

    viewModel.openDetails.observeForever {
        coroutineScope.launch {
            if (it){
                bottomSheetState.bottomSheetState.expand()
            }else{
                bottomSheetState.bottomSheetState.hide()
            }
        }
    }


    BottomSheetScaffold(
        scaffoldState = bottomSheetState,
        sheetDragHandle = {},
        sheetShape = BottomSheetDefaults.HiddenShape,
        modifier = modifier
            .fillMaxSize(),
        sheetPeekHeight = 0.dp,
        sheetContainerColor = White,
        sheetContent = {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(top = 24.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                if (selectedCoffee != null && openDetails) {
                    Box(
                        Modifier.fillMaxSize()
                    ){
                        ProductInfo(
                            selectedCoffee!!,
                            modifier = Modifier
                                .align(Alignment.TopCenter)
                        )
                        PriceBottomPanel(
                            modifier = Modifier
                                .align(Alignment.BottomCenter),
                            coffee = selectedCoffee!!
                        )
                    }

                }
            }
        }
    ) {
        Box(
            Modifier.fillMaxSize()
        ) {
            HomeScreen(viewModel)
            NavigationPanel(
                modifier = Modifier
                    .align(Alignment.BottomCenter),
                activeScreen = activeScreen,
                onClick = {
                    activeScreen = it
                }
            )
        }
    }
}

@Preview
@Composable
private fun Prev() {
    Navigation()
}