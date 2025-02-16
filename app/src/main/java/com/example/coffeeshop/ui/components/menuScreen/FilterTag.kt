package com.example.coffeeshop.ui.components.menuScreen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.coffeeshop.ui.theme.Primary
import com.example.coffeeshop.ui.theme.myTypography

@Composable
fun FilterTag(
    modifier: Modifier = Modifier,
    isActive: Boolean = true,
    onClick: (String) -> Unit = {},
    text: String = "All Coffee",
) {
    if (isActive){
        ActiveFilter(
            modifier = modifier,
            onClick = onClick,
            text = text
        )
    }else{
        InactiveFilter(
            modifier = modifier,
            onClick = onClick,
            text = text
        )
    }
}

@Composable
private fun ActiveFilter(
    modifier: Modifier = Modifier,
    onClick: (String) -> Unit = {},
    text: String = "All Coffee"
) {
    Button(
        onClick = {
            onClick(text)
        },
        shape = RoundedCornerShape(6.dp),
        contentPadding = PaddingValues(vertical = 4.dp, horizontal = 8.dp),
        modifier = modifier
            .height(30.dp),
        colors = ButtonDefaults.buttonColors(
            containerColor = Primary
        )
    ) {
        Text(
            text = text,
            style = myTypography.filterTagSelected
        )
    }
}

@Composable
private fun InactiveFilter(
    modifier: Modifier = Modifier,
    onClick: (String) -> Unit = {},
    text: String = "All Coffee"
) {
    Button(
        onClick = {
            onClick(text)
        },
        shape = RoundedCornerShape(6.dp),
        contentPadding = PaddingValues(vertical = 4.dp, horizontal = 8.dp),
        modifier = modifier
            .height(30.dp),
        colors = ButtonDefaults.buttonColors(
            containerColor = Color.Transparent
        )
    ) {
        Text(
            text = text,
            style = myTypography.filterTagUnselected
        )
    }
}

@Preview
@Composable
private fun prev() {
    Column {
        FilterTag()
        ActiveFilter()
        InactiveFilter()
    }

}
