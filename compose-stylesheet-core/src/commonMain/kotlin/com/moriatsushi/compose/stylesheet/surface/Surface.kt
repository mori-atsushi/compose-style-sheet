package com.moriatsushi.compose.stylesheet.surface

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.takeOrElse
import com.moriatsushi.compose.stylesheet.Component
import com.moriatsushi.compose.stylesheet.ProvideContentStyle
import com.moriatsushi.compose.stylesheet.StyleSheet
import com.moriatsushi.compose.stylesheet.color.asColor
import com.moriatsushi.compose.stylesheet.tag.Tag

/**
 * An element that draws a [backgroundColor] behind its [content].
 */
@Composable
fun Surface(
    modifier: Modifier = Modifier,
    tag: Tag<SurfaceStyle>? = null,
    backgroundColor: Color = Color.Unspecified,
    contentColor: Color = Color.Unspecified,
    content: @Composable () -> Unit,
) {
    val style = StyleSheet.getStyle(surface, tag)
    val surfaceBackgroundColor = backgroundColor
        .takeOrElse { style.backgroundColor.asColor() }
    val contentStyle = style.contentStyle.merge {
        color += contentColor
    }

    Box(
        modifier = modifier.background(surfaceBackgroundColor),
        propagateMinConstraints = true,
    ) {
        ProvideContentStyle(
            contentStyle = contentStyle,
            content = content,
        )
    }
}

/**
 * A symbol for [Surface].
 */
val surface = Component(
    name = "Surface",
    defaultStyle = SurfaceStyle(),
    createBuilder = ::SurfaceStyleBuilder,
)
