package com.example.myapplication.ui.theme

import android.view.Surface
import androidx.compose.foundation.interaction.DragInteraction
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.graphics.Color

val Pink = Color (0xFFF28482)
val Green = Color (0xFF84A59D)
val Yellow = Color (0xFFF7EDE2)
val YellowLight = Color (0xFFFFFFF2)
val Dark  = Color (0xFF3D405B)


@Immutable
data class AppColors(
    val background: Color,
    val  onBackground : Color,
    val surface: Color,
    val onSurface:Color,
    val secondarySurface:Color,
    val onSecondarySurface: Color,
    val regularSurvace:Color,
    val onRegularSurface:Color,
    val actionSurface:Color,
    val onActionSurface:Color,
    val highlightSurface: Color,
    val onHighlightSurface: Color
)

val localAppcolors = staticCompositionLocalOf {
    AppColors(
        background = Color.Unspecified,
        onBackground = Color.Unspecified,
        surface = Color.Unspecified,
        onSurface = Color.Unspecified,
        secondarySurface = Color.Unspecified,
        onSecondarySurface = Color.Unspecified,
        regularSurvace = Color.Unspecified,
        onRegularSurface = Color.Unspecified,
        actionSurface = Color.Unspecified,
        onActionSurface = Color.Unspecified,
        highlightSurface = Color.Unspecified,
        onHighlightSurface = Color.Unspecified
    )
}

val extendedColors = AppColors(
    background = Color.White,
    onBackground = Dark,
    surface = Color.White,
    onSurface = Dark,
    secondarySurface = Pink,
    onSecondarySurface = Color.White,
    regularSurvace = YellowLight,
    onRegularSurface = Dark,
    actionSurface = Yellow,
    onActionSurface = Pink,
    highlightSurface = Green,
    onHighlightSurface = Color.White
    )