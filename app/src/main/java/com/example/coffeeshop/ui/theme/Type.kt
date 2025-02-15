package com.example.coffeeshop.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp

// Set of Material typography styles to start with
val Typography = Typography(
    bodyLarge = TextStyle(
        fontFamily = soraFamily,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp,
        lineHeight = 24.sp,
        letterSpacing = 0.5.sp,
        color = PrimaryText
    ),
    bodyMedium = TextStyle(
        fontFamily = soraFamily,
        fontWeight = FontWeight.Normal,
        fontSize = 14.sp,
        lineHeight = 20.sp
    ),
    bodySmall = TextStyle(
        fontFamily = soraFamily,
        fontWeight = FontWeight.Normal,
        fontSize = 12.sp,
        lineHeight = 16.sp
    ),

    titleLarge = TextStyle(
        fontFamily = soraFamily,
        fontWeight = FontWeight.SemiBold,
        fontSize = 18.sp,
        lineHeight = 28.sp,
        color = PrimaryText
    ),
    titleMedium = TextStyle(
        fontFamily = soraFamily,
        fontWeight = FontWeight.SemiBold,
        fontSize = 16.sp,
        lineHeight = 24.sp,
        color = PrimaryText
    ),
    titleSmall = TextStyle(
        fontFamily = soraFamily,
        fontWeight = FontWeight.Normal,
        fontSize = 12.sp,
        lineHeight = 20.sp,
        color = SecondaryText
    ),

    labelLarge = TextStyle(
        fontFamily = soraFamily,
        fontWeight = FontWeight.SemiBold,
        fontSize = 14.sp,
        lineHeight = 14.sp,
        color = White
    ),
    labelMedium = TextStyle(
        fontFamily = soraFamily,
        fontWeight = FontWeight.Normal,
        fontSize = 14.sp,
        lineHeight = 24.sp,
        color = SecondaryText
    ),
    labelSmall = TextStyle(
        fontFamily = soraFamily,
        fontWeight = FontWeight.Normal,
        fontSize = 14.sp,
        lineHeight = 14.sp,
        color = PrimaryText
    )
)

val myTypography = MyTypography(

    coffeeCardType = TextStyle(
        fontFamily = soraFamily,
        fontWeight = FontWeight.Normal,
        fontSize = 12.sp,
        lineHeight = 20.sp,
        color = SecondaryText
    ),
    coffeeCardName = TextStyle(
        fontFamily = soraFamily,
        fontWeight = FontWeight.SemiBold,
        fontSize = 16.sp,
        lineHeight = 24.sp,
        color = PrimaryText
    ),
    coffeeCardPrice = TextStyle(
        fontFamily = soraFamily,
        fontWeight = FontWeight.SemiBold,
        fontSize = 18.sp,
        lineHeight = 28.sp,
        color = PrimaryText
    ),
    coffeeCardRating = TextStyle(
        fontFamily = soraFamily,
        fontWeight = FontWeight.SemiBold,
        fontSize = 8.sp,
        color = White
    ),

    location = TextStyle(
        fontFamily = soraFamily,
        fontWeight = FontWeight.Normal,
        fontSize = 12.sp,
        lineHeight = 20.sp,
        color = SecondaryText
    ),
    locationSelector = TextStyle(
        fontFamily = soraFamily,
        fontWeight = FontWeight.SemiBold,
        fontSize = 14.sp,
        lineHeight = 28.sp,
        color = Color(0xFFD8D8D8)
    ),

    filterTagSelected = TextStyle(
        fontFamily = soraFamily,
        fontWeight = FontWeight.SemiBold,
        fontSize = 14.sp,
        lineHeight = 14.sp,
        color = White
    ),
    filterTagUnselected = TextStyle(
        fontFamily = soraFamily,
        fontWeight = FontWeight.Normal,
        fontSize = 14.sp,
        lineHeight = 24.sp,
        color = SecondaryText
    ),

    searchField = TextStyle(
        fontFamily = soraFamily,
        fontWeight = FontWeight.SemiBold,
        fontSize = 16.sp,
        lineHeight = 24.sp,
        color = White
    ),
    searchFieldPlaceholder = TextStyle(
        fontFamily = soraFamily,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp,
        lineHeight = 24.sp,
        color = PrimaryText
    ),

    typeSelected = TextStyle(
        fontFamily = soraFamily,
        fontWeight = FontWeight.SemiBold,
        fontSize = 16.sp,
        lineHeight = 24.sp,
        color = White
    ),
    typeUnselected = TextStyle(
        fontFamily = soraFamily,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp,
        lineHeight = 24.sp,
        color = PrimaryText
    ),

    bodySubtitle = TextStyle(
        fontFamily = soraFamily,
        fontWeight = FontWeight.SemiBold,
        fontSize = 16.sp,
        lineHeight = 24.sp,
        color = PrimaryText
    ),
    bodyText = TextStyle(
        fontFamily = soraFamily,
        fontWeight = FontWeight.Light,
        fontSize = 14.sp,
        lineHeight = 24.sp,
        color = PrimaryText
    ),
    showMore = TextStyle(
        fontFamily = soraFamily,
        fontWeight = FontWeight.SemiBold,
        fontSize = 14.sp,
        lineHeight = 24.sp,
        color = Primary
    ),

)