package com.deni.hilhamsyah.cookhub.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.deni.hilhamsyah.cookhub.ui.HomeScreen
import com.deni.hilhamsyah.cookhub.ui.login_screen.LoginScreen
import com.deni.hilhamsyah.cookhub.ui.onboarding_screen.OnboardingScreen
import com.deni.hilhamsyah.cookhub.ui.onboarding_screen.SplashScreen

@Composable
fun NavGraph(
    navHostController: NavHostController
) {
    NavHost(
        navController = navHostController,
        startDestination = Screen.SplashScreen.route
    ) {
        composable(route = Screen.SplashScreen.route) {
            SplashScreen(navController = navHostController)
        }
        composable(route = Screen.OnboardingScreen.route) {
            OnboardingScreen(navController = navHostController)
        }
        composable(route = Screen.LoginScreen.route) {
            LoginScreen(navController = navHostController)
        }
        composable(route = Screen.HomeScreen.route) {
            HomeScreen(navController = navHostController)
        }

    }
}