@file:OptIn(ExperimentalMaterial3Api::class)

package com.example.materialepladsenappui

import android.media.Image
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
public fun SignUpP2(navController: NavHostController? = null,
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
                .size(size = 100.dp)
                .clip(shape = CircleShape),
            contentScale = ContentScale.Fit
        )

        Spacer(modifier = Modifier.height(height = 75.dp))
        SignUpUsernameTextField(
            usernameSignUp = appViewModel.usernameSignUp,
            onUsernameSignUpChanged = {appViewModel.updateUsernameSignUp(it)},
            isUsernameSignUpTaken = appUiState.isSignUpUsernameTaken
        )
        Spacer(modifier = Modifier.height(height = 10.dp))
        SignUpPasswordTextField(
            passwordSignUp = appViewModel.passwordSignUp,
            onPasswordSignUpChanged = {appViewModel.updatePasswordSignUp(it)},
            isPasswordInvalid = appUiState.isSignUpPasswordInvalid
        )

        Spacer(modifier = Modifier.height(height = 75.dp))


        BordeauxButton(stringResource(R.string.create_account), navController, "home")

    }
}

@Composable
 fun SignUpUsernameTextField(
    usernameSignUp: String,
    onUsernameSignUpChanged: (String) -> Unit,
    isUsernameSignUpTaken: Boolean
    ) {

        TextField(
            modifier = Modifier.width(width = 250.dp),
            value = usernameSignUp,
            onValueChange = onUsernameSignUpChanged,
            label = {
                if (isUsernameSignUpTaken) {
                    Text(stringResource(R.string.username_taken))
                } else {
                    Text(stringResource(R.string.username))
                } },
            singleLine = true,
            isError = isUsernameSignUpTaken
        )
    }

@Composable
 fun SignUpPasswordTextField(
    passwordSignUp: String,
    onPasswordSignUpChanged: (String) -> Unit,
    isPasswordInvalid: Boolean
) {
    TextField(
        modifier = Modifier.width(width = 250.dp),
        value = passwordSignUp,
        onValueChange = onPasswordSignUpChanged,
        label = {
            if (isPasswordInvalid) {
                Text(stringResource(R.string.password_invalid))
            } else {
                Text(stringResource(R.string.password))
            } },
        singleLine = true,
        isError = isPasswordInvalid
    )
}


@Preview(showBackground = true)
@Composable
fun SignUpP2Preview() {
    SignUpP2()
}