package com.dicoding.gymtoolkit.presentation.home

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import com.dicoding.gymtoolkit.R
import com.dicoding.gymtoolkit.presentation.Dimens
import com.dicoding.gymtoolkit.presentation.Dimens.MediumPadding1
import com.dicoding.gymtoolkit.presentation.Dimens.MediumPadding2
import com.dicoding.gymtoolkit.presentation.authentication.components.ClickableTextComponent
import com.dicoding.gymtoolkit.presentation.authentication.components.DividerTextComponent
import com.dicoding.gymtoolkit.presentation.authentication.components.HeadingTextComponent
import com.dicoding.gymtoolkit.presentation.authentication.components.MyTextFieldComponent
import com.dicoding.gymtoolkit.presentation.authentication.components.NormalTextComponent
import com.dicoding.gymtoolkit.presentation.authentication.components.PasswordTextFieldComponent
import com.dicoding.gymtoolkit.presentation.common.ButtonComponent

@Composable
fun HomeScreen() {
    Surface(
        color = MaterialTheme.colorScheme.background,
        modifier = Modifier
            .fillMaxSize()
            .background(MaterialTheme.colorScheme.background)
            .padding(MediumPadding2)

    ) {
        Column(modifier = Modifier.fillMaxSize()) {

            NormalTextComponent(value = stringResource(id = R.string.hello))
            HeadingTextComponent(value = stringResource(id = R.string.create_account))
            Spacer(modifier = Modifier.height(MediumPadding1))
            MyTextFieldComponent(
                labelValue = stringResource(id = R.string.username),
                painterResource(id = R.drawable.ic_profil)
            )
            MyTextFieldComponent(
                labelValue = stringResource(id = R.string.email),
                painterResource(id = R.drawable.ic_email)
            )
            PasswordTextFieldComponent(
                labelValue = stringResource(id = R.string.password),
                painterResource(id = R.drawable.ic_lock)
            )
            ButtonComponent(value = stringResource(id = R.string.register))
            DividerTextComponent()

            ClickableTextComponent(onTextSelected = {

            })
        }

    }
}