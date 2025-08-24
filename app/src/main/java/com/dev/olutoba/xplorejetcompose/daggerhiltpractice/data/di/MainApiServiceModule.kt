package com.dev.olutoba.xplorejetcompose.daggerhiltpractice.data.di

import com.dev.olutoba.xplorejetcompose.daggerhiltpractice.api.SampleApiService
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import javax.inject.Singleton


/**
 * Created by Onikoyi Damola Olutoba
 * DATE: 24 August, 2025
 * EMAIL: damexxey94@gmail.com
 */


@Module
@InstallIn(SingletonComponent::class)
object MainApiServiceModule {

    @Provides
    @Singleton
    fun provideSampleApiService(
        @MainRetrofitInstance retrofit: Retrofit
    ): SampleApiService = retrofit.create(SampleApiService::class.java)

}
