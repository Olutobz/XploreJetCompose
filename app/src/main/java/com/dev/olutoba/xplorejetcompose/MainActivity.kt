package com.dev.olutoba.xplorejetcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.dev.olutoba.xplorejetcompose.ui.theme.ColumnTitleColor
import com.dev.olutoba.xplorejetcompose.ui.theme.ImageTitleColor
import com.dev.olutoba.xplorejetcompose.ui.theme.RowTitleColor
import com.dev.olutoba.xplorejetcompose.ui.theme.TextTitleColor
import com.dev.olutoba.xplorejetcompose.ui.theme.XploreJetComposeTheme


class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

        }
    }

}


@Composable
private fun GreetingText(message: String, from: String, modifier: Modifier = Modifier) {
    Column(
        modifier = modifier,
        verticalArrangement = Arrangement.Center,
    ) {
        Text(
            text = message,
            fontSize = 40.sp,
            lineHeight = 40.sp,
            textAlign = TextAlign.Center,
            modifier = Modifier
                .background(Color.White)
                .padding(all = 8.dp)

        )

        Text(
            text = from,
            fontSize = 25.sp,
            color = Color.Blue,
            lineHeight = 35.sp,
            modifier = Modifier
                .padding(all = 16.dp)
                .background(Color.White)
                .align(alignment = Alignment.CenterHorizontally)
        )
    }
}


@Composable
private fun GreetingImage(message: String, from: String, modifier: Modifier = Modifier) {
    Box(modifier = modifier) {
        Image(
            painter = painterResource(R.drawable.androidparty),
            contentDescription = null,
            contentScale = ContentScale.Crop,
            alpha = 0.6f
        )

        GreetingText(
            message = message,
            from = from,
            modifier = Modifier
                .fillMaxSize()
                .padding(8.dp)
        )
    }
}

@Composable
private fun ComposeArticleApp() {
    ArticleCard(
        title = stringResource(R.string.article_title),
        shortDescription = stringResource(R.string.article_short_desc),
        longDescription = stringResource(R.string.article_long_desc),
        painter = painterResource(R.drawable.bg_compose_background),
    )
}

@Composable
private fun ArticleCard(
    title: String,
    shortDescription: String,
    longDescription: String,
    painter: Painter,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier,
    ) {
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
            modifier = modifier.padding(16.dp)
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

@Composable
private fun TaskCompletedScreen() {
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.fillMaxSize()
    ) {
        Image(
            painter = painterResource(R.drawable.ic_task_completed),
            contentDescription = null
        )

        Text(
            text = stringResource(R.string.all_tasks_completed),
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(top = 24.dp, bottom = 8.dp)
        )

        Text(
            text = stringResource(R.string.nice_work),
            fontSize = 16.sp,
        )
    }
}

@Composable
private fun ComposeQuadrantApp() {
    Column(modifier = Modifier.fillMaxSize()) {
        Row(modifier = Modifier.weight(1f)) {
            QuadrantInfoCard(
                title = stringResource(R.string.text_composable_title),
                description = stringResource(R.string.text_title_description),
                backgroundColor = TextTitleColor,
                modifier = Modifier.weight(1f)
            )

            QuadrantInfoCard(
                title = stringResource(R.string.image_composable_title),
                description = stringResource(R.string.img_title_description),
                backgroundColor = ImageTitleColor,
                modifier = Modifier.weight(1f)
            )
        }

        Row(modifier = Modifier.weight(1f)) {
            QuadrantInfoCard(
                title = stringResource(R.string.row_composable_title),
                description = stringResource(R.string.row_title_description),
                backgroundColor = RowTitleColor,
                modifier = Modifier.weight(1f)

            )

            QuadrantInfoCard(
                title = stringResource(R.string.column_composable_title),
                description = stringResource(R.string.column_title_description),
                backgroundColor = ColumnTitleColor,
                modifier = Modifier.weight(1f)
            )
        }
    }

}

@Composable
private fun QuadrantInfoCard(
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


@Preview(
    showBackground = true,
    showSystemUi = true,
)
@Composable
fun GreetingPreview() {
    XploreJetComposeTheme {
        ComposeQuadrantApp()
    }
}