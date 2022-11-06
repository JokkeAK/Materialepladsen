package com.example.materialepladsenappui

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

class Viewmodel : ViewModel(){

    private val _uistate = MutableStateFlow(OrderUiState())
    val uistate:StateFlow<OrderUiState> = _uistate.asStateFlow()




}