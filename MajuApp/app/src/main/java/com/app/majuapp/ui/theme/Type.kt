package com.app.majuapp.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.googlefonts.Font
import androidx.compose.ui.text.googlefonts.GoogleFont
import androidx.compose.ui.unit.sp
import com.app.majuapp.R

val googleFontProvider = GoogleFont.Provider(
    providerAuthority = "com.google.android.gms.fonts",
    providerPackage = "com.google.android.gms",
    certificates = R.array.com_google_android_gms_fonts_certs
)


val notoSansKoreanFontFamily = FontFamily(
    Font(googleFont = GoogleFont("Noto Sans KR"), fontProvider = googleFontProvider)
//    androidx.compose.ui.text.font.Font(
//        R.font.noto_sans_korean_medium,
//        FontWeight.Bold,
//        FontStyle.Normal
//    )
)

val robotoFont = FontFamily(
    Font(
        googleFont = GoogleFont("Roboto"), fontProvider = googleFontProvider
    )
)

val gmarket = FontFamily(
    androidx.compose.ui.text.font.Font(R.font.gmarket, FontWeight.Bold, FontStyle.Normal)
)


val customTypoGraphy = Typography(
    bodyLarge = TextStyle(
        fontFamily = notoSansKoreanFontFamily,
        fontWeight = FontWeight.Bold,
        fontSize = 20.sp,
        lineHeight = 24.sp,
        letterSpacing = 0.5.sp
    ),
)


// Set of Material typography styles to start with
val Typography = Typography(
    bodyLarge = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Bold,
        fontSize = 20.sp,
        lineHeight = 24.sp,
        letterSpacing = 0.5.sp
    )
)
