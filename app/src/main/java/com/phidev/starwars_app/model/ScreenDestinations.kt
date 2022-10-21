package com.phidev.starwars_app.model

sealed class ScreenDestinations(val route: String){
    object MainScreen: ScreenDestinations("main_screen")
    object DetailScreen: ScreenDestinations("detail_screen")
}
