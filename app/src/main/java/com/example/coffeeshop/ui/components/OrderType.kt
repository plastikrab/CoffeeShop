package com.example.coffeeshop.ui.components

import android.util.Log
import androidx.compose.animation.animateContentSize
import androidx.compose.animation.core.animateDpAsState
import androidx.compose.animation.core.animateIntOffsetAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
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
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.onSizeChanged
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.IntOffset
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.toSize
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
    var maxWidth by remember { mutableStateOf(0.dp) }
    val density = LocalDensity.current.density

    var indicatorOffset by remember { mutableStateOf(0.dp) }
    val animatedOffset by animateDpAsState(
        targetValue = indicatorOffset,
        animationSpec = tween(durationMillis = 300)
    )

    Box(
        Modifier
            .fillMaxWidth()
            .clip(RoundedCornerShape(12.dp))
            .background(ContainerUnselected)
            .height(44.dp)
            .onSizeChanged {
                val width = it.width / density
                Log.d("MyLog", "OrderType: $width")
                maxWidth = width.dp
            }
    ) {
        Box(
            Modifier
                .offset(x = animatedOffset)
                .padding(4.dp)
                .clip(RoundedCornerShape(8.dp))
                .fillMaxWidth(0.5f)
                .fillMaxHeight()
                .background(Primary)
        )
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
                    containerColor = Color.Transparent
                ),
                onClick = {
                    onClick("Deliver")
                    indicatorOffset = 0.dp
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
                    Color.Transparent,
                ),
                onClick = {
                    onClick("Pick Up")
                    indicatorOffset = maxWidth * 0.5f
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
private fun Prev() {
    var type by remember { mutableStateOf("Deliver") }
    OrderType(
        type = type,
        onClick = {
            type = it
        }
    )

}