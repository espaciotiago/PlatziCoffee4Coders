package tech.yeswecode.coffe4coders.ui.screens

import androidx.compose.runtime.*
import androidx.compose.ui.tooling.preview.Preview
import tech.yeswecode.coffe4coders.ui.components.CustomTextField
import tech.yeswecode.coffe4coders.ui.components.DropdownTextField
import tech.yeswecode.coffe4coders.ui.theme.Coffe4codersTheme

@Composable
fun CheckoutScreen() {
    val cities = listOf(
        "Ciudad de México, México",
        "La Habana, Cuba",
        "Cancún, México",
        "Medellín, Colombia",
        "Buenos Aires, Argentina",
        "Sao Paulo, Brasil",
        "Lima, Perú",
        "Montevideo, Uruguay",
        "Ciudad de Panamá, Panamá"
    )
    var city by remember { mutableStateOf("")}

    DropdownTextField(suggestions = cities, value = city, placeholder = "Ciudad"){
        city = it
    }
}

@Preview(showBackground = true)
@Composable
fun CheckoutScreenPreview() {
    Coffe4codersTheme {
        CheckoutScreen()
    }
}