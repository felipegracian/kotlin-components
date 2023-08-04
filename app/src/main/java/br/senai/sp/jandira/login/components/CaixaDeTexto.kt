package br.senai.sp.jandira.login.components

import android.util.Log
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun CaixaDeTexto(
    label: String,
    value: String,
    onChange: (String) -> Unit
) {
    OutlinedTextField(
        value = value,
        onValueChange = {
                        onChange(it)
        },
        label = {
            Text(text = label)
        }

    )
}

@Preview(showBackground = true)
@Composable
fun seeCaixaDeTextoPreview() {
    CaixaDeTexto(
        "Teste",
        value = "",
        {}
    )
}