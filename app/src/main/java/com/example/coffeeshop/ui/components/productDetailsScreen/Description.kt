package com.example.coffeeshop.ui.components.productDetailsScreen

import androidx.compose.animation.animateContentSize
import androidx.compose.animation.core.LinearOutSlowInEasing
import androidx.compose.animation.core.TweenSpec
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextOverflow.Companion.Ellipsis
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.PreviewParameter
import androidx.compose.ui.tooling.preview.datasource.LoremIpsum
import com.example.coffeeshop.ui.theme.White
import com.example.coffeeshop.ui.theme.myTypography

@Composable
fun Description(
    modifier: Modifier = Modifier,
    description: String = ""
) {
    var isExpanded by remember { mutableStateOf(false) }


    Column(
        modifier = modifier
            .fillMaxWidth()
            .background(White)
    ) {
        Text(
            text = "Description",
            style = myTypography.bodySubtitle
        )
        Text(
            text = description,
            style = myTypography.bodyText,
            overflow = Ellipsis,
            maxLines = if (isExpanded) 50 else 4,
            modifier = Modifier
                .animateContentSize(
                    animationSpec = TweenSpec(
                        durationMillis = 300,
                        easing = LinearOutSlowInEasing
                    )
                )
                .clickable {
                    isExpanded = !isExpanded
                }
        )

    }
}

@Preview
@Composable
private fun Prev(@PreviewParameter(LoremIpsum::class)text : String) {
    Description(
        description = text
    )
}