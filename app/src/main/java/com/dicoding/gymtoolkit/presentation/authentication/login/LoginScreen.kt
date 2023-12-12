package com.dicoding.gymtoolkit.presentation.authentication.login

import android.content.res.Configuration
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.dicoding.gymtoolkit.R
import com.dicoding.gymtoolkit.presentation.Dimens
import com.dicoding.gymtoolkit.presentation.Dimens.BigIconSize
import com.dicoding.gymtoolkit.presentation.Dimens.HighPadding2
import com.dicoding.gymtoolkit.presentation.Dimens.MediumPadding2
import com.dicoding.gymtoolkit.presentation.Dimens.MediumPadding3
import com.dicoding.gymtoolkit.presentation.authentication.components.ClickableTextComponent
import com.dicoding.gymtoolkit.presentation.authentication.components.DividerTextComponent
import com.dicoding.gymtoolkit.presentation.authentication.components.HeadingTextComponent
import com.dicoding.gymtoolkit.presentation.authentication.components.MyTextFieldComponent
import com.dicoding.gymtoolkit.presentation.authentication.components.NormalTextComponent
import com.dicoding.gymtoolkit.presentation.authentication.components.PasswordTextFieldComponent
import com.dicoding.gymtoolkit.presentation.authentication.components.UnderLinedTextComponent
import com.dicoding.gymtoolkit.presentation.authentication.register.RegisterScreen
import com.dicoding.gymtoolkit.presentation.common.ButtonComponent
import com.dicoding.gymtoolkit.ui.theme.Black

@Composable
fun LoginScreen() {
    Surface(
        color = MaterialTheme.colorScheme.background,
        modifier = Modifier
            .fillMaxSize()
            .background(MaterialTheme.colorScheme.background)
            .padding(MediumPadding2)

    ) {
        Column(modifier = Modifier.fillMaxSize()) {

            NormalTextComponent(value = stringResource(id = R.string.login))
            HeadingTextComponent(value = stringResource(id = R.string.welcome))
            Spacer(modifier = Modifier.height(Dimens.MediumPadding1))
            MyTextFieldComponent(
                labelValue = stringResource(id = R.string.username),
                painterResource(id = R.drawable.ic_profil)
            )
            PasswordTextFieldComponent(
                labelValue = stringResource(id = R.string.password),
                painterResource(id = R.drawable.ic_lock)
            )
            UnderLinedTextComponent(value = stringResource(id = R.string.forgot_password))
            ButtonComponent(value = stringResource(id = R.string.login))
            DividerTextComponent()

            ClickableTextComponent(onTextSelected = {

            })
        }
    }
}

@Preview(showBackground = true)
@Preview(showBackground = true, uiMode = Configuration.UI_MODE_NIGHT_YES)
@Composable
fun LoginScreenPreview() {
    LoginScreen()
}

