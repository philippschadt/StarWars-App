package com.phidev.starwars_app.model

sealed class ScreenDestinations(val route: String) {
    object MainScreen : ScreenDestinations(route = "main_screen")
    object DetailScreen : ScreenDestinations(route = "detail_screen")

    fun withArgs(vararg args: String): String {
        return buildString {
            append(route)
            args.forEach { arg ->
                append("/$arg")
            }
        }
    }
}
