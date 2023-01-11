package com.example.materialepladsenappui

//Data class that represents the game UI state
data class AppUiState(
    //The first name that is greeted at the home screen
    val welcomeFirstName : String = "",
    val isEnteredEmailWrong : Boolean = false,
    val isEnteredPasswordWrong : Boolean = false,
    val hasEmailSignUpBeenTaken : Boolean = false,
    val isSignUpPasswordInvalid : Boolean = false,
    val arePasswordsIdentical : Boolean = true,
    )