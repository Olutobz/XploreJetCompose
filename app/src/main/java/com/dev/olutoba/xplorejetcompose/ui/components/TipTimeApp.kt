package com.dev.olutoba.xplorejetcompose.ui.components

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.safeDrawingPadding
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Switch
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.dev.olutoba.xplorejetcompose.R
import com.dev.olutoba.xplorejetcompose.ui.theme.XploreJetComposeTheme
import com.dev.olutoba.xplorejetcompose.utils.calculateTip


/**
 * Created by Onikoyi Damola Olutoba
 * DATE: 14 August, 2025
 * EMAIL: damexxey94@gmail.com
 */


@Composable
fun TipTimeLayout() {
    var amountInput by rememberSaveable { mutableStateOf("") }
    var tipPercentInput by rememberSaveable { mutableStateOf("") }
    var isRoundedUp by rememberSaveable { mutableStateOf(false) }

    val isError = amountInput.isNotEmpty() && amountInput.toDoubleOrNull() == null
    val billAmount = amountInput.toDoubleOrNull() ?: 0.0
    val tipPercent = tipPercentInput.toDoubleOrNull() ?: 0.0

    val actualTip = calculateTip(
        billAmount = billAmount,
        tipPercent = tipPercent,
        isRoundUp = isRoundedUp
    )

    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(state = rememberScrollState())
            .statusBarsPadding()
            .safeDrawingPadding()
            .padding(horizontal = 40.dp)
    ) {
        Text(
            text = stringResource(R.string.calculate_tip_title),
            modifier = Modifier.align(Alignment.Start)
        )

        Spacer(modifier = Modifier.height(8.dp))

        EditNumberField(
            value = amountInput,
            onValueChange = { amountInput = it },
            label = R.string.bill_amount_text,
            isError = isError,
            supportingText = R.string.please_enter_a_valid_amount_text,
            imeAction = ImeAction.Next,
            modifier = Modifier.fillMaxWidth()
        )

        Spacer(modifier = Modifier.height(8.dp))

        EditNumberField(
            value = tipPercentInput,
            onValueChange = { tipPercentInput = it },
            label = R.string.tip_percentage_text,
            isError = isError,
            supportingText = R.string.please_enter_a_valid_amount_text,
            leadingIcon = R.drawable.ic_percentage,
            leadingIconContentDesc = R.string.percentage_icon_content_desc,
            imeAction = ImeAction.Done,
            modifier = Modifier.fillMaxWidth()
        )

        Spacer(modifier = Modifier.height(8.dp))

        SwitchWithTextField(
            text = R.string.round_up_tip_text,
            roundUp = isRoundedUp,
            onRoundUpChange = { isRoundedUp = it }
        )

        Spacer(modifier = Modifier.height(8.dp))

        Text(
            text = stringResource(R.string.tip_amount_text, actualTip),
            style = MaterialTheme.typography.displaySmall,
            fontSize = 28.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.fillMaxWidth()
        )
    }
}

@Composable
fun SwitchWithTextField(
    @StringRes text: Int,
    roundUp: Boolean,
    onRoundUpChange: (Boolean) -> Unit,
    modifier: Modifier = Modifier
) {
    Row(
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically,
        modifier = modifier.fillMaxSize()
    ) {
        Text(text = stringResource(text), textAlign = TextAlign.Start)

        Spacer(modifier = modifier.width(8.dp))

        Switch(
            checked = roundUp,
            onCheckedChange = onRoundUpChange
        )
    }
}


@Composable
private fun EditNumberField(
    value: String,
    onValueChange: (String) -> Unit,
    modifier: Modifier = Modifier,
    keyboardType: KeyboardType = KeyboardType.Number,
    imeAction: ImeAction = ImeAction.Default,
    isError: Boolean,
    @StringRes label: Int,
    @StringRes supportingText: Int,
    @DrawableRes leadingIcon: Int = R.drawable.ic_dollar_currency,
    @StringRes leadingIconContentDesc: Int = R.string.dollar_icon_content_desc
) {
    OutlinedTextField(
        value = value,
        onValueChange = onValueChange,
        label = { Text(text = stringResource(label)) },
        isError = isError,
        supportingText = {
            if (isError) {
                Text(
                    text = stringResource(supportingText),
                    color = MaterialTheme.colorScheme.error
                )
            }
        },
        leadingIcon = {
            Icon(
                painter = painterResource(leadingIcon),
                contentDescription = stringResource(leadingIconContentDesc)
            )
        },
        singleLine = true,
        keyboardOptions = KeyboardOptions.Default.copy(
            keyboardType = keyboardType,
            imeAction = imeAction
        ),
        modifier = modifier
    )
}


@Preview(showBackground = true, showSystemUi = true)
@Composable
fun PreviewTipTimeLayout() {
    XploreJetComposeTheme {
        TipTimeLayout()
    }
}
