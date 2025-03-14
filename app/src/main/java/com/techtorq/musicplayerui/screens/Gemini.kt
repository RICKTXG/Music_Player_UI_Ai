package com.techtorq.musicplayerui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.IconButton
import androidx.compose.material3.Slider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.techtorq.musicplayerui.R

@Composable
fun Gemini() {
    var isPlaying by remember { mutableStateOf(false) }
    var progress by remember { mutableStateOf(0f) }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceEvenly
    ) {
        Image(
            painter = painterResource(id = android.R.drawable.ic_media_play), // Default placeholder
            contentDescription = "Album Art",
            modifier = Modifier
                .size(200.dp)
                .clip(RectangleShape),
            contentScale = ContentScale.Crop
        )

        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            Text(text = "Song Title", fontSize = 24.sp, textAlign = TextAlign.Center)
            Text(text = "Artist Name", fontSize = 18.sp, textAlign = TextAlign.Center)
        }

        Slider(
            value = progress,
            onValueChange = { progress = it },
            modifier = Modifier.fillMaxWidth()
        )

        Row(
            horizontalArrangement = Arrangement.SpaceEvenly,
            modifier = Modifier.fillMaxWidth()
        ) {
            IconButton(onClick = { /* Previous */ }) {
                R.drawable.ic_previous
            }
            IconButton(onClick = { isPlaying = !isPlaying }) {
                if (isPlaying) R.drawable.ic_pause else R.drawable.ic_play
            }
            IconButton(onClick = { /* Next */ }) {
                R.drawable.ic_next
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun SimpleGMusicPlayerPreview() {
    Gemini()
}