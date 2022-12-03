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

//This composable is the login page where a new user can go to the sign up page.
@Composable
public fun Login(
    navController: NavHostController? = null,
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
                .height(height = 68.dp)
        )
        Image(
            painter = painterResource(id = R.drawable.mp_logo_big),
            contentDescription = "Materialepladsen logo",
            modifier = Modifier
                .size(size = 225.dp)
                .clip(shape = CircleShape),
            contentScale = ContentScale.Fit
        )

        Spacer(
            modifier = Modifier
                .height(height = 10.dp)
        )


        BordeauxButton(text = stringResource(R.string.new_user), navController, "sign up p1")


        Spacer(modifier = Modifier.height(height = 20.dp))

        LoginUsernameTextField(
            username = appViewModel.username,
            onUsernameChanged = { appViewModel.updateUsername(it) },
            isUsernameWrong = appUiState.isEnteredUsernameWrong
        )

        Spacer(modifier = Modifier.height(height = 10.dp))

        LoginPasswordTextField(
            password = appViewModel.password,
            onPasswordChanged = { appViewModel.updatePassword(it) },
            isPasswordWrong = appUiState.isEnteredPasswordWrong
        )

        Spacer(modifier = Modifier.height(height = 20.dp))

        BordeauxButton(stringResource(R.string.login), navController, "home")

    }
}


//Composable text field for usernames.
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LoginUsernameTextField(
    username: String,
    onUsernameChanged: (String) -> Unit,
    isUsernameWrong: Boolean
) {

    TextField(
        modifier = Modifier.width(width = 250.dp),
        value = username,
        onValueChange = onUsernameChanged,
        label = {
            if (isUsernameWrong) {
                Text(stringResource(R.string.username_wrong))
            } else {
                Text(stringResource(R.string.username))
            }
        },
        singleLine = true,
        isError = isUsernameWrong
    )
}

//Composable text field for passwords.
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LoginPasswordTextField(
    password: String,
    onPasswordChanged: (String) -> Unit,
    isPasswordWrong: Boolean
) {
    TextField(
        modifier = Modifier.width(width = 250.dp),
        value = password,
        onValueChange = onPasswordChanged,
        label = {
            if (isPasswordWrong) {
                Text(stringResource(R.string.password_wrong))
            } else {
                Text(stringResource(R.string.password))
            }
        },
        singleLine = true,
        isError = isPasswordWrong
    )
}

@Preview(showBackground = true)
@Composable
fun LoginPreview() {
    Login()
}