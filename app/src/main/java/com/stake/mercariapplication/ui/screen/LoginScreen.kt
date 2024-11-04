package com.stake.mercariapplication.ui.screen

import android.graphics.drawable.Icon
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.ArrowForwardIos
import androidx.compose.material.icons.filled.VisibilityOff
import androidx.compose.material.icons.outlined.Mail
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.ExperimentalTextApi
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.withAnnotation
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.stake.mercariapplication.R
import com.stake.mercariapplication.ui.theme.Black40
import com.stake.mercariapplication.ui.theme.Black60
import com.stake.mercariapplication.ui.theme.Blue60
import com.stake.mercariapplication.ui.theme.Red

@Suppress("ktlint:standard:function-naming")
@Composable
fun LoginScreen() {
    Scaffold(
        topBar = { LoginTopAppBar() },
    ) {
        Column(
            modifier =
                Modifier
                    .padding(it)
                    .fillMaxSize()
                    .background(Color.White),
        ) {
            LoginContent()
        }
    }
}

@Suppress("ktlint:standard:function-naming")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LoginTopAppBar() {
    TopAppBar(
        title = {
            Image(
                painter = painterResource(R.drawable.mercari_service_primary_horizontal),
                contentDescription = "title",
                modifier =
                    Modifier
                        .height(36.dp)
                        .fillMaxWidth()
                        .padding(end = 48.dp),
                alignment = Alignment.Center,
            )
        },
        navigationIcon = {
            IconButton(onClick = { /* TODO */ }) {
                Icon(imageVector = Icons.Default.ArrowBack, contentDescription = "back")
            }
        },
        colors =
            TopAppBarDefaults.topAppBarColors(
                titleContentColor = Color.White,
                containerColor = Color.White,
            ),
        modifier = Modifier.fillMaxWidth().background(Color.White).shadow(elevation = 2.dp),
    )
}

@Suppress("ktlint:standard:function-naming")
@Composable
fun LoginContent() {
    Column(modifier = Modifier.padding(top = 24.dp, bottom = 24.dp, start = 14.dp, end = 14.dp).verticalScroll(rememberScrollState())) {
        LoginHeader()
        LoginBox()
        SeparatingContent()
        OtherLogin()
        Row(modifier = Modifier.fillMaxWidth().padding(top = 24.dp, bottom = 24.dp)) {
            Divider(modifier = Modifier.height(1.dp).border(1.dp, Black40))
        }
        SignUpContents()
    }
}

@Suppress("ktlint:standard:function-naming")
@Composable
fun LoginHeader() {
    Text(
        text = "ログイン",
        fontSize = 18.sp,
        fontWeight = FontWeight.Bold,
        modifier = Modifier.fillMaxWidth(),
        fontFamily = FontFamily(Font(R.font.notosansjp_medium)),
        textAlign = TextAlign.Center,
        style = TextStyle(),
    )
    @Suppress("ktlint:standard:function-naming")
    TextButton(
        onClick = { /* TODO */ },
    ) {
        Text(
            text = "新規会員登録はこちら",
            color = Blue60,
            fontFamily = FontFamily(Font(R.font.notosansjp_medium)),
            fontSize = 14.sp,
            textAlign = TextAlign.End,
            style = TextStyle(),
            modifier = Modifier.fillMaxWidth(),
        )
    }
}

@Suppress("ktlint:standard:function-naming")
@Composable
fun LoginBox() {
    Column {
        Column {
            Text(
                text = "メールまたは電話番号",
                fontFamily = FontFamily(Font(R.font.notosansjp_medium)),
                fontSize = 14.sp,
                modifier = Modifier.fillMaxWidth(),
                textAlign = TextAlign.Start,
                style = TextStyle(),
            )

            OutlinedTextField(
                value = "",
                onValueChange = {},
                textStyle = TextStyle(),
                modifier =
                    Modifier
                        .fillMaxWidth()
                        .padding(top = 8.dp)
                        .height(54.dp),
            )
        }

        Column(modifier = Modifier.padding(top = 24.dp)) {
            Text(
                text = "パスワード",
                fontFamily = FontFamily(Font(R.font.notosansjp_medium)),
                fontSize = 14.sp,
                modifier = Modifier.fillMaxWidth(),
                textAlign = TextAlign.Start,
                style = TextStyle(),
            )

            OutlinedTextField(
                value = "",
                onValueChange = {},
                textStyle = TextStyle(),
                modifier =
                    Modifier
                        .fillMaxWidth()
                        .padding(top = 8.dp)
                        .height(54.dp),
                trailingIcon = {
                    IconButton(onClick = {}) {
                        Icon(Icons.Filled.VisibilityOff, contentDescription = "visibility")
                    }
                },
            )
        }

        Button(
            onClick = {},
            contentPadding = PaddingValues(14.dp),
            shape = RoundedCornerShape(5.dp),
            modifier =
                Modifier
                    .fillMaxWidth()
                    .padding(top = 38.dp),
            colors =
                ButtonDefaults.buttonColors(
                    containerColor = Red,
                ),
        ) {
            Text(
                text = "ログイン",
                fontSize = 14.sp,
                fontFamily = FontFamily(Font(R.font.notosansjp_medium)),
                textAlign = TextAlign.Center,
                style = TextStyle(),
            )
        }
        Row(modifier = Modifier.fillMaxWidth(), verticalAlignment = Alignment.CenterVertically) {
            Text(
                text = linkText(),
                fontSize = 12.sp,
                fontFamily = FontFamily(Font(R.font.notosansjp_medium)),
                style = TextStyle(lineHeight = 14.sp),
                modifier = Modifier.padding(top = 16.dp),
            )
        }
    }
}

