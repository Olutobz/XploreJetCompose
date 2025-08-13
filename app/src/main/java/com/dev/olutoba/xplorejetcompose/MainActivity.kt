package com.dev.olutoba.xplorejetcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.dev.olutoba.xplorejetcompose.ui.components.LemonadeApp
import com.dev.olutoba.xplorejetcompose.ui.theme.XploreJetComposeTheme


class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            XploreJetComposeTheme {
                LemonadeApp()
            }
        }
    }

}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    XploreJetComposeTheme {
        LemonadeApp()
    }
}