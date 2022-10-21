package com.phidev.starwars_app.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.phidev.starwars_app.model.ScreenDestinations
import com.phidev.starwars_app.views.DetailScreen
import com.phidev.starwars_app.views.MainScreen

@Composable
fun Navigation(){
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "main_screen"){
        composable(ScreenDestinations.MainScreen.route){
            MainScreen()
        }
        composable(ScreenDestinations.DetailScreen.route){
            DetailScreen()
        }
    }
}