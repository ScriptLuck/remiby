package io.github.scriptluck.remiby

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import io.github.scriptluck.remiby.data.sampleWords
import io.github.scriptluck.remiby.ui.WordCard
import io.github.scriptluck.remiby.ui.theme.RemibyTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            RemibyTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    WordCard(
                        word = sampleWords[6],
                        modifier = Modifier
                            .padding(innerPadding)
                            .padding(16.dp),
                    )
                }
            }
        }
    }
}
