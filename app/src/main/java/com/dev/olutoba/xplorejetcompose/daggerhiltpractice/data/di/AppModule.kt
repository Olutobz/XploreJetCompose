package com.dev.olutoba.xplorejetcompose.daggerhiltpractice.data.di

import com.dev.olutoba.xplorejetcompose.daggerhiltpractice.api.SampleApiService
import com.dev.olutoba.xplorejetcompose.daggerhiltpractice.data.datasource.remote.SampleRemoteDataSource
import com.dev.olutoba.xplorejetcompose.daggerhiltpractice.domain.models.Constants.BASE_URL
import com.dev.olutoba.xplorejetcompose.daggerhiltpractice.domain.models.Constants.CONNECT_TIMEOUT
import com.dev.olutoba.xplorejetcompose.daggerhiltpractice.domain.models.Constants.READ_TIMEOUT
import com.dev.olutoba.xplorejetcompose.daggerhiltpractice.domain.models.Constants.X_URL
import com.squareup.moshi.Moshi
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import java.util.concurrent.TimeUnit
import javax.inject.Named
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
    @Named("baseUrl")
    fun provideBaseUrl(): String = BASE_URL

    @Provides
    @Named("XbaseUrl")
    fun provideXBaseUrl(): String = X_URL

    @Provides
    fun provideLoggingInterceptor(): HttpLoggingInterceptor {
        return HttpLoggingInterceptor().apply {
            level = HttpLoggingInterceptor.Level.BODY
        }
    }

    @Provides
    @Singleton
    fun provideMoshi(): Moshi {
        return Moshi.Builder()
            .add(KotlinJsonAdapterFactory())
            .build()
    }

    @Provides
    @Singleton
    fun provideConverterFactory(moshi: Moshi): MoshiConverterFactory {
        return MoshiConverterFactory.create(moshi)
    }

    @Provides
    @Singleton
    fun provideHttpClient(loggingInterceptor: HttpLoggingInterceptor): OkHttpClient {
        return OkHttpClient.Builder()
            .connectTimeout(timeout = CONNECT_TIMEOUT, unit = TimeUnit.SECONDS)
            .readTimeout(timeout = READ_TIMEOUT, unit = TimeUnit.SECONDS)
            .addInterceptor(loggingInterceptor)
            .build()
    }

    @Provides
    @Singleton
    @BaseRetrofit
    fun provideBaseRetrofit(
        @Named("baseUrl") baseUrl: String,
        okHttpClient: OkHttpClient,
        moshiConverterFactory: MoshiConverterFactory
    ): Retrofit {
        return Retrofit.Builder()
            .baseUrl(baseUrl)
            .client(okHttpClient)
            .addConverterFactory(moshiConverterFactory)
            .build()
    }

    @Provides
    @Singleton
    fun provideXRetrofit(
        @Named("XbaseUrl") baseUrl: String,
        okHttpClient: OkHttpClient,
        moshiConverterFactory: MoshiConverterFactory
    ): Retrofit {
        return Retrofit.Builder()
            .baseUrl(baseUrl)
            .client(okHttpClient)
            .addConverterFactory(moshiConverterFactory)
            .build()
    }

    @Provides
    @Singleton
    fun provideSampleApiService(retrofit: Retrofit): SampleApiService {
        return retrofit.create(SampleApiService::class.java)
    }

    @Provides
    @Singleton
    fun provideSampleRemoteDataSource(
        sampleApiService: SampleApiService
    ): SampleRemoteDataSource {
        return SampleRemoteDataSource(sampleApiService)
    }

}