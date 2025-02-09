package com.example.coffeeshop

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.coffeeshop.ui.components.NavigationPanel
import com.example.coffeeshop.ui.screens.HomeScreen
import com.example.coffeeshop.ui.theme.CoffeShopTheme
import dagger.hilt.android.AndroidEntryPoint


@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            var activeScreen by remember { mutableStateOf("Home") }

            CoffeShopTheme {
                Box(
                    Modifier.fillMaxSize()
                ) {
                    HomeScreen()
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
    }
}

