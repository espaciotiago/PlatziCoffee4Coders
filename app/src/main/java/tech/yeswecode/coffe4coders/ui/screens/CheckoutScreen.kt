package tech.yeswecode.coffe4coders.ui.screens

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import tech.yeswecode.coffe4coders.models.Product
import tech.yeswecode.coffe4coders.ui.components.*
import tech.yeswecode.coffe4coders.ui.theme.Coffe4codersTheme
import tech.yeswecode.coffe4coders.utilities.MockDataProvider

@Composable
fun CheckoutScreen(navController: NavController, product: Product) {
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
    var name by remember { mutableStateOf("")}
    var email by remember { mutableStateOf("")}
    var phone by remember { mutableStateOf("")}
    var address by remember { mutableStateOf("")}
    var city by remember { mutableStateOf("")}

    Scaffold(topBar = {
        CustomAppBar(navigationIcon = Icons.Filled.ArrowBack) {
            navController.navigate("detail/${product.id}")
        }
    }, content = {

        Column(
            modifier = Modifier.verticalScroll(rememberScrollState())
        ){
            ProductCard(product) {}

            Column(
                modifier = Modifier.padding(16.dp)
            ) {
                CustomTextField(value = name, placeholder = "Nombre completo") {
                    name = it
                }
                CustomTextField(value = email, placeholder = "Correo electrónico") {
                    email = it
                }
                CustomTextField(value = phone, placeholder = "Número telefónico") {
                    phone = it
                }
                CustomTextField(value = address, placeholder = "Dirección de residencia") {
                    address = it
                }
                DropdownTextField(suggestions = cities, value = city, placeholder = "Ciudad"){
                    city = it
                }
                
                Column {
                    Row {
                        Text("Subtotal", style = MaterialTheme.typography.caption)
                        Text("$ 35.0 USD", 
                            style = MaterialTheme.typography.body2,
                            textAlign = TextAlign.End,
                        modifier = Modifier.fillMaxWidth())
                    }
                    Row {
                        Text("Envio", style = MaterialTheme.typography.caption)
                        Text("$ 10.0 USD", style = MaterialTheme.typography.body2,
                            textAlign = TextAlign.End,
                            modifier = Modifier.fillMaxWidth())
                    }
                }
                
                Row(horizontalArrangement = Arrangement.spacedBy(16.dp)){
                    Text(
                        "$ 45.0 USD",
                        style = MaterialTheme.typography.h5,
                        textAlign = TextAlign.Start
                    )
                    CustomButton(label = "Finalizar pedido") {

                    }
                }
            }
        }
    })
}

@Preview(showBackground = true)
@Composable
fun CheckoutScreenPreview() {
    val product = MockDataProvider.getProductBy(0)
    if(product != null){
        val navController = rememberNavController()
        Coffe4codersTheme {
            CheckoutScreen(navController, product)
        }
    }
}