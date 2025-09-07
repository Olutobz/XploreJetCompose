package com.dev.olutoba.xplorejetcompose.utils

import com.dev.olutoba.xplorejetcompose.R
import com.dev.olutoba.xplorejetcompose.models.ArtPiece
import java.text.NumberFormat

internal fun calculateTip(
    billAmount: Double,
    tipPercent: Double,
    isRoundedUp: Boolean
): String {
    var tip = tipPercent / 100 * billAmount
    if (isRoundedUp) {
        tip = kotlin.math.ceil(tip)
    }
    return NumberFormat.getCurrencyInstance().format(tip)
}

internal fun getArtPieceItem(counter: Int): ArtPiece {
    val artPiece = when (counter) {
        1 -> ArtPiece(
            drawableResId = R.drawable.img_golden_gate_bridge,
            contentDescriptionResId = R.string.golden_gate_bridge_content_desc,
            descriptionResId = R.string.sf_dream_as_an_android_engineer
        )

        2 -> ArtPiece(
            drawableResId = R.drawable.img_sf_cable_car,
            contentDescriptionResId = R.string.cable_car_content_desc,
            descriptionResId = R.string.sf_riding_cable_car
        )

        3 -> ArtPiece(
            drawableResId = R.drawable.img_sf_lombard_street,
            contentDescriptionResId = R.string.lombard_street_content_desc,
            descriptionResId = R.string.sf_cruising_lombard_street
        )

        4 -> ArtPiece(
            drawableResId = R.drawable.img_statue_of_liberty_newyork,
            contentDescriptionResId = R.string.statue_of_liberty_content_desc,
            descriptionResId = R.string.ny_statue_of_liberty

        )

        else -> ArtPiece(
            drawableResId = R.drawable.img_golden_gate_bridge,
            contentDescriptionResId = R.string.golden_gate_bridge_content_desc,
            descriptionResId = R.string.sf_dream_as_an_android_engineer
        )
    }

    return artPiece
}