@OptIn(ExperimentalTextApi::class)
@Composable
private fun linkText(): AnnotatedString =
    buildAnnotatedString {
        withAnnotation(tag = "terms", annotation = "") {
            withStyle(style = SpanStyle(color = Blue60)) {
                append("利用規約")
            }
        }
        append("および")
        withAnnotation(tag = "privacy", annotation = "") {
            withStyle(style = SpanStyle(color = Blue60)) {
                append("プライバシー")
            }
        }
        append("に同意の上、ログインへお進みください。\n")
        append("このサイトはreCAPTCHAで保護されており、Googleの")
        withAnnotation(tag = "privacy", annotation = "") {
            withStyle(style = SpanStyle(color = Blue60)) {
                append("プライバシー")
            }
        }
        append("と")
        withAnnotation(tag = "terms", annotation = "") {
            withStyle(style = SpanStyle(color = Blue60)) {
                append("利用規約")
            }
        }
        append("が適用されます。")
    }

@Suppress("ktlint:standard:function-naming")
@Composable
private fun SeparatingContent() {
    Row(
        modifier = Modifier.fillMaxWidth().padding(top = 24.dp, bottom = 24.dp),
        verticalAlignment = Alignment.CenterVertically,
    ) {
        Divider(
            modifier =
                Modifier
                    .weight(1f)
                    .height(1.dp)
                    .background(Black40),
        )
        Text(
            text = "または",
            fontSize = 14.sp,
            fontFamily = FontFamily(Font(R.font.notosansjp_medium)),
            color = Black40,
            style = TextStyle(),
            modifier = Modifier.weight(1f),
            textAlign = TextAlign.Center,
        )
        Divider(
            modifier =
                Modifier
                    .weight(1f)
                    .height(1.dp)
                    .background(Black40),
        )
    }
}

