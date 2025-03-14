package com.techtorq.musicplayerui


import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.techtorq.musicplayerui.Screens.ChatGPT
import com.techtorq.musicplayerui.Screens.Claude
import com.techtorq.musicplayerui.Screens.DeepSeek
import com.techtorq.musicplayerui.Screens.Devin
import com.techtorq.musicplayerui.Screens.Gemini

@Composable
fun NavigateAll(){
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = Routes.Homepage, builder = {
        composable(Routes.Homepage){
            HomePage(navController)
        }
        composable(Routes.ChatGPT) {
            ChatGPT()
        }
        composable(Routes.Devin) {
            Devin()
        }
        composable(Routes.DeepSeeK) {
            DeepSeek()
        }
        composable(Routes.Claude) {
            Claude()
        }
        composable(Routes.Gemini) {
            Gemini()
        }

    })
}