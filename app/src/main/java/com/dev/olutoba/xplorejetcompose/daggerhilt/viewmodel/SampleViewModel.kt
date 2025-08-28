package com.dev.olutoba.xplorejetcompose.daggerhilt.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.dev.olutoba.xplorejetcompose.daggerhilt.domain.repository.SampleRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject


/**
 * Created by Onikoyi Damola Olutoba
 * DATE: 21 August, 2025
 * EMAIL: damexxey94@gmail.com
 */


@HiltViewModel
class SampleViewModel @Inject constructor(
    private val repository: SampleRepository
) : ViewModel() {

    fun fetchNetworkCall() {
        viewModelScope.launch {
            val result = repository.fetchNetworkCall()
        }
    }
}