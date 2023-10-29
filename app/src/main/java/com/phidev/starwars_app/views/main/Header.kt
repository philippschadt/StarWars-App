package com.phidev.starwars_app.views.main

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.phidev.starwars_app.R

@Composable
fun Header() {
    Column(
        modifier = Modifier
            .fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = painterResource(id = R.drawable.star_wars_logo),
            contentDescription = stringResource(R.string.star_wars_logo)
        )
        Text(
            text = stringResource(id = R.string.info_text),
            Modifier.padding(vertical = 15.dp)
        )
    }
}
