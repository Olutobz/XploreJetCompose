package com.dev.olutoba.xplorejetcompose.daggerhiltpractice.viewmodel

import androidx.lifecycle.ViewModel
import com.dev.olutoba.xplorejetcompose.daggerhiltpractice.domain.repository.SampleRepository
import dagger.hilt.android.lifecycle.HiltViewModel
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

}