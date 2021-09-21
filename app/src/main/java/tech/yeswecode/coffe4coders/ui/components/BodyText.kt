package tech.yeswecode.coffe4coders.ui.components

import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import tech.yeswecode.coffe4coders.ui.theme.Coffe4codersTheme

@Composable
fun BodyText(body: String) {
    Text(body,
        style = MaterialTheme.typography.body2,
        textAlign = TextAlign.Justify
    )
}

@Preview(
    showBackground = true
)
@Composable
fun BodyTextPreview() {
    Coffe4codersTheme {
        BodyText("Lorem ipsum dolor sit amet consectetur adipiscing elit per, nullam semper nisl aliquet quisque curae vestibulum.. Lorem ipsum dolor sit amet consectetur adipiscing elit per, nullam semper nisl aliquet quisque curae vestibulum.")
    }
}