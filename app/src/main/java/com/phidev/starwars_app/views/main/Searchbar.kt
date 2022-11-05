package com.phidev.starwars_app.views.main

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.material.Icon
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.material.TextFieldDefaults
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Clear
import androidx.compose.material.icons.filled.Search
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalFocusManager
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import com.phidev.starwars_app.R

@Composable
fun Searchbar() {
    var state by rememberSaveable { mutableStateOf("") }
    val currentFocus = LocalFocusManager.current
    val maxLength = 20

    Column(
        modifier = Modifier
            .fillMaxWidth(),
        verticalArrangement = Arrangement.SpaceAround,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        OutlinedTextField(
            modifier = Modifier
                .padding(bottom = 15.dp),
            value = state,
            onValueChange = {
                if (it.length <= maxLength)
                    state = it
            },
            shape = RoundedCornerShape(25.dp),
            singleLine = true,
            // keyboardOptions = KeyboardOptions(imeAction = ImeAction.Done),
            keyboardActions = KeyboardActions(onDone = { currentFocus.clearFocus() }),
            leadingIcon = { Icon(Icons.Filled.Search, "Search Icon") },
            trailingIcon = {
                if (state.isNotBlank()) {
                    Icon(
                        Icons.Filled.Clear,
                        "Clear Icon",
                        modifier = Modifier
                            .clickable { state = "" }
                    )
                }
            },

            label = {
                Text(
                    stringResource(id = R.string.search_text),
                    style = TextStyle(Color.White)
                )
            },

            colors = TextFieldDefaults.outlinedTextFieldColors(
                focusedBorderColor = colorResource(id = R.color.star_wars_yellow),
                cursorColor = Color.White
            ),

            textStyle = TextStyle(Color.White)
        )
    }
}