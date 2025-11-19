package com.dev.olutoba.xplorejetcompose.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.dev.olutoba.xplorejetcompose.R
import com.dev.olutoba.xplorejetcompose.ui.theme.ColumnTitleColor
import com.dev.olutoba.xplorejetcompose.ui.theme.ImageTitleColor
import com.dev.olutoba.xplorejetcompose.ui.theme.RowTitleColor
import com.dev.olutoba.xplorejetcompose.ui.theme.TextTitleColor
import com.dev.olutoba.xplorejetcompose.ui.theme.XploreJetComposeTheme


/**
 * Created by Onikoyi Damola Olutoba
 * DATE: 10 August, 2025
 * EMAIL: damexxey94@gmail.com
 */


@Composable
private fun ComposeQuadrantApp() {
    Column(modifier = Modifier.fillMaxSize()) {
        Row(modifier = Modifier.weight(1f)) {
            QuadrantInfoCardItem(
                title = stringResource(R.string.text_composable_title),
                description = stringResource(R.string.text_title_description),
                backgroundColor = TextTitleColor,
                modifier = Modifier.weight(1f)
            )

            QuadrantInfoCardItem(
                title = stringResource(R.string.image_composable_title),
                description = stringResource(R.string.img_title_description),
                backgroundColor = ImageTitleColor,
                modifier = Modifier.weight(1f)
            )
        }

        Row(modifier = Modifier.weight(1f)) {
            QuadrantInfoCardItem(
                title = stringResource(R.string.row_composable_title),
                description = stringResource(R.string.row_title_description),
                backgroundColor = RowTitleColor,
                modifier = Modifier.weight(1f)
            )

            QuadrantInfoCardItem(
                title = stringResource(R.string.column_composable_title),
                description = stringResource(R.string.column_title_description),
                backgroundColor = ColumnTitleColor,
                modifier = Modifier.weight(1f)
            )
        }
    }
}


@Composable
private fun QuadrantInfoCardItem(
    title: String,
    description: String,
    backgroundColor: Color,
    modifier: Modifier = Modifier
) {
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier
            .background(backgroundColor)
            .fillMaxSize()
            .padding(16.dp)
    ) {
        Text(
            text = title,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(bottom = 16.dp)
        )

        Text(
            text = description,
            textAlign = TextAlign.Justify
        )
    }
}


@Preview(showBackground = true)
@Composable
fun PreviewComposeQuadrant() {
    XploreJetComposeTheme {
        ComposeQuadrantApp()
    }
}
