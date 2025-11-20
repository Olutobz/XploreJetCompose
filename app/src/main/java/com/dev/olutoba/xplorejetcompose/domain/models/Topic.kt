package com.dev.olutoba.xplorejetcompose.domain.models

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes


/**
 * Created by Onikoyi Damola Olutoba
 * DATE: 16 November, 2025
 * EMAIL: damexxey94@gmail.com
 */

data class Topic(
    val availableCourses: Int,
    @param:StringRes val topicNameResourceId: Int,
    @param:DrawableRes val topicImageResourceId: Int
)
