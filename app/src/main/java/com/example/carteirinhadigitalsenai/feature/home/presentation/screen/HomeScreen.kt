package com.example.carteirinhadigitalsenai.feature.home.presentation.screen

import androidx.compose.material3.Button
import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import com.example.carteirinhadigitalsenai.core.navigation.Routes

@Composable
fun HomeScreen(
    navController: NavController
){
    Button(
        onClick = {
            navController.navigate(
                Routes.Carteirinha.route
            )
        }
    ) { }
}