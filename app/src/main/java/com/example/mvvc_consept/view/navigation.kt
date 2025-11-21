package com.example.mvvc_consept.view

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHost
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
            composable(route = Navigasi.TampilData.name) {
                TampilData(onBackBtnClick = {
                    backToForm(navController)
                }, statuasUISiswa = )
            }
            composable(route = Navigasi.TampilData.name) {
                FormSiswa()
            }
        }
    }

}

fun backToForm(navController : NavHostController) {
    navController.popBackStack(
        route = Navigasi.FormSiswa.name,
        inclusive = false
    )
}