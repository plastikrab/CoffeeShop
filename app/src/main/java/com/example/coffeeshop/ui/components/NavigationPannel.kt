package com.example.coffeeshop.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.coffeeshop.R
import com.example.coffeeshop.ui.theme.Primary

@Composable
fun NavigationPanel(
    modifier: Modifier = Modifier,
    activeScreen: String = "Home",
    onClick: (String) -> Unit = {}
) {
    Box(
        modifier = modifier
            .fillMaxWidth()
            .height(100.dp)
            .clip(RoundedCornerShape(topStart = 24.dp, topEnd = 24.dp))
            .background(Color.White)

    ) {
        Row(
            modifier = modifier
                .align(Alignment.TopCenter)
                .padding(top = 16.dp, bottom = 32.dp),
            horizontalArrangement = Arrangement.spacedBy(26.dp)
        ) {
            //Home
            Button(
                onClick = {
                    onClick("Home")
                },
                modifier = Modifier,
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color.Transparent
                )
            ) {
                Icon(
                    painter = painterResource(R.drawable.type_regular__state_outline__library_home),
                    contentDescription = null,
                    tint = if (activeScreen == "Home") Primary else Color.Black
                )
            }
            //Liked
            Button(
                onClick = {
                    onClick("Liked")
                },
                modifier = Modifier,
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color.Transparent
                )
            ) {
                Icon(
                    painter = painterResource(R.drawable.type_regular__state_outline__library_heart),
                    contentDescription = null,
                    tint = if (activeScreen == "Liked") Primary else Color.Black
                )
            }
            //Bag
            Button(
                onClick = {
                    onClick("Bag")
                },
                modifier = Modifier,
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color.Transparent
                )
            ) {
                Icon(
                    painter = painterResource(R.drawable.type_regular__state_outline__library_bag),
                    contentDescription = null,
                    tint = if (activeScreen == "Bag") Primary else Color.Black
                )
            }
            //Notification
            Button(
                onClick = {
                    onClick("Notification")
                },
                modifier = Modifier,
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color.Transparent
                )
            ) {
                Icon(
                    painter = painterResource(R.drawable.type_regular__state_outline__library_notification),
                    contentDescription = null,
                    tint = if (activeScreen == "Notification") Primary else Color.Black
                )
            }
        }

    }
}

@Preview
@Composable
private fun prev() {
    NavigationPanel()
}