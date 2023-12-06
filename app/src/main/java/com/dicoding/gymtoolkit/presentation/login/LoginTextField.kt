package com.dicoding.gymtoolkit.presentation.login

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.dicoding.gymtoolkit.ui.theme.Black

@Composable
fun LoginTextField(
    modifier: Modifier = Modifier,
    label: String,
    trailing: String
){

    val uiColor = if(isSystemInDarkTheme()) Color.White else Black

    TextField(

    )
}