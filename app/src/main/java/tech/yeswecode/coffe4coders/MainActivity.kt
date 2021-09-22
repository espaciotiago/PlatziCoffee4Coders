package tech.yeswecode.coffe4coders

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import tech.yeswecode.coffe4coders.ui.components.CountryISO
import tech.yeswecode.coffe4coders.ui.screens.DetailScreen
import tech.yeswecode.coffe4coders.ui.screens.FeedScreen
import tech.yeswecode.coffe4coders.ui.theme.Coffe4codersTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent { NavigationHost() }
    }
}

@Composable
fun NavigationHost() {
    val navController = rememberNavController()
    Coffe4codersTheme {
        Surface(color = MaterialTheme.colors.background) {
            NavHost(navController = navController, startDestination = "feed") {
                composable(route = "feed") {
                    FeedScreen(navController)
                }
                composable(route = "detail/{countryIso}") { backStackEntry ->
                    val countryIsoString = backStackEntry.arguments?.getString("countryIso") ?: "COL"
                    val countryIso = CountryISO.valueOf(countryIsoString)
                    DetailScreen(navController, countryIso)
                }
            }
        }
    }
}