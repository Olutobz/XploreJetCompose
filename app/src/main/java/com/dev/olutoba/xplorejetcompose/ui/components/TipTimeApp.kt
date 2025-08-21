package com.dev.olutoba.xplorejetcompose.ui.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.safeDrawingPadding
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.dev.olutoba.xplorejetcompose.ui.theme.XploreJetComposeTheme


/**
 * Created by Onikoyi Damola Olutoba
 * DATE: 14 August, 2025
 * EMAIL: damexxey94@gmail.com
 */


@Composable
fun TipTimeLayout() {
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .statusBarsPadding()
            .safeDrawingPadding()
            .padding(horizontal = 40.dp)
            .safeDrawingPadding()
    ) {
        Text(
            text = "Calculate Tip",
            modifier = Modifier

        )

        Text(text = "Bill Amount")

        Text(text = "Tip Amount: $15.00")
    }
}


@Preview(showBackground = true, showSystemUi = true)
@Composable
fun PreviewTipTimeLayout() {
    XploreJetComposeTheme {
        TipTimeLayout()
    }
}
