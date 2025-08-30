package com.dev.olutoba.xplorejetcompose

import com.dev.olutoba.xplorejetcompose.utils.calculateTip
import org.junit.Assert.assertEquals
import org.junit.Test
import java.text.NumberFormat


/**
 * Created by Onikoyi Damola Olutoba
 * DATE: 29 August, 2025
 * EMAIL: damexxey94@gmail.com
 */

class TipCalculatorTest {

    @Test
    fun calculateTip_20_percent_without_roundup() {
        val amount = 150.0
        val tipPercent = 20.0
        val roundUp = false
        val actualTip =
            calculateTip(billAmount = amount, tipPercent = tipPercent, isRoundUp = roundUp)

        val expectedTip = NumberFormat.getCurrencyInstance().format(30L)
        assertEquals(expectedTip, actualTip)
    }

    @Test
    fun calculateTip_20_percent_with_roundup() {
        val amount = 150.50
        val tipPercent = 20.0
        val roundUp = true
        val actualTip =
            calculateTip(billAmount = amount, tipPercent = tipPercent, isRoundUp = roundUp)

        val expectedTip = NumberFormat.getCurrencyInstance().format(31)
        assertEquals(expectedTip, actualTip)
    }

}