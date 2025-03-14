package com.techtorq.musicplayerui


import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.techtorq.musicplayerui.screens.ChatGPT
import com.techtorq.musicplayerui.screens.Claude
import com.techtorq.musicplayerui.screens.DeepSeek
import com.techtorq.musicplayerui.screens.Gemini


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