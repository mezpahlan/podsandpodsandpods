package uk.co.mezpahlan.pods.core

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import uk.co.mezpahlan.pods.core.ui.theme.PodsAndPodsAndPodsAndPodsTheme

@Composable
fun ProfileDestination(modifier: Modifier = Modifier) {
    Text("Bar", modifier = modifier)
}

@Preview(showBackground = true)
@Composable
fun ProfileDestinationPreview() {
    PodsAndPodsAndPodsAndPodsTheme {
        ProfileDestination()
    }
}