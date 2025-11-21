package com.example.mvvc_consept.view

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

enum class Navigasi {
    FormSiswa,
    TampilData
}

@Composable
fun DataApp(
    navController : NavHostController = rememberNavController()
) {

    Scaffold {
        innerPad ->
        NavHost(navController = navController,
            startDestination = Navigasi.FormSiswa.name,
            modifier = Modifier.padding(innerPad)) {
            composable(route = Navigasi.FormSiswa.name) {
                TampilData(onBackBtnClick = {
                    navController.navigate(route = Navigasi.TampilData.name)
                })
            }
            composable(route = Navigasi.TampilData.name) {
                ViewData()
            }s
        }
    }

}