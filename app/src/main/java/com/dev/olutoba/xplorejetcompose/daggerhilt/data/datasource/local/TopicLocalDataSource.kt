package com.dev.olutoba.xplorejetcompose.daggerhilt.data.datasource.local

import com.dev.olutoba.xplorejetcompose.R
import com.dev.olutoba.xplorejetcompose.models.Topic


/**
 * Created by Onikoyi Damola Olutoba
 * DATE: 16 November, 2025
 * EMAIL: damexxey94@gmail.com
 */

fun loadTopics(): List<Topic> {
    return listOf(
        Topic(
            id = 58,
            topicStringResourceId = R.string.architecture,
            topicDrawableResourceId = R.drawable.architecture
        ),
        Topic(
            id = 121,
            topicStringResourceId = R.string.crafts,
            topicDrawableResourceId = R.drawable.crafts
        ),
        Topic(
            id = 78,
            topicStringResourceId = R.string.business,
            topicDrawableResourceId = R.drawable.business
        ),
        Topic(
            id = 118,
            topicStringResourceId = R.string.culinary,
            topicDrawableResourceId = R.drawable.culinary
        ),
        Topic(
            id = 423,
            topicStringResourceId = R.string.design,
            topicDrawableResourceId = R.drawable.design
        ),
        Topic(
            id = 92,
            topicStringResourceId = R.string.fashion,
            topicDrawableResourceId = R.drawable.fashion
        ),
        Topic(
            id = 165,
            topicStringResourceId = R.string.film,
            topicDrawableResourceId = R.drawable.film
        ),
        Topic(
            id = 164,
            topicStringResourceId = R.string.gaming,
            topicDrawableResourceId = R.drawable.gaming
        ),
        Topic(
            id = 326,
            topicStringResourceId = R.string.drawing,
            topicDrawableResourceId = R.drawable.drawing
        ),
        Topic(
            id = 305,
            topicStringResourceId = R.string.lifestyle,
            topicDrawableResourceId = R.drawable.lifestyle
        ),
        Topic(
            id = 212,
            topicStringResourceId = R.string.music,
            topicDrawableResourceId = R.drawable.music
        ),
        Topic(
            id = 172,
            topicStringResourceId = R.string.painting,
            topicDrawableResourceId = R.drawable.painting
        ),
        Topic(
            id = 321,
            topicStringResourceId = R.string.photography,
            topicDrawableResourceId = R.drawable.photography
        ),
        Topic(
            id = 118,
            topicStringResourceId = R.string.tech,
            topicDrawableResourceId = R.drawable.tech
        )
    )
}