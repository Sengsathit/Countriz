package com.mycompany.countriz

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.mycompany.countriz.ui.screens.CountriesListScreen
import com.mycompany.countriz.ui.theme.CountrizTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            CountrizTheme {
                CountriesListScreen()
            }
        }
    }
}