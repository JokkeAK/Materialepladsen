@file:OptIn(ExperimentalMaterial3Api::class)

package com.example.materialepladsenappui

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController

//This composable shows the different text field a private user needs to enter to create an account.
@Composable
public fun SignUpP1(navController: NavHostController? = null,
                    appViewModel: ViewModel = viewModel()
) {
    val appUiState by appViewModel.uiState.collectAsState()

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {


        Spacer(
            modifier = Modifier
                .height(height = 30.dp)
        )
        Image(
            painter = painterResource(id = R.drawable.mp_logo_big),
            contentDescription = "Materialepladsen logo",
            modifier = Modifier
                .size(size = 100.dp)
                .clip(shape = CircleShape),
            contentScale = ContentScale.Fit
        )


        Spacer(modifier = Modifier.height(height = 20.dp))

        FullNameTextField(
            fullNameSignUp = appViewModel.fullNameSignUP,
            onFullNameSignUpChanged = {appViewModel.updateFullNameSignUp(it)}
        )

        Spacer(modifier = Modifier.height(height = 10.dp))

        EmailTextField(
            emailSignUp = appViewModel.emailSignUP,
            onEmailSignUpChanged = {appViewModel.updateEmailSignUp(it)}
        )

        Spacer(modifier = Modifier.height(height = 10.dp))

        PhoneNumberTextField(
            phoneNumberSignUp = appViewModel.phoneNumberSignUp,
            onPhoneNumberSignUpChanged = {appViewModel.updatePhoneNumberSignUp(it)}
        )

        Spacer(modifier = Modifier.height(height = 10.dp))

        CityTextField(
            citySignUp = appViewModel.citySignUp,
            onCitySignUpChanged = {appViewModel.updateCitySignUp(it)}
        )

        Spacer(modifier = Modifier.height(height = 10.dp))

        ZipTextField(
            zipSignUp = appViewModel.zipSignUp,
            onZipSignUpChanged = {appViewModel.updateZipSignUp(it)}
        )

        Spacer(modifier = Modifier.height(height = 10.dp))

        LicensePlateTextField(
            licensePlateSignUp = appViewModel.licensePlateSignUp,
            onLicensePlateSignUpChanged = {appViewModel.updateLicensePlateSignUp(it)}
        )

        Spacer(modifier = Modifier.height(height = 20.dp))

        BordeauxButton(stringResource(R.string.continue_on), navController, "sign up p2")

    }
}



@OptIn(ExperimentalMaterial3Api::class)
@Composable
private fun FullNameTextField(
    fullNameSignUp: String,
    onFullNameSignUpChanged: (String) -> Unit,
) {
    TextField(
        modifier = Modifier.width(width = 250.dp),
        value = fullNameSignUp,
        onValueChange = onFullNameSignUpChanged,
        label = { Text(stringResource(R.string.name_full)) },
        singleLine = true
    )
}


@Composable
private fun EmailTextField(
    emailSignUp: String,
    onEmailSignUpChanged: (String) -> Unit,
) {

    TextField(
        modifier = Modifier.width(width = 250.dp),
        value = emailSignUp,
        onValueChange = onEmailSignUpChanged,
        label = { Text(stringResource(R.string.mail)) },
        singleLine = true
    )
}

@Composable
private fun PhoneNumberTextField(
    phoneNumberSignUp: String,
    onPhoneNumberSignUpChanged: (String) -> Unit,
) {
    TextField(
        modifier = Modifier.width(width = 250.dp),
        value = phoneNumberSignUp,
        onValueChange = onPhoneNumberSignUpChanged,
        label = { Text(stringResource(R.string.phone)) },
        singleLine = true
    )
}

@Composable
private fun CityTextField(
    citySignUp: String,
    onCitySignUpChanged: (String) -> Unit,
) {
    TextField(
        modifier = Modifier.width(width = 250.dp),
        value = citySignUp,
        onValueChange = onCitySignUpChanged,
        label = { Text(stringResource(R.string.city)) },
        singleLine = true
    )
}

@Composable
private fun ZipTextField(
    zipSignUp: String,
    onZipSignUpChanged: (String) -> Unit,
) {

    TextField(
        modifier = Modifier.width(width = 250.dp),
        value = zipSignUp,
        onValueChange = onZipSignUpChanged,
        label = { Text(stringResource(R.string.zip)) },
        singleLine = true
    )
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
private fun LicensePlateTextField(
    licensePlateSignUp: String,
    onLicensePlateSignUpChanged: (String) -> Unit,
) {

    TextField(
        modifier = Modifier.width(width = 250.dp),
        value = licensePlateSignUp,
        onValueChange = onLicensePlateSignUpChanged,
        label = { Text(stringResource(R.string.license)) },
        singleLine = true
    )
}



@Preview(showBackground = true)
@Composable
fun SignUpP1Preview() {
    SignUpP1()
}