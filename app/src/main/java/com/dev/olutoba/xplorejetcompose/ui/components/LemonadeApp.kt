package com.dev.olutoba.xplorejetcompose.ui.components

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
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
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.dev.olutoba.xplorejetcompose.R
import kotlin.random.Random


/**
 * Created by Onikoyi Damola Olutoba
 * DATE: 11 August, 2025
 * EMAIL: damexxey94@gmail.com
 */


@Composable
fun LemonadeApp(modifier: Modifier = Modifier) {
    var currentStep by remember {
        mutableIntStateOf(Random.nextInt(from = 1, until = 5))
    }

    var squeezeCount by remember { mutableIntStateOf(0) }

    Surface(
        modifier = Modifier.fillMaxSize(),
        color = MaterialTheme.colorScheme.background
    ) {
        when (currentStep) {
            1 -> {
                LemonadeTextAndImageItem(
                    textResourceId = R.string.tap_lemon_tree_text,
                    contentDescriptionResId = R.string.lemon_tree_content_description,
                    drawableResId = R.drawable.lemon_tree,
                    onImageClick = {
                        currentStep = 2
                        squeezeCount = (4..7).random()
                    },
                )
            }

            2 -> {
                LemonadeTextAndImageItem(
                    textResourceId = R.string.tap_to_squeeze_lemon_text,
                    contentDescriptionResId = R.string.squeeze_lemon_content_description,
                    drawableResId = R.drawable.lemon_squeeze,
                    onImageClick = {
                        squeezeCount--
                        if (squeezeCount == 0) currentStep = 3
                    }
                )
            }

            3 -> {
                LemonadeTextAndImageItem(
                    textResourceId = R.string.tap_to_drink_lemon_text,
                    contentDescriptionResId = R.string.glass_of_lemonade_content_description,
                    drawableResId = R.drawable.lemon_drink,
                    onImageClick = {
                        currentStep = 4
                    }
                )
            }

            4 -> {
                LemonadeTextAndImageItem(
                    textResourceId = R.string.tap_to_empty_glass_text,
                    contentDescriptionResId = R.string.empty_glass_content_description,
                    drawableResId = R.drawable.lemon_restart,
                    onImageClick = {
                        currentStep = 1
                    }
                )
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
            colors = ButtonDefaults.buttonColors(containerColor = MaterialTheme.colorScheme.tertiaryContainer)
        ) {
            Image(
                painter = painterResource(drawableResId),
                contentDescription = stringResource(contentDescriptionResId),
            )
        }

        Spacer(modifier = Modifier.height(16.dp))

        Text(
            text = stringResource(textResourceId),
            fontSize = 18.sp,
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun PreviewLemonadeApp() {
    LemonadeApp(
        modifier = Modifier
            .fillMaxSize()
            .wrapContentSize()
    )
}