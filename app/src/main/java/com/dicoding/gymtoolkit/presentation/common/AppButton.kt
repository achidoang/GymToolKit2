package com.dicoding.gymtoolkit.presentation.common

import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import com.dicoding.gymtoolkit.ui.theme.WhiteGray

@Composable
fun AppButton(
    text: String,
    onclick: () -> Unit
) {

    Button(
        onClick = onclick, colors = ButtonDefaults.buttonColors(
            containerColor = MaterialTheme.colorScheme.primary,
            contentColor = Color.White
        ),
        shape = CircleShape
//        shape = RoundedCornerShape(size = 6.dp)
    ) {
        Text(
            text = text,
            style = MaterialTheme.typography.labelMedium.copy(fontWeight = FontWeight.SemiBold)
        )

    }
}

@Composable
fun AppTextButton(
    text: String,
    enabled: Boolean = true,
    onclick: () -> Unit

) {
    TextButton(
        onClick = { if (enabled) onclick() }, // Hanya panggil onclick jika enabled=true
        enabled = enabled // Set enabled untuk TextButton
    ){
        Text(
            text = text,
            style = MaterialTheme.typography.labelMedium.copy(fontWeight = FontWeight.SemiBold),
            color = WhiteGray
        )
    }
}