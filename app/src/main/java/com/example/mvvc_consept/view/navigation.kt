package com.example.mvvc_consept.view

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController

enum class Navigasi {
    FormSiswa,
    TampilData
}

@Composable
fun DataApp(
    navController : NavHostController = rememberNavController()
) {

}