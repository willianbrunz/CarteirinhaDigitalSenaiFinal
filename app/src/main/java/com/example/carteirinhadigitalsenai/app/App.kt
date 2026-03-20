package com.example.carteirinhadigitalsenai.app

import androidx.compose.runtime.Composable
import androidx.navigation.compose.rememberNavController
import com.example.carteirinhadigitalsenai.core.desingsystem.theme.CarteirinhaDigitalSenaiTheme
import com.example.carteirinhadigitalsenai.core.navigation.AppNavHost

@Composable
fun App(){
    CarteirinhaDigitalSenaiTheme {

        val navController = rememberNavController()

        AppNavHost(
            navController = navController
        )
    }
}