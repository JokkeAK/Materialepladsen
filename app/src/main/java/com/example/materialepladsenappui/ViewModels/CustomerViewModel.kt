package com.example.materialepladsenappui.ViewModels

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import com.example.materialepladsenappui.AppUiState
import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update


// ViewModel containing the app data and methods to process the data related to the customer
class CustomersViewModel : ViewModel() {

    // Game UI state
    private val _uiState = MutableStateFlow(AppUiState())

    // Backing property to avoid state updates from other classes
    val uiState : StateFlow<AppUiState> = _uiState.asStateFlow()

    //val customerList: List<CustomersModel>
       // get() = customers


    var email by mutableStateOf("")
    var password by mutableStateOf("")


    var firstNameSignUp by mutableStateOf("")
    var lastNameSignUp by mutableStateOf("")
    var emailSignUp by mutableStateOf("")
    var phoneNumberSignUp by mutableStateOf("")
    var citySignUp by mutableStateOf("")
    var zipSignUp by mutableStateOf("")
    var licensePlateSignUp by mutableStateOf("")
    var usernameSignUp by mutableStateOf("")
    var passwordSignUp by mutableStateOf("")



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


    //Update the login username.
    fun updateEmail(newEmail: String) {
        email = newEmail
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

    //Update the sign up first name.
    fun updateFirstNameSignUp(newFirstNameSignUP: String) {
        firstNameSignUp = newFirstNameSignUP
    }

    //Update the sign up last name.
    fun updateLastNameSignUp(newLastNameSignUP: String) {
        lastNameSignUp = newLastNameSignUP
    }

    //Update the sign up email.
    fun updateEmailSignUp(newEmailSignUP: String) {
        emailSignUp = newEmailSignUP
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


    //Checks whether login email is correct or not
    fun checkEmail() {
        //Email is correct
        if (true /*TODO need to make a check to see if username is correct */) {
        }
        //Email is wrong
        else {
            _uiState.update { currentState ->
                currentState.copy(isEnteredEmailWrong = true)
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

    //Checks whether sign up email has been used already
    fun checkSignUpEmail() {
        //Email is taken
        if (true /*TODO need to make a check to see if username is taken in database */) {
        }
        //Email is available
        else {
            _uiState.update { currentState ->
                currentState.copy(hasEmailSignUpBeenTaken = true)
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

    fun CreateCustomer(){

    }




}