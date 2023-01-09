package com.example.materialepladsenappui.ViewModels

import com.example.materialepladsenappui.AppUiState
import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow


// ViewModel containing the app data and methods to process the data related to the customer
class CustomersViewModel : ViewModel() {

    // Game UI state
    private val _uiState = MutableStateFlow(AppUiState())

    // Backing property to avoid state updates from other classes
    val uiState : StateFlow<AppUiState> = _uiState.asStateFlow()

    //val customerList: List<CustomersModel>
       // get() = customers

    // Initializes the app to have Allan as the user for testing purposes
    init {
        welcome()
    }

    // Method that makes the app greet Allan for testing purposes.
    fun welcome() {
        _uiState.value = AppUiState(
            welcomeFirstName = "Allan"
        )
    }
}