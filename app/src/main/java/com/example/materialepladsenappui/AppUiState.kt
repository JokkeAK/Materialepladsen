package com.example.materialepladsenappui

//Data class that represents the game UI state
data class AppUiState(
    val isEnteredUsernameWrong: Boolean = false,
    val isEnteredPasswordWrong: Boolean = false,
    val isSignUpUsernameTaken: Boolean = false,
    val isSignUpPasswordInvalid: Boolean = false
)