package com.dev.olutoba.xplorejetcompose.ui.view.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.dev.olutoba.xplorejetcompose.R
import com.dev.olutoba.xplorejetcompose.ui.theme.LightGreenBackgroundColor


/**
 * Created by Onikoyi Damola Olutoba
 * DATE: 10 August, 2025
 * EMAIL: damexxey94@gmail.com
 */

@Composable
private fun BusinessCardScreen() {
    Column(modifier = Modifier.background(LightGreenBackgroundColor)) {
        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .weight(1f)
                .fillMaxSize()
        ) {
            Image(
                painter = painterResource(R.drawable.android_logo),
                contentDescription = null,
                modifier = Modifier
                    .background(Color.Black)
                    .size(100.dp)
            )

            Text(
                text = stringResource(R.string.damola_onikoyi_text),
                fontSize = 50.sp
            )

            Text(text = stringResource(R.string.android_developer_experience_text))
        }

        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .fillMaxSize()
                .weight(0.2f)
        ) {
            ContactInfoData(
                title = stringResource(R.string.phone_number_text),
                icon = painterResource(R.drawable.baseline_call_24)
            )

            ContactInfoData(
                title = stringResource(R.string.share_with_text),
                icon = painterResource(R.drawable.baseline_share_24)
            )

            ContactInfoData(
                title = stringResource(R.string.text_email),
                icon = painterResource(R.drawable.baseline_email_24)
            )
        }
    }
}


@Composable
private fun ContactInfoData(
    title: String,
    icon: Painter,
    modifier: Modifier = Modifier
) {
    Row(
        horizontalArrangement = Arrangement.Center,
        verticalAlignment = Alignment.CenterVertically,
        modifier = modifier
            .fillMaxWidth()
            .padding(4.dp)
    ) {
        Icon(
            painter = icon,
            contentDescription = null,
            modifier = modifier
                .weight(0.4f)
        )

        Text(
            text = title,
            textAlign = TextAlign.Start,
            style = MaterialTheme.typography.bodyMedium,
            modifier = modifier
                .weight(0.7f)
        )
    }
}


@Composable
@Preview(showBackground = true)
fun PreviewBusinessCard() {
    BusinessCardScreen()
}
