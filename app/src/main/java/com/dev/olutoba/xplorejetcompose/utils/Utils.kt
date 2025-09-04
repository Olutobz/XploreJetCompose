package com.dev.olutoba.xplorejetcompose.utils

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
