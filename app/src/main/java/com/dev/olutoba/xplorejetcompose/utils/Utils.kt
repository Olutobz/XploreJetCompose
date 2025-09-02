package com.dev.olutoba.xplorejetcompose.utils

import java.text.NumberFormat


internal fun calculateTip(billAmount: Double, tipPercent: Double, isRoundUp: Boolean): String {
    var tip = tipPercent / 100 * billAmount
    if (isRoundUp) {
        tip = kotlin.math.ceil(tip)
    }
    return NumberFormat.getCurrencyInstance().format(tip)
}
