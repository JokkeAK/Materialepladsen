@file:OptIn(ExperimentalMaterial3Api::class)

package com.example.materialepladsenappui

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.*
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
import androidx.navigation.compose.rememberNavController
import com.example.materialepladsenappui.ViewModels.CustomerViewModel

//This composable shows the different text field a private user needs to enter to create an account.
@Composable
public fun SignUpP1(
    navController: NavHostController? = null,
    customerViewModel: CustomerViewModel
) {
    val appUiState by customerViewModel.uiState.collectAsState()

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

        Spacer(modifier = Modifier.height(height = 15.dp))

        FirstNameTextField(
            firstNameSignUp = customerViewModel.firstNameSignUp,
            onFirstNameSignUpChanged = { customerViewModel.updateFirstNameSignUp(it) }
        )

        Spacer(modifier = Modifier.height(height = 10.dp))

        LastNameTextField(
            lastNameSignUp = customerViewModel.lastNameSignUp,
            onLastNameSignUpChanged = { customerViewModel.updateLastNameSignUp(it) }
        )

        Spacer(modifier = Modifier.height(height = 10.dp))


        PhoneNumberTextField(
            phoneNumberSignUp = customerViewModel.phoneNumberSignUp,
            onPhoneNumberSignUpChanged = { customerViewModel.updatePhoneNumberSignUp(it) }
        )

        Spacer(modifier = Modifier.height(height = 10.dp))

        CityTextField(
            citySignUp = customerViewModel.citySignUp,
            onCitySignUpChanged = { customerViewModel.updateCitySignUp(it) }
        )

        Spacer(modifier = Modifier.height(height = 10.dp))

        ZipTextField(
            zipSignUp = customerViewModel.zipSignUp,
            onZipSignUpChanged = { customerViewModel.updateZipSignUp(it) }
        )

        Spacer(modifier = Modifier.height(height = 10.dp))

        LicensePlateTextField(
            licensePlateSignUp = customerViewModel.licensePlateSignUp,
            onLicensePlateSignUpChanged = { customerViewModel.updateLicensePlateSignUp(it) }
        )

        Spacer(modifier = Modifier.height(height = 15.dp))

        BordeauxButton(stringResource(R.string.continue_on), navController, "sign up p2") {}

    }
}


@OptIn(ExperimentalMaterial3Api::class)
@Composable
private fun FirstNameTextField(
    firstNameSignUp: String,
    onFirstNameSignUpChanged: (String) -> Unit,
) {
    TextField(
        modifier = Modifier.width(width = 250.dp),
        value = firstNameSignUp,
        onValueChange = onFirstNameSignUpChanged,
        label = { Text(stringResource(R.string.name_first)) },
        singleLine = true
    )
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
private fun LastNameTextField(
    lastNameSignUp: String,
    onLastNameSignUpChanged: (String) -> Unit,
) {
    TextField(
        modifier = Modifier.width(width = 250.dp),
        value = lastNameSignUp,
        onValueChange = onLastNameSignUpChanged,
        label = { Text(stringResource(R.string.name_last)) },
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
    val navController = rememberNavController()
    val customerViewModel: CustomerViewModel = viewModel()
    SignUpP1(navController,customerViewModel)
}

