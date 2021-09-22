package tech.yeswecode.coffe4coders.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable

private val DarkColorPalette = darkColors(
    primary = PlatziBlue,
    primaryVariant = PlatziBlue,
    secondary = PlatziGreen
)

private val LightColorPalette = lightColors(
    primary = PlatziBlue,
    primaryVariant = PlatziBlue,
    secondary = PlatziGreen
)

@Composable
fun Coffe4codersTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable() () -> Unit
) {
    val colors = if (darkTheme) {
        DarkColorPalette
    } else {
        LightColorPalette
    }

    MaterialTheme(
        colors = colors,
        typography = Typography,
        shapes = Shapes,
        content = content
    )
}