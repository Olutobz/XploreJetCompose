package com.dev.olutoba.xplorejetcompose.domain.models

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes


/**
 * Created by Onikoyi Damola Olutoba
 * DATE: 23 November, 2025
 * EMAIL: damexxey94@gmail.com
 */

data class Dog(
    @param:StringRes val name: Int,
    val age: Int,
    @param:StringRes val hobbies: Int,
    @param:DrawableRes val imageResourceId: Int
)
