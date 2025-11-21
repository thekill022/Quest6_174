package com.example.mvvc_consept.viewmodel

import androidx.lifecycle.ViewModel
import com.example.mvvc_consept.model.siswa
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

class siswaViewModel : ViewModel() {

    private val _statusUI = MutableStateFlow(siswa())
    val statusUI : StateFlow<siswa> = _statusUI.asStateFlow()

    fun setSiswa(ls: List<String>) {
        _statusUI.update { statusNow ->
            statusNow.copy(nama = ls[0], gender = ls[1], alamat = ls[2])
        }
    }

}