package com.dicoding.gymtoolkit.presentation.common

import android.content.res.Configuration
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.dicoding.gymtoolkit.R
import com.dicoding.gymtoolkit.presentation.Dimens
import com.dicoding.gymtoolkit.presentation.Dimens.HighPadding3
import com.dicoding.gymtoolkit.presentation.home.DataTools
import com.dicoding.gymtoolkit.presentation.home.toolsGym
import com.dicoding.gymtoolkit.ui.theme.GymToolKitTheme

@Composable
fun ToolsCard(
    modifier: Modifier = Modifier,
    dataTools: DataTools
) {
    Column(modifier = Modifier) {
        Image(
            modifier = Modifier
                .padding(10.dp)
                .fillMaxWidth(), // Atur ukuran sesuai keinginan Anda
            painter = painterResource(id = dataTools.image),
            contentDescription = null,
            contentScale = ContentScale.Fit
        )
        Spacer(modifier = Modifier.height(Dimens.MediumPadding1))
        // Judul
        HeadingLeftTextComponent(value = dataTools.title)
        // Deskripsi
        NormalLeftTextComponent(value = dataTools.description)
    }
}


@Preview(showBackground = true)
@Preview(uiMode = Configuration.UI_MODE_NIGHT_YES, showBackground = true)
@Composable
fun ToolsCardPreview() {
    GymToolKitTheme {
        ToolsCard(
            dataTools = toolsGym[1]
        )
    }
}