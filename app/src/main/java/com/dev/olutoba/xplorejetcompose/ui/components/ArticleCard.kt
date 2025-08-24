package com.dev.olutoba.xplorejetcompose.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
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
import com.dev.olutoba.xplorejetcompose.ui.theme.XploreJetComposeTheme


/**
 * Created by Onikoyi Damola Olutoba
 * DATE: 10 August, 2025
 * EMAIL: damexxey94@gmail.com
 */

@Composable
private fun ComposeArticleApp() {
    ArticleCardItem(
        title = stringResource(R.string.article_title),
        shortDescription = stringResource(R.string.article_short_description),
        longDescription = stringResource(R.string.article_long_description),
        painter = painterResource(R.drawable.bg_compose_background),
    )
}

@Composable
private fun ArticleCardItem(
    title: String,
    shortDescription: String,
    longDescription: String,
    painter: Painter,
    modifier: Modifier = Modifier
) {
    Column(modifier = modifier) {
        Image(
            painter = painter,
            contentDescription = null,
            modifier = Modifier
                .fillMaxWidth()
                .padding(all = 8.dp)
        )

        Text(
            text = title,
            fontSize = 24.sp,
            modifier = modifier
                .padding(16.dp)
                .align(Alignment.CenterHorizontally)
        )

        Text(
            text = shortDescription,
            textAlign = TextAlign.Justify,
            modifier = modifier.padding(start = 16.dp, end = 16.dp)
        )

        Text(
            text = longDescription,
            color = Color.DarkGray,
            textAlign = TextAlign.Justify,
            modifier = modifier.padding(16.dp)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewArticleCard() {
    XploreJetComposeTheme {
        ComposeArticleApp()
    }
}
