package com.phidev.starwars_app.views

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable

@Composable
fun MainScreen() {
    Column {
        Header()
        Searchbar()
        ShowListOfCharacters()
    }
}