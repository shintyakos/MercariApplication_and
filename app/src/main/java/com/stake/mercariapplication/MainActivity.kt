package com.stake.mercariapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.Surface
import com.stake.mercariapplication.ui.screen.TitleScreen
import com.stake.mercariapplication.ui.theme.MercariApplicationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MercariApplicationTheme {
                Surface {
                    TitleScreen()
                }
            }
        }
    }
}
