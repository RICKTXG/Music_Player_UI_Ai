package com.techtorq.musicplayerui

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@Composable
fun HomePage(navController: NavController) {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        //Button #1
        Button(
            onClick = {navController.navigate(Routes.ChatGPT)},
            colors = ButtonDefaults.buttonColors(containerColor = Color.Black),
            shape = RoundedCornerShape(12.dp),
            modifier = Modifier.width(110.dp)
        )
        {
            Text(
                text = "ChatGpt",
                color = Color.White
            )
        }

        Spacer(modifier = Modifier.height(16.dp))

        //Button #2
        Button(
            onClick = {navController.navigate(Routes.Devin)},
            colors = ButtonDefaults.buttonColors(containerColor = Color.Black),
            shape = RoundedCornerShape(12.dp),
            modifier = Modifier.width(110.dp)
        )
        {
            Text(
                text = "Devin",
                color = Color.White
            )
        }

        Spacer(modifier = Modifier.height(16.dp))

        //Button #3
        Button(
            onClick = {navController.navigate(Routes.DeepSeeK)},
            colors = ButtonDefaults.buttonColors(containerColor = Color.Black),
            shape = RoundedCornerShape(12.dp),
            modifier = Modifier.width(110.dp)
        )
        {
            Text(
                text = "DeepSeek",
                color = Color.White
            )
        }

        Spacer(modifier = Modifier.height(16.dp))

        //Button #4
        Button(
            onClick = {navController.navigate(Routes.Claude)},
            colors = ButtonDefaults.buttonColors(containerColor = Color.Black),
            shape = RoundedCornerShape(12.dp),
            modifier = Modifier.width(110.dp)
        )
        {
            Text(
                text = "Claude",
                color = Color.White
            )
        }

        Spacer(modifier = Modifier.height(16.dp))

        //Button #5
        Button(
            onClick = {navController.navigate(Routes.Gemini)},
            colors = ButtonDefaults.buttonColors(containerColor = Color.Black),
            shape = RoundedCornerShape(12.dp),
            modifier = Modifier.width(110.dp)
        )
        {
            Text(
                text = "Gemini",
                color = Color.White
            )
        }


    }
}