package com.dev.olutoba.xplorejetcompose.data.datasource.remote

import com.dev.olutoba.xplorejetcompose.data.api.SampleApiService
import javax.inject.Inject


/**
 * Created by Onikoyi Damola Olutoba
 * DATE: 21 August, 2025
 * EMAIL: damexxey94@gmail.com
 */

class SampleRemoteDataSource @Inject constructor(
    private val sampleApiService: SampleApiService,
) {

    fun fetchNetworkCall() {
        try {
            val response = sampleApiService.fetchNetworkCall()
        } catch (_: Exception) {

        }
    }

}