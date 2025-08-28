package com.dev.olutoba.xplorejetcompose.daggerhilt.data.di

import com.dev.olutoba.xplorejetcompose.daggerhilt.api.AuthApiService
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
object AuthApiServiceModule {

    @Provides
    @Singleton
    fun provideAuthApiService(
        @AuthRetrofitInstance retrofit: Retrofit
    ): AuthApiService = retrofit.create(AuthApiService::class.java)

}
