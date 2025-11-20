package com.dev.olutoba.xplorejetcompose.ui.view.screens

import androidx.annotation.StringRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.dev.olutoba.xplorejetcompose.R
import com.dev.olutoba.xplorejetcompose.ui.theme.ButtonBackgroundColor
import com.dev.olutoba.xplorejetcompose.ui.theme.XploreJetComposeTheme
import com.dev.olutoba.xplorejetcompose.utils.getArtPieceItem


/**
 * Created by Onikoyi Damola Olutoba
 * DATE: 07 September, 2025
 * EMAIL: damexxey94@gmail.com
 */


@Composable
fun ArtSpaceLayout() {
    var counter by remember { mutableIntStateOf(1) }
    val currArtPieceItem = getArtPieceItem(counter)

    Column(
        verticalArrangement = Arrangement.SpaceAround,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(state = rememberScrollState())
            .padding(32.dp)
    ) {
        Card(
            elevation = CardDefaults.cardElevation(defaultElevation = 8.dp),
            colors = CardDefaults.cardColors(containerColor = Color.White),
            modifier = Modifier.fillMaxWidth()
        ) {
            Image(
                painter = painterResource(currArtPieceItem.drawableResId),
                contentDescription = stringResource(currArtPieceItem.contentDescriptionResId),
                contentScale = ContentScale.Fit,
                modifier = Modifier.padding(36.dp)
            )
        }

        Spacer(modifier = Modifier.height(24.dp))

        DescriptionAndYearText(
            firstTextStringResId = currArtPieceItem.descriptionResId,
            secondTextStringResId = R.string.my_name_year_signature
        )

        Spacer(modifier = Modifier.height(16.dp))

        CustomButtonsWithAction(
            firstButtonStringResId = R.string.previous,
            secondButtonStringResId = R.string.next,
            onFirstButtonClick = { if (counter > 0) counter-- else counter = 4 },
            onSecondButtonClick = { if (counter < 5) counter++ else counter = 1 }
        )

    }
}

@Composable
private fun CustomButtonsWithAction(
    @StringRes firstButtonStringResId: Int,
    @StringRes secondButtonStringResId: Int,
    onFirstButtonClick: () -> Unit,
    onSecondButtonClick: () -> Unit
) {
    Row(
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier.fillMaxWidth()
    ) {
        Button(
            onClick = { onFirstButtonClick() },
            colors = ButtonDefaults.buttonColors(containerColor = ButtonBackgroundColor)
        ) {
            Text(text = stringResource(firstButtonStringResId))
        }

        Spacer(modifier = Modifier.width(8.dp))

        Button(
            onClick = { onSecondButtonClick() },
            colors = ButtonDefaults.buttonColors(containerColor = ButtonBackgroundColor)
        ) {
            Text(text = stringResource(secondButtonStringResId))
        }
    }
}

@Composable
private fun DescriptionAndYearText(
    @StringRes firstTextStringResId: Int,
    @StringRes secondTextStringResId: Int
) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color.LightGray)
            .padding(12.dp)
    ) {
        Text(
            text = stringResource(firstTextStringResId),
        )

        Text(
            text = stringResource(secondTextStringResId),
            fontWeight = FontWeight.Bold
        )
    }
}

@Preview(showSystemUi = true, showBackground = true)
@Composable
fun PreviewArtSpaceLayout() {
    XploreJetComposeTheme {
        ArtSpaceLayout()
    }
}
