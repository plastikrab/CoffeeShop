package com.example.coffeeshop.ui.components.productDetailsScreen

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.coffeeshop.R
import com.example.coffeeshop.ui.theme.myTypography

@Composable
fun TopPanel(
    modifier: Modifier = Modifier,
    onBackClick: () -> Unit = {},
    onFavoriteClick: () -> Unit = {}
) {
    Row(
        modifier = modifier
            .fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Icon(
            painter = painterResource(
                R.drawable.type_regular__state_outline__library_arrow___left_2
            ),
            contentDescription = "",
            modifier = Modifier
                .weight(1f)
        )
        Text(
            text = "Details",
            style = myTypography.bodySubtitle,
            modifier = Modifier
                .weight(3f),
            textAlign = TextAlign.Center
        )
        Icon(
            painter = painterResource(
                R.drawable.type_regular__state_outline__library_heart
            ),
            contentDescription = "",
            modifier = Modifier
                .weight(1f)
                .height(24.dp)
        )
    }
}

@Preview
@Composable
private fun Prev() {
    TopPanel()
}