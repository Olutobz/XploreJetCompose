package com.dev.olutoba.xplorejetcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.dev.olutoba.xplorejetcompose.ui.theme.XploreJetComposeTheme


class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Surface(
                color = MaterialTheme.colorScheme.background,
                shape = RoundedCornerShape(12.dp),
                tonalElevation = 4.dp,
                modifier = Modifier
                    .padding(16.dp)
                    .fillMaxSize()
            ) {

            }
        }
    }

}

@Composable
fun BirthdayGreeting(message: String, from: String) {
    Row {
        Text(
            text = message,
            modifier = Modifier
                .padding(start = 16.dp, top = 16.dp)
        )
        Text(
            text = from,
            modifier = Modifier
                .padding(start = 16.dp, top = 16.dp)
        )
    }
}

@Composable
fun GreetingText(message: String, from: String) {
    Column(modifier = Modifier.padding(top = 16.dp)) {
        Text(
            text = message,
            modifier = Modifier
                .padding(start = 16.dp, top = 16.dp),
            fontSize = 20.sp,
            color = Color.Black,
            lineHeight = 25.sp,
        )

        Text(
            text = from,
            modifier = Modifier
                .padding(start = 16.dp, top = 16.dp, end = 16.dp),
            fontSize = 20.sp,
            color = Color.Red
        )
    }
}

@Preview(
    showBackground = true,
    showSystemUi = true,
    name = "My Preview",
)
@Composable
fun GreetingPreview() {
    XploreJetComposeTheme {
        Column {
            BirthdayGreeting(message = "Welcome", from = "Olutoba")
            GreetingText(
                message = "I will get a software engineer role!!",
                from = "I will relocate to live in San Francisco, California"
            )
        }
    }
}