package com.phidev.starwars_app.views.main

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.navigation.NavController

@Composable
fun MainScreen(navController: NavController) {
    Column {
        Header()
        Searchbar()
        ShowListOfCharacters(navController = navController)
    }
}
