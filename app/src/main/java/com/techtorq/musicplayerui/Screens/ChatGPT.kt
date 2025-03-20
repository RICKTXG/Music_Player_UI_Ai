package com.techtorq.musicplayerui.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.techtorq.musicplayerui.R

@Composable
fun ChatGPT() {
    var isPlaying by remember { mutableStateOf(false) }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFF121212)),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Image(
            painter = painterResource(id = R.drawable.album_cover), // Replace with your image
            contentDescription = "Album Cover",
            modifier = Modifier
                .size(250.dp)
                .clip(RoundedCornerShape(16.dp))
        )
        Spacer(modifier = Modifier.height(20.dp))
        Text("Song Title", color = Color.White, fontSize = 20.sp)
        Text("Artist Name", color = Color.Gray, fontSize = 16.sp)
        Spacer(modifier = Modifier.height(20.dp))
        LinearProgressIndicator(
            progress = 0.5f,
            color = Color.Red,
            modifier = Modifier
                .fillMaxWidth(0.8f)
                .height(4.dp)
        )
        Spacer(modifier = Modifier.height(20.dp))
        Row(
            horizontalArrangement = Arrangement.SpaceEvenly,
            modifier = Modifier.fillMaxWidth(0.7f)
        ) {
            IconButton(onClick = { /* Previous song */ }) {
                Icon(painterResource(id = R.drawable.ic_previous), contentDescription = "Previous", tint = Color.White)
            }
            IconButton(onClick = { isPlaying = !isPlaying }) {
                Icon(
                    painterResource(if (isPlaying) R.drawable.ic_pause else R.drawable.ic_play),
                    contentDescription = "Play/Pause",
                    tint = Color.White
                )
            }
            IconButton(onClick = { /* Next song */ }) {
                Icon(painterResource(id = R.drawable.ic_next), contentDescription = "Next", tint = Color.White)
            }
        }
    }
}

@Preview
@Composable
fun PreviewMusicPlayer() {
    ChatGPT()
}


