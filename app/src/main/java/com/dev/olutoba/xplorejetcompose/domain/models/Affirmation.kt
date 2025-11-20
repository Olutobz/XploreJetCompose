package com.dev.olutoba.xplorejetcompose.domain.models

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes


/**
 * Created by Onikoyi Damola Olutoba
 * DATE: 08 November, 2025
 * EMAIL: damexxey94@gmail.com
 */


data class Affirmation(
    @param:StringRes val stringResourceId: Int,
    @param:DrawableRes val imageResourceId: Int
)