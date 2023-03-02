package com.example.navegacionpantallas

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.cupcake.CupcakeApp
import com.example.cupcake.ui.theme.CupcakeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CupcakeTheme {
                CupcakeApp()
            }
        }
    }
}
