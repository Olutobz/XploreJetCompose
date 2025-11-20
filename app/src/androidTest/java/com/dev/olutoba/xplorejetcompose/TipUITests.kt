package com.dev.olutoba.xplorejetcompose

import androidx.compose.material3.Surface
import androidx.compose.ui.test.junit4.createComposeRule
import androidx.compose.ui.test.onNodeWithTag
import androidx.compose.ui.test.onNodeWithText
import androidx.compose.ui.test.performClick
import androidx.compose.ui.test.performTextInput
import com.dev.olutoba.xplorejetcompose.ui.theme.XploreJetComposeTheme
import com.dev.olutoba.xplorejetcompose.ui.view.screens.TipTimeLayout
import org.junit.Rule
import org.junit.Test
import java.text.NumberFormat


/**
 * Created by Onikoyi Damola Olutoba
 * DATE: 04 September, 2025
 * EMAIL: damexxey94@gmail.com
 */

class TipUITests {

    @get:Rule
    val composeTestRule = createComposeRule()

    @Test
    fun calculateTip_20_percent_without_roundup_isSuccess() {
        composeTestRule.setContent {
            XploreJetComposeTheme {
                Surface {
                    TipTimeLayout()
                }
            }
        }

        val expectedTip = NumberFormat.getCurrencyInstance().format(30.1)

        composeTestRule.onNodeWithText(text = "Bill Amount").performTextInput("150.50")
        composeTestRule.onNodeWithText(text = "Tip Percentage").performTextInput("20.0")
        composeTestRule.onNodeWithText(text = "Tip Amount: $expectedTip")
            .assertExists("No node with this text was found")
    }

    @Test
    fun calculateTip_20_percent_without_roundup_isFailed() {
        composeTestRule.setContent {
            XploreJetComposeTheme {
                Surface {
                    TipTimeLayout()
                }
            }
        }

        val expectedTip = NumberFormat.getCurrencyInstance().format(31)

        composeTestRule.onNodeWithText(text = "Bill Amount").performTextInput("150.50")
        composeTestRule.onNodeWithText(text = "Tip Percentage").performTextInput("20.0")
        composeTestRule.onNodeWithText(text = "Tip Amount: $expectedTip").assertDoesNotExist()
    }


    @Test
    fun calculateTip_20_percent_with_roundup_isSuccess() {
        composeTestRule.setContent {
            XploreJetComposeTheme {
                Surface {
                    TipTimeLayout()
                }
            }
        }

        val expectedTip = NumberFormat.getCurrencyInstance().format(31)

        composeTestRule.onNodeWithText("Bill Amount").performTextInput("150.50")
        composeTestRule.onNodeWithText("Tip Percentage").performTextInput("20")
        composeTestRule.onNodeWithTag("ROUND_UP_SWITCH").performClick()
        composeTestRule.onNodeWithText("Tip Amount: $expectedTip")
            .assertExists("No node with this text was found")
    }

    @Test
    fun calculateTip_20_percent_with_roundup_isFailed() {
        composeTestRule.setContent {
            XploreJetComposeTheme {
                Surface {
                    TipTimeLayout()
                }
            }
        }

        val expectedTip = NumberFormat.getCurrencyInstance().format(30.1)
        composeTestRule.onNodeWithText("Bill Amount").performTextInput("150.50")
        composeTestRule.onNodeWithText("Tip Percentage").performTextInput("20")
        composeTestRule.onNodeWithTag("ROUND_UP_SWITCH").performClick()
        composeTestRule.onNodeWithText("Tip Amount: $expectedTip").assertDoesNotExist()
    }

}