package com.calculadora.composenavegation.controllernavegation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.calculadora.actividadcomposenavegation.screen.Main
import com.calculadora.actividadcomposenavegation.screen.Page_1
import com.calculadora.actividadcomposenavegation.screen.Page_2


@Composable
fun NavComponent(){
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "view_1"){
        composable(route = "view_1"){
            Main(navController)
        }
        composable(route = "view_2"){
            Page_2(navController)
        }

    }
}