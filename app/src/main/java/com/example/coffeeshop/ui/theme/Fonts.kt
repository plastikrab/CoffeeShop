package com.example.coffeeshop.ui.theme

import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.googlefonts.Font
import androidx.compose.ui.text.googlefonts.GoogleFont
import androidx.compose.ui.tooling.preview.datasource.LoremIpsum
import com.example.coffeeshop.R


val provider = GoogleFont.Provider(
    providerAuthority = "com.google.android.gms.fonts",
    providerPackage = "com.google.android.gms",
    certificates = R.array.com_google_android_gms_fonts_certs
)


val soraFont = GoogleFont("Sora")
val soraFamily = FontFamily(Font(googleFont = soraFont, fontProvider = provider))