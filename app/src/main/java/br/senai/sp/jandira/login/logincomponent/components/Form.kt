package br.senai.sp.jandira.login.logincomponent.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import br.senai.sp.jandira.login.components.CaixaDeTexto

@Composable
fun Form() {

    var emailState by remember {
        mutableStateOf("")
    }
    var senhaState by remember {
        mutableStateOf("")
    }

    Card {
        Column (modifier = Modifier.padding(8.dp)){
            CaixaDeTexto(
                "E-mail",
                value = emailState,
                onChange = {
                    emailState = it
                }
            )
            CaixaDeTexto(
                "Senha",
                value = senhaState,
                onChange = {
                    senhaState = it
                }
            )
        }
    }
}

@Preview
@Composable
fun seeFormPreview() {
    Form()
}