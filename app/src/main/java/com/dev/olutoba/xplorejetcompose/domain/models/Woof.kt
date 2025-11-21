package com.dev.olutoba.xplorejetcompose.domain.models

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes


/**
 * Created by Onikoyi Damola Olutoba
 * DATE: 23 November, 2025
 * EMAIL: damexxey94@gmail.com
 */

data class Woof(
    @param:StringRes val name: Int,
    @param:StringRes val age: Int,
    @param:DrawableRes val image: Int
)
