package com.example.mvvc_consept.view

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHost
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.mvvc_consept.model.datajk
import com.example.mvvc_consept.model.siswa
import com.example.mvvc_consept.viewmodel.siswaViewModel

enum class Navigasi {
    FormSiswa,
    TampilData
}

@Composable
fun DataApp(
    navController : NavHostController = rememberNavController(),
    siswaViewModel: siswaViewModel = viewModel()
) {

    Scaffold {
        innerPad ->
        NavHost(navController = navController,
            startDestination = Navigasi.FormSiswa.name,
            modifier = Modifier.padding(innerPad)) {
            composable(route = Navigasi.TampilData.name) {
                TampilData(onBackBtnClick = {
                    backToForm(navController)
                }, siswaViewModel = siswaViewModel)
            }
            composable(route = Navigasi.FormSiswa.name) {
                FormSiswa(onSubmitButton = {
                    navController.navigate(route = Navigasi.TampilData.name)
                }, pilihanJK = datajk.jenisK,
                    siswaViewMode = siswaViewModel)
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