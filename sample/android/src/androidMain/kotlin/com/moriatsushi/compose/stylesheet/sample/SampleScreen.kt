package com.moriatsushi.compose.stylesheet.sample

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.moriatsushi.compose.stylesheet.surface.Surface
import com.moriatsushi.compose.stylesheet.text.Text

@Composable
fun SampleScreen(
    modifier: Modifier = Modifier,
) {
    Surface(modifier = modifier.fillMaxSize()) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp),
            verticalArrangement = Arrangement.Center,
        ) {
            Text(
                text = "Compose StyleSheet",
                tags = TextTags.primary,
            )
            Spacer(modifier = Modifier.height(8.dp))
            Text(
                text = "Let's try to change the theme!",
                tags = TextTags.secondary,
            )
        }
    }
}
