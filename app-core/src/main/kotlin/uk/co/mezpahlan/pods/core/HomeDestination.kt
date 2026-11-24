package uk.co.mezpahlan.pods.core

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import uk.co.mezpahlan.pods.core.ui.theme.PodsAndPodsAndPodsAndPodsTheme

@Composable
fun HomeDestination(
    onItemClicked: (Int) -> Unit
) {
    LazyColumn(contentPadding = PaddingValues(horizontal = 16.dp, vertical = 8.dp)) {
        stickyHeader {
            Text(
                "Subscriptions", modifier = Modifier
                    .fillMaxWidth()
                    .background(MaterialTheme.colorScheme.surface),
                style = MaterialTheme.typography.titleMedium
            )
        }

        items(samplePodcasts) { podcast ->
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp, vertical = 8.dp)
                    .clickable { onItemClicked(podcast.id) }
            ) {
                Text(
                    text = podcast.title,
                    modifier = Modifier.padding(16.dp),
                    style = MaterialTheme.typography.bodyLarge
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun HomeDestinationPreview() {
    PodsAndPodsAndPodsAndPodsTheme {
        HomeDestination {}
    }
}