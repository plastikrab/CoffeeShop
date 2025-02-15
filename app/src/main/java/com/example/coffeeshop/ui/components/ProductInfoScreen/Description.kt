package com.example.coffeeshop.ui.components.ProductInfoScreen

import android.util.EventLogTags.Description
import androidx.compose.animation.core.animateIntAsState
import androidx.compose.animation.core.animateIntOffsetAsState
import androidx.compose.animation.core.animateSizeAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.coffeeshop.ui.theme.White
import com.example.coffeeshop.ui.theme.myTypography

@Composable
fun Description(
    modifier: Modifier = Modifier,
    description: String = ""
) {
    var isExpanded by remember { mutableStateOf(false) }
    var maxLines = 200

    val animatedTextStyle = animateIntAsState(
        targetValue = maxLines,
        animationSpec = tween(durationMillis = 300)
    )
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
            modifier = Modifier
                .padding(top = 8.dp),
            maxLines = animatedTextStyle.value,
            onTextLayout = {

            }
        )
        Text(
            text = if (isExpanded) "Show less" else "Show more",
            style = myTypography.showMore,
            modifier = Modifier
                .padding(top = 2.dp)
                .clickable { isExpanded = !isExpanded }
        )

    }
}

@Preview
@Composable
private fun Prev() {
    Description(
        description = "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book."
    )
}