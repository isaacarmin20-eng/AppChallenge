package com.example.mediscreen

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.mediscreen.ui.HomeScreen
import com.example.mediscreen.ui.theme.MediScreenTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MediScreenTheme {
                HomeScreen()
            }
        }
    }
}
