package com.dicoding.gymtoolkit.presentation.login

import androidx.compose.foundation.Image
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
import androidx.compose.ui.unit.dp
import com.dicoding.gymtoolkit.R
import com.dicoding.gymtoolkit.presentation.Dimens.BigIconSize
import com.dicoding.gymtoolkit.presentation.Dimens.HighPadding2
import com.dicoding.gymtoolkit.presentation.Dimens.MediumPadding2
import com.dicoding.gymtoolkit.presentation.Dimens.MediumPadding3
import com.dicoding.gymtoolkit.ui.theme.Black

@Composable
fun LoginScreen() {
    Surface {

        Column(
            modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {

            TopSection()
            Spacer(modifier = Modifier.height(MediumPadding3))

            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(horizontal = MediumPadding2)
            ) {

            }

        }
    }

}

@Composable
private fun TopSection() {
    val uiColor = if (isSystemInDarkTheme()) Color.White else Black

    Row(
        modifier = Modifier.padding(top = HighPadding2),
        verticalAlignment = Alignment.CenterVertically
    ) {

        Icon(
            modifier = Modifier.size(BigIconSize),
            painter = painterResource(id = R.drawable.ic_logo2),
            contentDescription = stringResource(id = R.string.app_logo),
            tint = uiColor,
        )

    }
    Spacer(modifier = Modifier.height(MediumPadding3))
    Text(
        modifier = Modifier
            .padding(bottom = 10.dp),
//                    .align(alignment = Alignment.BottomCenter),
        text = stringResource(id = R.string.login),
        style = MaterialTheme.typography.headlineLarge,
        color = uiColor
    )
}
