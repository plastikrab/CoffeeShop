package com.example.coffeeshop.ui.components.productDetailsScreen

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.coffeeshop.ui.theme.ContainerUnselected
import com.example.coffeeshop.ui.theme.Primary
import com.example.coffeeshop.ui.theme.Secondary
import com.example.coffeeshop.ui.theme.White
import com.example.coffeeshop.ui.theme.myTypography

@Composable
fun SizeBlockSelector(
    modifier: Modifier = Modifier,
    onClick: (String) -> Unit,
    sizes: List<String>,
    selectedSize: String,
) {
    Row(
        horizontalArrangement = Arrangement.spacedBy(16.dp),
        modifier = modifier
    ) {
        sizes.forEach { size ->
            SizeBlock(
                onClick = {onClick(it)},
                size = size,
                selected = selectedSize == size
            )
        }
    }
}

@Composable
fun SizeBlock(
    modifier: Modifier = Modifier,
    onClick: (String) -> Unit,
    size: String,
    selected: Boolean
) {
    OutlinedButton(
        modifier = modifier
            .height(40.dp)
            .width(95.dp),
        onClick = { onClick(size) },
        shape = RoundedCornerShape(12.dp),
        colors = ButtonDefaults.outlinedButtonColors(
            containerColor = if (selected) Secondary else White,
        ),
        border = BorderStroke(
            width = 1.dp,
            color = if (selected) Primary else ContainerUnselected
        )
    ) {
        Text(
            text = size,
            style = if (selected) myTypography.buttonActive else myTypography.buttonInactive
        )
    }
}

@Preview
@Composable
private fun Prev() {
    var size by remember { mutableStateOf("S") }
    Column {
        SizeBlockSelector(
            onClick = {
                size = it
            },
            sizes = listOf("S", "M", "L"),
            selectedSize = size
        )
    }
}