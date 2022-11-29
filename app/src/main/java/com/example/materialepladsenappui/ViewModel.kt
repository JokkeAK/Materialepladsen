package com.example.materialepladsenappui

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

//ViewModel containing the app data and methods to process the data

class ViewModel : ViewModel() {

    //App UI state
    private val _uiState = MutableStateFlow(AppUiState())
    val uiState: StateFlow<AppUiState> = _uiState.asStateFlow()

    var username by mutableStateOf("")
    var password by mutableStateOf("")


    var fullNameSignUP by mutableStateOf("")
    var emailSignUP by mutableStateOf("")
    var phoneNumberSignUp by mutableStateOf("")
    var citySignUp by mutableStateOf("")
    var zipSignUp by mutableStateOf("")
    var licensePlateSignUp by mutableStateOf("")
    var usernameSignUp by mutableStateOf("")
    var passwordSignUp by mutableStateOf("")



    //Update the login username.
    fun updateUsername(newUsername: String) {
        username = newUsername
    }

    //Update the login password.
    fun updatePassword(newPassword: String) {
        password = newPassword
    }

    //Update the sign up username.
    fun updateUsernameSignUp(newUsernameSignUp: String) {
        usernameSignUp = newUsernameSignUp
    }

    //Update the sign up password.
    fun updatePasswordSignUp(newPasswordSignUp: String) {
        passwordSignUp = newPasswordSignUp
    }

    //Update the sign up name.
    fun updateFullNameSignUp(newfullNameSignUP: String) {
        fullNameSignUP = newfullNameSignUP
    }

    //Update the sign up email.
    fun updateEmailSignUp(newEmailSignUP: String) {
        emailSignUP = newEmailSignUP
    }

    //Update the sign up phone number.
    fun updatePhoneNumberSignUp(newPhoneNumberSignUp: String) {
        phoneNumberSignUp = newPhoneNumberSignUp
    }
    //Update the sign up city.
    fun updateCitySignUp(newCitySignUp: String) {
        citySignUp = newCitySignUp
    }
    //Update the sign up zip.
    fun updateZipSignUp(newZipSignUp: String) {
        zipSignUp = newZipSignUp
    }
    //Update the sign up license plate.
    fun updateLicensePlateSignUp(newLicensePlateSignUp: String) {
        licensePlateSignUp = newLicensePlateSignUp
    }





    //Checks whether login username is correct or not
    fun checkUsername() {
        //Username is correct
        if (true /*TODO need to make a check to see if username is correct */) {
        }
        //Username is wrong
        else {
            _uiState.update { currentState ->
                currentState.copy(isEnteredUsernameWrong = true)
            }
        }
    }

    //Checks whether login password is correct or not
    fun checkPassword() {
        //Password is correct
        if (true /*TODO need to make a check to see if password is correct */) {
        }
        //Password is wrong
        else {
            _uiState.update { currentState ->
                currentState.copy(isEnteredPasswordWrong = true)
            }
        }
    }

    //Checks whether sign up username is correct or not
    fun checkSignUpUsername() {
        //Username is taken
        if (true /*TODO need to make a check to see if username is taken in database */) {
        }
        //Username is available
        else {
            _uiState.update { currentState ->
                currentState.copy(isSignUpUsernameTaken = true)
            }
        }
    }

    //Checks whether sign up password is invalid or not
    fun checkSignUpPassword() {
        //Password is invalid
        if (true /*TODO need to make a check to see if password is invalid */) {
        }
        //Password is invalid
        else {
            _uiState.update { currentState ->
                currentState.copy(isSignUpPasswordInvalid = true)
            }
        }
    }

}