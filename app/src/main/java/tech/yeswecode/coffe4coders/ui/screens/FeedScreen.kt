package tech.yeswecode.coffe4coders.ui.screens

import android.content.res.Configuration.UI_MODE_NIGHT_YES
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import tech.yeswecode.coffe4coders.ui.components.*
import tech.yeswecode.coffe4coders.ui.theme.Coffe4codersTheme
import tech.yeswecode.coffe4coders.utilities.MockDataProvider

@Composable
fun FeedScreen(navController: NavController) {
    val list = MockDataProvider.listOfProducts()

    Scaffold(topBar = {
        CustomAppBar()
    }, content = {
        LazyColumn(
            verticalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            item {
                Column(
                    modifier = Modifier.padding(8.dp)
                )
                {
                    TitleText(title = "Bienvenido")
                    BodyText(body = "Lorem ipsum dolor sit amet consectetur adipiscing elit per, nullam semper nisl aliquet quisque curae vestibulum.. Lorem ipsum dolor sit amet consectetur adipiscing elit per, nullam semper nisl aliquet quisque curae vestibulum.")

                }
            }
            items(list) { product ->
                ProductCard(product) {
                    navController.navigate("detail/${product.id}"){
                        launchSingleTop = true
                    }
                }
            }
        }
    })
}

@Preview(
    showBackground = true
)
@Composable
fun FeedScreenPreview(){
    val navController = rememberNavController()
    Coffe4codersTheme {
        FeedScreen(navController)
    }
}

@Preview(
    showBackground = true,
    uiMode = UI_MODE_NIGHT_YES
)
@Composable
fun FeedScreenPreviewDark(){
    val navController = rememberNavController()
    Coffe4codersTheme {
        FeedScreen(navController)
    }
}