@Suppress("ktlint:standard:function-naming")
@Composable
private fun OtherLogin() {
    Column(modifier = Modifier.fillMaxWidth()) {
        Button(
            onClick = {},
            contentPadding = PaddingValues(top = 14.dp, bottom = 14.dp, start = 14.dp, end = 14.dp),
            modifier = Modifier.fillMaxWidth().border(1.dp, Color.Black, shape = RoundedCornerShape(5.dp)),
            colors =
                ButtonDefaults.buttonColors(
                    contentColor = Color.Black,
                    containerColor = Color.White,
                ),
        ) {
            Row(modifier = Modifier.fillMaxWidth()) {
                Icon(
                    imageVector = Icons.Outlined.Mail,
                    contentDescription = "mail",
                    modifier = Modifier.size(24.dp).fillMaxWidth(),
                )
                Text(
                    text = "メールアドレスで登録",
                    fontWeight = FontWeight.Bold,
                    fontFamily = FontFamily(Font(R.font.notosansjp_medium)),
                    fontSize = 16.sp,
                    style = TextStyle(),
                    textAlign = TextAlign.Center,
                    modifier = Modifier.fillMaxWidth(),
                )
            }
        }
        Button(
            onClick = {},
            contentPadding = PaddingValues(top = 14.dp, bottom = 14.dp, start = 14.dp, end = 14.dp),
            modifier = Modifier.fillMaxWidth().padding(top = 16.dp).border(1.dp, Color.Black, shape = RoundedCornerShape(5.dp)),
            colors =
                ButtonDefaults.buttonColors(
                    contentColor = Color.Black,
                    containerColor = Color.White,
                ),
        ) {
            Row(modifier = Modifier.fillMaxWidth()) {
                Image(
                    painter = painterResource(R.drawable.appl_usr_grp_blk_1ln_sm),
                    contentDescription = "apple icon",
                    modifier = Modifier.size(24.dp).fillMaxWidth(),
                )
                Text(
                    text = "Appleで登録",
                    fontWeight = FontWeight.Bold,
                    fontFamily = FontFamily(Font(R.font.notosansjp_medium)),
                    fontSize = 16.sp,
                    style = TextStyle(),
                    textAlign = TextAlign.Center,
                    modifier = Modifier.fillMaxWidth(),
                )
            }
        }
        Button(
            onClick = {},
            contentPadding = PaddingValues(top = 14.dp, bottom = 14.dp, start = 14.dp, end = 14.dp),
            modifier = Modifier.fillMaxWidth().padding(top = 16.dp).border(1.dp, Color.Black, shape = RoundedCornerShape(5.dp)),
            colors =
                ButtonDefaults.buttonColors(
                    contentColor = Color.Black,
                    containerColor = Color.White,
                ),
        ) {
            Row(modifier = Modifier.fillMaxWidth()) {
                Image(
                    painter = painterResource(R.drawable.google_icon),
                    contentDescription = "Google",
                    modifier = Modifier.size(24.dp).fillMaxWidth(),
                )
                Text(
                    text = "Googleで登録",
                    fontWeight = FontWeight.Bold,
                    fontFamily = FontFamily(Font(R.font.notosansjp_medium)),
                    fontSize = 16.sp,
                    style = TextStyle(),
                    textAlign = TextAlign.Center,
                    modifier = Modifier.fillMaxWidth(),
                )
            }
        }
        Button(
            onClick = {},
            contentPadding = PaddingValues(top = 14.dp, bottom = 14.dp, start = 14.dp, end = 14.dp),
            modifier = Modifier.fillMaxWidth().padding(top = 16.dp).border(1.dp, Color.Black, shape = RoundedCornerShape(5.dp)),
            colors =
            ButtonDefaults.buttonColors(
                contentColor = Color.Black,
                containerColor = Color.White,
            ),
        ) {
            Row(modifier = Modifier.fillMaxWidth()) {
                Image(
                    painter = painterResource(R.drawable.line_brand_icon),
                    contentDescription = "Line",
                    modifier = Modifier.size(24.dp).fillMaxWidth(),
                )
                Text(
                    text = "LINEで登録",
                    fontWeight = FontWeight.Bold,
                    fontFamily = FontFamily(Font(R.font.notosansjp_medium)),
                    fontSize = 16.sp,
                    style = TextStyle(),
                    textAlign = TextAlign.Center,
                    modifier = Modifier.fillMaxWidth(),
                )
            }
        }
        Button(
            onClick = {},
            contentPadding = PaddingValues(top = 14.dp, bottom = 14.dp, start = 14.dp, end = 14.dp),
            modifier = Modifier.fillMaxWidth().padding(top = 16.dp).border(1.dp, Color.Black, shape = RoundedCornerShape(5.dp)),
            colors =
                ButtonDefaults.buttonColors(
                    contentColor = Color.Black,
                    containerColor = Color.White,
                ),
        ) {
            Row(modifier = Modifier.fillMaxWidth()) {
                Image(
                    painter = painterResource(R.drawable.facebook_logo_primary),
                    contentDescription = "Facebook",
                    modifier = Modifier.size(24.dp).fillMaxWidth(),
                )
                Text(
                    text = "Facebookで登録",
                    fontWeight = FontWeight.Bold,
                    fontFamily = FontFamily(Font(R.font.notosansjp_medium)),
                    fontSize = 16.sp,
                    style = TextStyle(),
                    textAlign = TextAlign.Center,
                    modifier = Modifier.fillMaxWidth(),
                )
            }
        }
    }
}

@Suppress("ktlint:standard:function-naming")
@Composable
private fun SignUpContents() {
    Column(modifier = Modifier.fillMaxWidth(), horizontalAlignment = Alignment.End) {
        TextButton(onClick = {}, contentPadding = PaddingValues(0.dp)) {
            Text(
                text = "パスワードを忘れた方はこちら",
                color = Blue60,
                fontFamily = FontFamily(Font(R.font.notosansjp_medium)),
                fontSize = 12.sp,
                style = TextStyle(),
            )
            Icon(Icons.Filled.ArrowForwardIos, contentDescription = "back", modifier = Modifier.size(20.dp), tint = Blue60)
        }
        TextButton(onClick = {}, contentPadding = PaddingValues(0.dp)) {
            Text(
                text = "ログインできない方はこちら",
                color = Blue60,
                fontFamily = FontFamily(Font(R.font.notosansjp_medium)),
                fontSize = 12.sp,
                style = TextStyle(),
            )
            Icon(Icons.Filled.ArrowForwardIos, contentDescription = "back", modifier = Modifier.size(20.dp), tint = Blue60)
        }
    }

}

@Suppress("ktlint:standard:function-naming")
@Preview
@Composable
fun PreviewLoginScreen() {
    MaterialTheme {
        LoginScreen()
    }
}
