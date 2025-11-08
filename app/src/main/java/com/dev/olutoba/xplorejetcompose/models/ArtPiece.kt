package com.dev.olutoba.xplorejetcompose.models

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes


/**
 * Created by Onikoyi Damola Olutoba
 * DATE: 07 September, 2025
 * EMAIL: damexxey94@gmail.com
 */

data class ArtPiece(
    @param:DrawableRes val drawableResId: Int,
    @param:StringRes val contentDescriptionResId: Int,
    @param:StringRes val descriptionResId: Int
)
