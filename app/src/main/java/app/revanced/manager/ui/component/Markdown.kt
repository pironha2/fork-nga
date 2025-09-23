package app.revanced.manager.ui.component

import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.TextLinkStyles
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import com.mikepenz.markdown.compose.Markdown
import com.mikepenz.markdown.m3.markdownColor
import com.mikepenz.markdown.m3.markdownTypography

@Composable
fun Markdown(
    text: String
) {
    val markdown = text.trimIndent()

    Markdown(
        content = markdown,
        colors = markdownColor(
            text = MaterialTheme.colorScheme.onSurfaceVariant,
            codeBackground = MaterialTheme.colorScheme.secondaryContainer,
        ),
        typography = markdownTypography(
            h1 = MaterialTheme.typography.headlineSmall.copy(fontWeight = FontWeight.Bold),
            h2 = MaterialTheme.typography.titleLarge.copy(fontWeight = FontWeight.Bold),
            h3 = MaterialTheme.typography.titleMedium.copy(fontWeight = FontWeight.Bold),
            text = MaterialTheme.typography.bodyMedium,
            code = markdownTypography().code.copy(color = MaterialTheme.colorScheme.onSecondaryContainer),
            list = MaterialTheme.typography.bodyMedium,
            textLink = TextLinkStyles(
                style = MaterialTheme.typography.bodyMedium.copy(
                    fontWeight = FontWeight.Bold, textDecoration = TextDecoration.Underline,
                    color = MaterialTheme.colorScheme.primary
                ).toSpanStyle(),
                hoveredStyle = MaterialTheme.typography.bodyMedium.copy(
                    fontWeight = FontWeight.Bold, textDecoration = TextDecoration.Underline,
                    color = MaterialTheme.colorScheme.secondary
                ).toSpanStyle(),
                pressedStyle = MaterialTheme.typography.bodyMedium.copy(
                    fontWeight = FontWeight.Bold, textDecoration = TextDecoration.Underline,
                    color = MaterialTheme.colorScheme.tertiary
                ).toSpanStyle()

            ),
        )
    )
}