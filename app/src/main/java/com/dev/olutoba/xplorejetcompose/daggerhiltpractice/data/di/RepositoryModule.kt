package com.dev.olutoba.xplorejetcompose.daggerhiltpractice.data.di

import com.dev.olutoba.xplorejetcompose.daggerhiltpractice.data.repository.SampleRepositoryImpl
import com.dev.olutoba.xplorejetcompose.daggerhiltpractice.domain.repository.SampleRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton


/**
 * Created by Onikoyi Damola Olutoba
 * DATE: 22 August, 2025
 * EMAIL: damexxey94@gmail.com
 */


@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {

    @Binds
    @Singleton
    abstract fun bindSampleRepository(
        sampleRepositoryImpl: SampleRepositoryImpl
    ): SampleRepository
}
