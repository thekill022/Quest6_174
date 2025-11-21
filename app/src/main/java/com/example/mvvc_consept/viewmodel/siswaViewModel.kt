package com.example.mvvc_consept.viewmodel

import androidx.lifecycle.ViewModel
import com.example.mvvc_consept.model.siswa
import kotlinx.coroutines.flow.MutableStateFlow

class siswaViewModel : ViewModel() {

    private val _statusUI = MutableStateFlow(siswa())

}