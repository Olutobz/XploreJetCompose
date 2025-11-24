package com.dev.olutoba.xplorejetcompose.data.datasource.local

import com.dev.olutoba.xplorejetcompose.R
import com.dev.olutoba.xplorejetcompose.domain.models.Dog


/**
 * Created by Onikoyi Damola Olutoba
 * DATE: 23 November, 2025
 * EMAIL: damexxey94@gmail.com
 */

fun loadDogsInfo(): List<Dog> {
    return listOf(
        Dog(
            name = R.string.dog_name_1,
            age = 2,
            hobbies = R.string.dog_description_1,
            imageResourceId = R.drawable.koda
        ),
        Dog(
            name = R.string.dog_name_2,
            age = 9,
            hobbies = R.string.dog_description_2,
            imageResourceId = R.drawable.lola
        ),
        Dog(
            name = R.string.dog_name_2,
            age = 9,
            hobbies = R.string.dog_description_2,
            imageResourceId = R.drawable.lola
        ),
        Dog(
            name = R.string.dog_name_3,
            age = 11,
            hobbies = R.string.dog_description_3,
            imageResourceId = R.drawable.frankie
        ),
        Dog(
            name = R.string.dog_name_4,
            age = 9,
            hobbies = R.string.dog_description_4,
            imageResourceId = R.drawable.nox
        ),
        Dog(
            name = R.string.dog_name_4,
            age = 9,
            hobbies = R.string.dog_description_4,
            imageResourceId = R.drawable.nox
        ),
        Dog(
            name = R.string.dog_name_5,
            age = 14,
            hobbies = R.string.dog_description_5,
            imageResourceId = R.drawable.faye
        ),
        Dog(
            name = R.string.dog_name_6,
            age = 8,
            hobbies = R.string.dog_description_6,
            imageResourceId = R.drawable.bella
        ),
        Dog(
            name = R.string.dog_name_6,
            age = 8,
            hobbies = R.string.dog_description_6,
            imageResourceId = R.drawable.bella
        ),
        Dog(
            name = R.string.dog_name_7,
            age = 3,
            hobbies = R.string.dog_description_7,
            imageResourceId = R.drawable.moana
        ),
        Dog(
            name = R.string.dog_name_8,
            age = 2,
            hobbies = R.string.dog_description_8,
            imageResourceId = R.drawable.tzeitel
        ),
        Dog(
            name = R.string.dog_name_8,
            age = 2,
            hobbies = R.string.dog_description_8,
            imageResourceId = R.drawable.tzeitel
        ),
        Dog(
            name = R.string.dog_name_9,
            age = 5,
            hobbies = R.string.dog_description_9,
            imageResourceId = R.drawable.leroy
        ),
        Dog(
            name = R.string.dog_name_9,
            age = 5,
            hobbies = R.string.dog_description_9,
            imageResourceId = R.drawable.leroy
        )
    )
}