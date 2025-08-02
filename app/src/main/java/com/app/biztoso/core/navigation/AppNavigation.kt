package com.app.biztoso.core.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.app.biztoso.presentation.pages.login.LoginScreen
import com.app.biztoso.presentation.pages.main.MainScreen
import com.app.biztoso.presentation.pages.splash.SplashScreen

@Composable
fun AppNavigation() {
    val navController = rememberNavController()

    NavHost(navController, startDestination = Routes.Splash) {
        composable(Routes.Splash) { SplashScreen(navController) }
        composable(Routes.Login) { LoginScreen(navController) }
        composable(Routes.Main) { MainScreen() }
    }
}