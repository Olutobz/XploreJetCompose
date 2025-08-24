package com.dev.olutoba.xplorejetcompose.daggerhiltpractice.api.interceptors

import okhttp3.Interceptor
import okhttp3.Response


/**
 * Created by Onikoyi Damola Olutoba
 * DATE: 24 August, 2025
 * EMAIL: damexxey94@gmail.com
 */

class AuthInterceptor : Interceptor {

    // TODO
    override fun intercept(chain: Interceptor.Chain): Response {
        val testRequest = chain.request()
        return chain.proceed(testRequest)
    }
}