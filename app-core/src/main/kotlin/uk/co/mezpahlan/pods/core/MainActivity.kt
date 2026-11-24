package uk.co.mezpahlan.pods.core

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.BackHandler
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.safeContentPadding
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.adaptive.navigationsuite.NavigationSuiteScaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.PreviewScreenSizes
import uk.co.mezpahlan.pods.core.AppDestinations.FAVOURITES
import uk.co.mezpahlan.pods.core.AppDestinations.HOME
import uk.co.mezpahlan.pods.core.AppDestinations.PROFILE
import uk.co.mezpahlan.pods.core.ui.theme.PodsAndPodsAndPodsAndPodsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            PodsAndPodsAndPodsAndPodsTheme {
                PodsAndPodsAndPodsAndPodsApp()
            }
        }
    }
}

@PreviewScreenSizes
@Composable
fun PodsAndPodsAndPodsAndPodsApp() {
    var currentDestination by rememberSaveable { mutableStateOf(HOME) }
    var selectedItem by rememberSaveable { mutableStateOf<Int?>(null) }

    BackHandler(enabled = selectedItem != null) { selectedItem = null }

    NavigationSuiteScaffold(
        navigationSuiteItems = {
            AppDestinations.entries.forEach {
                item(
                    icon = {
                        Icon(
                            painterResource(it.icon),
                            contentDescription = it.label
                        )
                    },
                    label = { Text(it.label) },
                    selected = it == currentDestination,
                    onClick = { currentDestination = it }
                )
            }
        },
        modifier = Modifier.safeContentPadding()
    ) {
        Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
            if (selectedItem != null) {
                SubscriptionDetail(
                    podcastId = selectedItem,
                    modifier = Modifier.padding(innerPadding),
                    onBack = { selectedItem = null })
            } else {
                when (currentDestination) {
                    HOME -> HomeDestination(onItemClicked = { selectedItem = it })
                    FAVOURITES -> FavouritesDestination(Modifier.padding(innerPadding))
                    PROFILE -> ProfileDestination(Modifier.padding(innerPadding))
                }
            }
        }
    }
}

enum class AppDestinations(
    val label: String,
    val icon: Int,
) {
    HOME("Home", R.drawable.ic_home),
    FAVOURITES("Favourites", R.drawable.ic_favorite),
    PROFILE("Profile", R.drawable.ic_account_box),
}