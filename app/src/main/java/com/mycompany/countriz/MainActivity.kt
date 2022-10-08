package com.mycompany.countriz

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.mycompany.countriz.ui.screens.MainScreen
import com.mycompany.countriz.ui.theme.CountrizTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CountrizTheme {
                MainScreen()
            }
        }
    }
}