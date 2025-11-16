package com.dev.olutoba.xplorejetcompose.models

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes


/**
 * Created by Onikoyi Damola Olutoba
 * DATE: 16 November, 2025
 * EMAIL: damexxey94@gmail.com
 */

data class Topic(
    val id: Int,
    @param:StringRes val topicStringResourceId: Int,
    @param:DrawableRes val topicDrawableResourceId: Int
)
