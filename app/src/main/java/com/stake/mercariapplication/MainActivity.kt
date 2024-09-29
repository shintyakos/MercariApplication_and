package com.stake.mercariapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.stake.mercariapplication.ui.theme.Blue60
import com.stake.mercariapplication.ui.theme.MercariApplicationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MercariApplicationTheme {
                Surface {
                    Title()
                }
            }
        }
    }
}

@Suppress("ktlint:standard:function-naming")
@Composable
fun Title() {
    Column(modifier = Modifier.fillMaxSize().padding(start = 14.dp, end = 14.dp, top = 24.dp, bottom = 24.dp)) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.End,
        ) {
            Text(
                text = "スキップ",
                fontFamily = FontFamily(Font(R.font.notosansjp_medium)),
                fontSize = 14.sp,
                color = Blue60,
            )
        }
        Image(
            painter = painterResource(R.drawable.mercari_service_primary_horizontal),
            contentDescription = "title",
        )
    }
}

@Suppress("ktlint:standard:function-naming")
@Preview(device = "id:pixel_6a")
@Composable
fun GreetingPreview() {
    MercariApplicationTheme {
        Title()
    }
}
