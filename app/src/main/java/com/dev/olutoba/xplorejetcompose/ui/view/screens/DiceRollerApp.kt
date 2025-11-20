package com.dev.olutoba.xplorejetcompose.ui.view.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.dev.olutoba.xplorejetcompose.R
import com.dev.olutoba.xplorejetcompose.ui.theme.XploreJetComposeTheme


/**
 * Created by Onikoyi Damola Olutoba
 * DATE: 10 August, 2025
 * EMAIL: damexxey94@gmail.com
 */


@Composable
fun DiceWithButtonAndImage() {

    var result by remember { mutableIntStateOf(1) }
    val drawableResource = when (result) {
        1 -> R.drawable.dice_1
        2 -> R.drawable.dice_2
        3 -> R.drawable.dice_3
        4 -> R.drawable.dice_4
        5 -> R.drawable.dice_5
        else -> R.drawable.dice_6
    }

    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
            .wrapContentSize()
    ) {
        Image(
            painter = painterResource(drawableResource),
            contentDescription = result.toString()
        )

        Spacer(modifier = Modifier.height(16.dp))

        Button(onClick = { result = (1..6).random() }) {
            Text(text = stringResource(R.string.roll_button_text))
        }
    }
}


@Preview(showBackground = true, showSystemUi = true)
@Composable
fun PreviewDiceRoller() {
    XploreJetComposeTheme {
        DiceWithButtonAndImage()
    }
}
