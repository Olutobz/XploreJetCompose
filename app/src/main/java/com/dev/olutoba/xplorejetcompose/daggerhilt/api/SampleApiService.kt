package com.dev.olutoba.xplorejetcompose.daggerhilt.api

import retrofit2.http.GET


/**
 * Created by Onikoyi Damola Olutoba
 * DATE: 21 August, 2025
 * EMAIL: damexxey94@gmail.com
 */

interface SampleApiService {

    @GET("test")
    fun fetchNetworkCall()

}