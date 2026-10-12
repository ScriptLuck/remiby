package io.github.scriptluck.remiby.ui

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.unit.dp
import io.github.scriptluck.remiby.data.Word

@Composable
fun WordCard(word: Word, modifier: Modifier = Modifier) {
    Card(modifier = modifier.fillMaxWidth()) {
        Column(
            modifier = Modifier.padding(16.dp),
            verticalArrangement = Arrangement.spacedBy(12.dp),
        ) {
            Text(text = word.text, style = MaterialTheme.typography.headlineLarge)

            word.definitions.forEachIndexed { index, definition ->
                Column {
                    Text(
                        text = "${index + 1}. ${definition.partOfSpeech.name.lowercase()}",
                        style = MaterialTheme.typography.labelLarge,
                        color = MaterialTheme.colorScheme.primary,
                    )
                    Text(text = definition.meaning, style = MaterialTheme.typography.bodyLarge)
                    definition.examples.forEach { example ->
                        Text(
                            text = "\"$example\"",
                            style = MaterialTheme.typography.bodyMedium,
                            fontStyle = FontStyle.Italic,
                        )
                    }
                }
            }
        }
    }
}

