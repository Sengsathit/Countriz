package com.mycompany.countriz.ui.screens

import androidx.compose.foundation.background
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.mycompany.countriz.ui.theme.CountrizTheme

@Composable
fun MainScreen() {
    Text(
        modifier = Modifier.background(Color.Blue),
        fontSize = 48.sp,
        color = Color.Red,
        text = "Bonjour"
    )
}

@Preview(showBackground = true)
@Composable
fun MainScreenPreview() {
    CountrizTheme {
        MainScreen()
    }
}