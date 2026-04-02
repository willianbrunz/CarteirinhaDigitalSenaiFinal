package com.example.carteirinhadigitalsenai.core.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.carteirinhadigitalsenai.feature.auth.presentation.screen.LoginScreen
import com.example.carteirinhadigitalsenai.feature.carteirinha.presentation.component.screen.CarteirinhaScreen
import com.example.carteirinhadigitalsenai.feature.home.presentation.screen.HomeScreen

@Composable
fun AppNavHost(
    navController: NavHostController
) {
    NavHost(
        navController = navController,
        startDestination = Routes.Login.route
    ){
        composable(Routes.Login.route) {
            LoginScreen(
                navController = navController
            )
        }
        composable(Routes.Carteirinha.route) {
            CarteirinhaScreen(
            )
        }
        composable(Routes.Home.route){
            HomeScreen(
                navController = navController
            )
        }
    }
}
