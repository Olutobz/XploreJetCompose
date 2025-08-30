package com.dev.olutoba.xplorejetcompose.utils

import org.junit.Assert.assertEquals
import org.junit.Assert.assertNotEquals
import org.junit.Test
import java.text.NumberFormat

/**
 * Created by Onikoyi Damola Olutoba
 * DATE: 30 August, 2025
 * EMAIL: damexxey94@gmail.com
 */

class UtilsTest {

    @Test
    fun calculateTip_20_percent_without_roundup_isSuccess() {
        val amount = 150.50
        val tipPercent = 20.0
        val roundUp = false
        val actualTip = calculateTip(
            billAmount = amount,
            tipPercent = tipPercent,
            isRoundUp = roundUp
        )

        val expectedTip = NumberFormat.getCurrencyInstance().format(30.1)

        assertEquals(expectedTip, actualTip)
    }

    @Test
    fun calculateTip_20_percent_without_roundup_isFailed() {
        val amount = 150.40
        val tipPercent = 20.0
        val roundUp = false
        val actualTip = calculateTip(
            billAmount = amount,
            tipPercent = tipPercent,
            isRoundUp = roundUp
        )

        val expectedTip = NumberFormat.getCurrencyInstance().format(31)

        assertNotEquals(expectedTip, actualTip)
    }

    @Test
    fun calculateTip_20_percent_with_roundup_isSuccess() {
        val amount = 150.50
        val tipPercent = 20.0
        val roundUp = true
        val actualTip = calculateTip(
            billAmount = amount,
            tipPercent = tipPercent,
            isRoundUp = roundUp
        )

        val expectedTip = NumberFormat.getCurrencyInstance().format(31)

        assertEquals(expectedTip, actualTip)
    }

    @Test
    fun calculateTip_20_percent_with_roundup_isFailed() {
        val amount = 150.50
        val tipPercent = 20.0
        val roundUp = true
        val actualTip = calculateTip(
            billAmount = amount,
            tipPercent = tipPercent,
            isRoundUp = roundUp
        )

        val expectedTip = NumberFormat.getCurrencyInstance().format(30.1)

        assertNotEquals(expectedTip, actualTip)
    }

}