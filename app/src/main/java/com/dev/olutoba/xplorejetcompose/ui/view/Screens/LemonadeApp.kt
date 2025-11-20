package com.dev.olutoba.xplorejetcompose.ui.view.Screens

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.dev.olutoba.xplorejetcompose.R


/**
 * Created by Onikoyi Damola Olutoba
 * DATE: 11 August, 2025
 * EMAIL: damexxey94@gmail.com
 */


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LemonadeScreen(modifier: Modifier = Modifier) {
    var currentStep by remember { mutableIntStateOf(1) }
    var squeezeCount by remember { mutableIntStateOf(0) }

    Scaffold(
        topBar = {
            CenterAlignedTopAppBar(
                title = {
                    Text(text = stringResource(R.string.lemonade_text))
                },
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = MaterialTheme.colorScheme.primaryContainer
                )
            )
        }
    ) { innerPadding ->
        Surface(
            color = MaterialTheme.colorScheme.background,
            modifier = modifier
                .fillMaxSize()
                .padding(paddingValues = innerPadding)
        ) {
            when (currentStep) {
                1 -> {
                    LemonadeTextAndImageItem(
                        textResourceId = R.string.tap_lemon_tree_text,
                        contentDescriptionResId = R.string.lemon_tree_content_description,
                        drawableResId = R.drawable.lemon_tree,
                        onImageClick = {
                            currentStep = 2
                            squeezeCount = (3..6).random()
                        }
                    )
                }

                2 -> {
                    LemonadeTextAndImageItem(
                        textResourceId = R.string.tap_to_squeeze_lemon_text,
                        contentDescriptionResId = R.string.squeeze_lemon_content_description,
                        drawableResId = R.drawable.lemon_squeeze,
                        onImageClick = {
                            if (squeezeCount == 0) currentStep = 3
                            squeezeCount--
                        }
                    )
                }

                3 -> {
                    LemonadeTextAndImageItem(
                        textResourceId = R.string.tap_to_drink_lemon_text,
                        contentDescriptionResId = R.string.glass_of_lemonade_content_description,
                        drawableResId = R.drawable.lemon_drink,
                        onImageClick = { currentStep = 4 }
                    )
                }

                4 -> {
                    LemonadeTextAndImageItem(
                        textResourceId = R.string.tap_to_empty_glass_text,
                        contentDescriptionResId = R.string.empty_glass_content_description,
                        drawableResId = R.drawable.lemon_restart,
                        onImageClick = { currentStep = 1 }
                    )
                }
            }
        }
    }
}

@Composable
private fun LemonadeTextAndImageItem(
    @StringRes textResourceId: Int,
    @StringRes contentDescriptionResId: Int,
    @DrawableRes drawableResId: Int,
    onImageClick: () -> Unit,
) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
    ) {
        Button(
            onClick = onImageClick,
            shape = RoundedCornerShape(dimensionResource(R.dimen.button_corner_radius)),
            colors = ButtonDefaults.buttonColors(
                containerColor = MaterialTheme.colorScheme.tertiaryContainer
            )
        ) {
            Image(
                painter = painterResource(drawableResId),
                contentDescription = stringResource(contentDescriptionResId),
                modifier = Modifier
                    .width(dimensionResource(R.dimen.button_image_width))
                    .height(dimensionResource(R.dimen.button_image_height))
                    .padding(dimensionResource(R.dimen.button_interior_padding))
            )
        }

        Spacer(modifier = Modifier.height(dimensionResource(R.dimen.padding_vertical)))

        Text(
            text = stringResource(textResourceId),
            style = MaterialTheme.typography.bodyLarge
        )
    }
}


@Preview(showBackground = true)
@Composable
private fun PreviewLemonadeScreen() {
    LemonadeScreen()
}