package com.dev.olutoba.xplorejetcompose.daggerhiltpractice.api

import retrofit2.http.GET


/**
 * Created by Onikoyi Damola Olutoba
 * DATE: 21 August, 2025
 * EMAIL: damexxey94@gmail.com
 */

interface AuthApiService {

    @GET("auth/credentials")
    fun fetchAuthCredentials()

}