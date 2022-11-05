package com.phidev.starwars_app.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.phidev.starwars_app.model.ScreenDestinations
import com.phidev.starwars_app.views.DetailScreen
import com.phidev.starwars_app.views.main.MainScreen

@Composable
fun Navigation() {

    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "main_screen") {
        composable(ScreenDestinations.MainScreen.route) {
            MainScreen(navController = navController)
        }
        composable(
            ScreenDestinations.DetailScreen.route + "/{name}",
            arguments = listOf(
                navArgument("name") {
                    type = NavType.StringType
                    defaultValue = "No Information available"
                    nullable = true
                }
            )
        ) { entry ->
            DetailScreen(
                name = entry.arguments?.getString("name")
            )
        }
    }
}