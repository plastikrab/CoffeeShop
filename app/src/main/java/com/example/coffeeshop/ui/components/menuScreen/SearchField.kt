package com.example.coffeeshop.ui.components.menuScreen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.coffeeshop.R
import com.example.coffeeshop.ui.theme.PrimaryText
import com.example.coffeeshop.ui.theme.SecondaryText
import com.example.coffeeshop.ui.theme.White
import com.example.coffeeshop.ui.theme.myTypography

@Composable
fun SearchField(
    modifier: Modifier = Modifier,
    onValueChange: (String) -> Unit = {},
    onClick: () -> Unit = {}
) {
    var text by remember { mutableStateOf("") }

    Row(
        modifier = modifier
            .fillMaxWidth()
            .height(54.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        TextField(
            leadingIcon = {
                Icon(
                    painter = painterResource(R.drawable.type_regular__state_outline__library_search),
                    contentDescription = null,
                    tint = White
                )
            },
            placeholder = {
                Text(
                    text = "Search coffee",
                    color = SecondaryText,
                    style = myTypography.searchFieldPlaceholder
                )
            },
            value = text,
            onValueChange = {
                text = it
                onValueChange(it)
            },
            modifier = Modifier
                .fillMaxWidth()
                .weight(9f)
                .height(52.dp)
                .clip(RoundedCornerShape(16.dp)),
            textStyle = myTypography.searchField,
            colors = TextFieldDefaults.colors(
                focusedContainerColor = PrimaryText,
                unfocusedContainerColor = PrimaryText,
                disabledContainerColor = PrimaryText,
                focusedIndicatorColor = PrimaryText,
                unfocusedIndicatorColor = PrimaryText,
            )
        )
        Button(
            shape = RoundedCornerShape(14.dp),
            contentPadding = PaddingValues(0.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = Color.Transparent
            ),
            onClick = onClick,
            modifier = Modifier
                .weight(2f)
                .size(52.dp)
                .padding(start = 10.dp)
                .clip(RoundedCornerShape(1.dp)),
        ) {
            Image(
                painter = painterResource(R.drawable.filet),
                contentDescription = null,
                modifier = Modifier
                    .size(52.dp)
            )
        }

    }
}

@Preview
@Composable
private fun prev() {
    SearchField()
}