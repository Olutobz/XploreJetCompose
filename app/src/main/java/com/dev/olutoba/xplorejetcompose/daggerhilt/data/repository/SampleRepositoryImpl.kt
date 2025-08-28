package com.dev.olutoba.xplorejetcompose.daggerhilt.data.repository

import com.dev.olutoba.xplorejetcompose.daggerhilt.data.datasource.remote.SampleRemoteDataSource
import com.dev.olutoba.xplorejetcompose.daggerhilt.domain.repository.SampleRepository
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