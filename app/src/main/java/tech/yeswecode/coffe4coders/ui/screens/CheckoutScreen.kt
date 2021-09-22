package tech.yeswecode.coffe4coders.ui.screens

import androidx.compose.runtime.*
import androidx.compose.ui.tooling.preview.Preview
import tech.yeswecode.coffe4coders.ui.components.CustomTextField

@Composable
fun CheckoutScreen() {
    var name by remember { mutableStateOf("")}

    CustomTextField(value = name, placeholder = "Nombre"){
        name = it
    }
}

@Preview(showBackground = true)
@Composable
fun CheckoutScreenPreview() {
    CheckoutScreen()
}