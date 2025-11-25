package com.dev.olutoba.xplorejetcompose.ui.view.screens

import android.content.res.Configuration
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import com.dev.olutoba.xplorejetcompose.R
import com.dev.olutoba.xplorejetcompose.data.datasource.local.loadDogsInfo
import com.dev.olutoba.xplorejetcompose.domain.models.Dog
import com.dev.olutoba.xplorejetcompose.ui.theme.WoofTheme


/**
 * Created by Onikoyi Damola Olutoba
 * DATE: 23 November, 2025
 * EMAIL: damexxey94@gmail.com
 */


@Composable
fun DogScreen() {
    Surface(
        color = MaterialTheme.colorScheme.background,
        modifier = Modifier.fillMaxSize()
    ) {
        DogList()
    }
}


@Composable
fun DogList() {
    LazyColumn {
        items(items = loadDogsInfo()) { dog ->
            DogItem(dog = dog)
        }
    }
}


@Composable
fun DogItem(dog: Dog, modifier: Modifier = Modifier) {
    Row(
        horizontalArrangement = Arrangement.Start,
        verticalAlignment = Alignment.CenterVertically,
        modifier = modifier
            .fillMaxWidth()
            .padding(dimensionResource(R.dimen.padding_small))
    ) {
        Image(
            painter = painterResource(dog.imageResourceId),
            contentDescription = null,
            modifier = modifier
                .size(dimensionResource(R.dimen.image_size))
                .padding(dimensionResource(R.dimen.padding_small))
        )

        Column {
            Text(
                text = stringResource(dog.name),
                style = MaterialTheme.typography.bodyMedium,
                fontWeight = FontWeight.Bold,
                modifier = Modifier
                    .padding(top = dimensionResource(R.dimen.padding_small))
            )

            Text(
                text = stringResource(R.string.years_old, dog.age),
                style = MaterialTheme.typography.bodySmall
            )
        }
    }
}

@Preview(showBackground = true)
@Preview(
    name = "Dark Mode Preview",
    uiMode = Configuration.UI_MODE_NIGHT_YES,
    showBackground = true
)
@Composable
fun PreviewWoofScreen() {
    WoofTheme {
        DogScreen()
    }
}