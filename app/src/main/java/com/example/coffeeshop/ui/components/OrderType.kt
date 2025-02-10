package com.example.coffeeshop.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.coffeeshop.ui.theme.ContainerUnselected
import com.example.coffeeshop.ui.theme.Primary
import com.example.coffeeshop.ui.theme.myTypography

@Composable
fun OrderType(
    modifier: Modifier = Modifier,
    type: String = "Deliver",
    onClick: (String) -> Unit = {},
    isActive: Boolean = true
) {
    Box(
        Modifier
            .fillMaxWidth()
            .clip(RoundedCornerShape(12.dp))
            .background(ContainerUnselected)
            .height(44.dp),

    ) {
        Row(
            Modifier
                .clip(RoundedCornerShape(8.dp))
                .padding(4.dp)
                .align(Alignment.Center),
            horizontalArrangement = Arrangement.spacedBy(1.dp)
        ) {
            Button(
                shape = RoundedCornerShape(8.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = if (type == "Deliver") Primary else ContainerUnselected
                ),
                onClick = {
                    onClick("Deliver")
                },
                modifier = Modifier
                    .weight(1f)
                    .fillMaxHeight()
            ) {
                Text(
                    text = "Deliver",
                    style = if (type == "Deliver") myTypography.typeSelected else myTypography.typeUnselected,
                    modifier = Modifier
                )
            }
            Button(
                shape = RoundedCornerShape(8.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = if (type == "Pick Up") Primary else ContainerUnselected
                ),
                onClick = {
                    onClick("Pick Up")
                },
                modifier = Modifier
                    .weight(1f)
                    .fillMaxHeight()
            ) {
                Text(
                    text = "Pick Up",
                    style = if (type == "Pick Up") myTypography.typeSelected else myTypography.typeUnselected,
                    modifier = Modifier

                )

            }
        }
    }
}



@Preview
@Composable
private fun prev() {
    var type by remember { mutableStateOf("Deliver") }
    OrderType(
        type = type,
        onClick = {
            type = it
        }
    )

}