package com.example.uitestfigma

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.foundation.shape.RoundedCornerShape

import com.example.uitestfigma.ui.theme.UITestFigmaTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            UITestFigmaTheme {
                UIReplaceable()
            }
        }
    }
}

@Composable
fun UIReplaceable() {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {


        Box(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 90.dp),
            contentAlignment = Alignment.Center
        ) {
            Image(
                painter = painterResource(id = R.drawable.elm_logo),
                contentDescription = "Logo",
                modifier = Modifier
                    .size(180.dp)
            )
        }


        Text(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 30.dp, bottom = 30.dp),
            text = "Login here",
            textAlign = TextAlign.Center,
            fontSize = 30.sp,
            fontWeight = FontWeight.Bold,
            color = Color.Black
        )


        Text(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 1.dp, start = 70.dp, end = 70.dp),
            text = "Welcome back you've been missed!",
            letterSpacing = 0.90.sp,
            lineHeight = 30.sp,
            textAlign = TextAlign.Center,
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold,
            color = Color.Black
        )


        TextField(
            value = "",
            onValueChange = {},
            label = {
                Text(
                    fontWeight = FontWeight.Bold,
                    text = "Email"
                )
            },
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 20.dp, bottom = 20.dp, start = 30.dp, end = 30.dp),
        )
        TextField(
            value = "",
            onValueChange = {},
            label = {
                Text(
                    fontWeight = FontWeight.Bold,
                    text = "Password"
                )
            },
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 10.dp, bottom = 20.dp, start = 30.dp, end = 30.dp)

        )


        Text(
            text = "Forgot Password?",
            fontSize = 12.sp,
            fontWeight = FontWeight.Bold,
            color = Color.Black,
            modifier = Modifier
                .padding(start = 210.dp)
        )

        Button(
            onClick = {},
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 20.dp, bottom = 20.dp, start = 30.dp, end = 30.dp)
                .size(50.dp)
        ) {
            Text("Sign In", color = Color.White)
        }
    }
}

@Composable
fun PreviewUIReplaceable() {
    UITestFigmaTheme {
        UIReplaceable()
    }
}
