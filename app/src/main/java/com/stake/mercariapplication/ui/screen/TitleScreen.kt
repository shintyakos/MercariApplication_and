package com.stake.mercariapplication.ui.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.stake.mercariapplication.R
import com.stake.mercariapplication.ui.theme.Blue60
import com.stake.mercariapplication.ui.theme.MercariApplicationTheme
import com.stake.mercariapplication.ui.theme.Red

@Suppress("ktlint:standard:function-naming")
@Composable
fun TitleScreen() {
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
        Column(
            modifier = Modifier.fillMaxHeight(),
            verticalArrangement = Arrangement.Center,
        ) {
            Image(
                painter = painterResource(R.drawable.mercari_service_primary_horizontal),
                contentDescription = "title",
                modifier = Modifier.fillMaxWidth().height(60.dp),
            )
            Text(
                text = "メルカリへようこそ！",
                fontFamily = FontFamily(Font(R.font.notosansjp_medium)),
                fontSize = 14.sp,
                textAlign = TextAlign.Center,
                modifier = Modifier.fillMaxWidth().padding(top = 24.dp),
            )
            Button(
                onClick = { /* TODO */ },
                colors =
                    ButtonDefaults.buttonColors(
                        containerColor = Red,
                    ),
                shape = RoundedCornerShape(5.dp),
                modifier = Modifier.fillMaxWidth().padding(top = 26.dp),
                contentPadding = PaddingValues(top = 14.dp, bottom = 14.dp),
            ) {
                Text(
                    text = "会員登録・ログイン",
                    fontFamily = FontFamily(Font(R.font.notosansjp_medium)),
                    fontSize = 14.sp,
                    textAlign = TextAlign.Center,
                    style = TextStyle(),
                )
            }
        }
    }
}

@Suppress("ktlint:standard:function-naming")
@Preview(device = "id:pixel_6a")
@Composable
fun GreetingPreview() {
    MercariApplicationTheme {
        TitleScreen()
    }
}
