package com.dev.olutoba.xplorejetcompose.daggerhilt.data.datasource.local

import com.dev.olutoba.xplorejetcompose.R
import com.dev.olutoba.xplorejetcompose.models.Affirmation


/**
 * Created by Onikoyi Damola Olutoba
 * DATE: 16 November, 2025
 * EMAIL: damexxey94@gmail.com
 */


fun loadAffirmations(): List<Affirmation> {
    return listOf(
        Affirmation(
            stringResourceId = R.string.affirmation1,
            imageResourceId = R.drawable.img_affirmation_1
        ),
        Affirmation(
            stringResourceId = R.string.affirmation2,
            imageResourceId = R.drawable.img_affirmation_2
        ),
        Affirmation(
            stringResourceId = R.string.affirmation3,
            imageResourceId = R.drawable.img_affirmation_3
        ),
        Affirmation(
            stringResourceId = R.string.affirmation4,
            imageResourceId = R.drawable.img_affirmation_4
        ),
        Affirmation(
            stringResourceId = R.string.affirmation5,
            imageResourceId = R.drawable.img_affirmation_5
        ),
        Affirmation(
            stringResourceId = R.string.affirmation6,
            imageResourceId = R.drawable.img_affirmation_6
        ),
        Affirmation(
            stringResourceId = R.string.affirmation7,
            imageResourceId = R.drawable.img_affirmation_7
        ),
        Affirmation(
            stringResourceId = R.string.affirmation8,
            imageResourceId = R.drawable.img_affirmation_8
        ),
        Affirmation(
            stringResourceId = R.string.affirmation9,
            imageResourceId = R.drawable.img_affirmation_9
        ),
        Affirmation(
            stringResourceId = R.string.affirmation10,
            imageResourceId = R.drawable.img_affirmation_10
        )
    )
}
