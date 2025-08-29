package com.dev.olutoba.xplorejetcompose.utils

import java.text.NumberFormat

fun calculateTip(billAmount: Double, tipPercent: Double): String {
    val tip = tipPercent / 100 * billAmount
    return NumberFormat.getCurrencyInstance().format(tip)
}
