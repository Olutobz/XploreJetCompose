package com.dev.olutoba.xplorejetcompose.data.repository

import com.dev.olutoba.xplorejetcompose.data.datasource.remote.SampleRemoteDataSource
import com.dev.olutoba.xplorejetcompose.domain.repository.SampleRepository
import javax.inject.Inject


/**
 * Created by Onikoyi Damola Olutoba
 * DATE: 21 August, 2025
 * EMAIL: damexxey94@gmail.com
 */

class SampleRepositoryImpl @Inject constructor(
    private val sampleRemoteDataSource: SampleRemoteDataSource
) : SampleRepository {

    override suspend fun fetchNetworkCall() {
        val remoteDataSource = sampleRemoteDataSource.fetchNetworkCall()
    }
}