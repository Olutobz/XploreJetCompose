package com.dev.olutoba.xplorejetcompose.daggerhiltpractice.data.di

import com.dev.olutoba.xplorejetcompose.daggerhiltpractice.api.SampleApiService
import com.dev.olutoba.xplorejetcompose.daggerhiltpractice.data.datasource.remote.SampleRemoteDataSource
import com.dev.olutoba.xplorejetcompose.daggerhiltpractice.data.repository.SampleRepositoryImpl
import com.dev.olutoba.xplorejetcompose.daggerhiltpractice.domain.repository.SampleRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import javax.inject.Singleton


/**
 * Created by Onikoyi Damola Olutoba
 * DATE: 21 August, 2025
 * EMAIL: damexxey94@gmail.com
 */


@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideSampleApiService(): SampleApiService {
        return Retrofit.Builder()
            .baseUrl("https://github.com/Olutobz")
            .build()
            .create(SampleApiService::class.java)
    }

    @Provides
    @Singleton
    fun provideSampleRemoteDataSource(
        sampleApiService: SampleApiService
    ): SampleRemoteDataSource {
        return SampleRemoteDataSource(sampleApiService)
    }

    @Provides
    @Singleton
    fun provideSampleRepository(
        sampleRemoteDataSource: SampleRemoteDataSource
    ): SampleRepository {
        return SampleRepositoryImpl(sampleRemoteDataSource)
    }

}