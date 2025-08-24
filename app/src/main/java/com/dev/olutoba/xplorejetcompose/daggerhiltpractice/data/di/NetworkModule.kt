package com.dev.olutoba.xplorejetcompose.daggerhiltpractice.data.di

import com.dev.olutoba.xplorejetcompose.daggerhiltpractice.api.interceptors.AuthInterceptor
import com.dev.olutoba.xplorejetcompose.daggerhiltpractice.domain.models.Constants.BASE_URL
import com.dev.olutoba.xplorejetcompose.daggerhiltpractice.domain.models.Constants.CONNECT_TIMEOUT
import com.dev.olutoba.xplorejetcompose.daggerhiltpractice.domain.models.Constants.FAKE_AUTH_URL
import com.dev.olutoba.xplorejetcompose.daggerhiltpractice.domain.models.Constants.READ_TIMEOUT
import com.squareup.moshi.Moshi
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import dagger.Lazy
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import java.util.concurrent.TimeUnit
import javax.inject.Singleton


/**
 * Created by Onikoyi Damola Olutoba
 * DATE: 21 August, 2025
 * EMAIL: damexxey94@gmail.com
 */


@Module
@InstallIn(SingletonComponent::class)
object NetworkModule {

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
    @MainOkHttpClient
    fun provideMainOkHttpClient(loggingInterceptor: HttpLoggingInterceptor): OkHttpClient {
        return OkHttpClient.Builder()
            .addInterceptor(loggingInterceptor)
            .connectTimeout(timeout = CONNECT_TIMEOUT, unit = TimeUnit.SECONDS)
            .readTimeout(timeout = READ_TIMEOUT, unit = TimeUnit.SECONDS)
            .build()
    }

    @Provides
    @Singleton
    @AuthOkHttpClient
    fun provideAuthOkHttpClient(authInterceptor: AuthInterceptor): OkHttpClient {
        return OkHttpClient.Builder()
            .addInterceptor(authInterceptor)
            .connectTimeout(timeout = CONNECT_TIMEOUT, unit = TimeUnit.SECONDS)
            .readTimeout(timeout = READ_TIMEOUT, unit = TimeUnit.SECONDS)
            .build()
    }

    @Provides
    @Singleton
    @MainRetrofitInstance
    fun provideMainRetrofitInstance(
        @MainOkHttpClient okHttpClient: Lazy<OkHttpClient>,
        moshiConverterFactory: MoshiConverterFactory
    ): Retrofit {
        return Retrofit.Builder()
            .baseUrl(BASE_URL)
            .client(okHttpClient.get())
            .addConverterFactory(moshiConverterFactory)
            .build()
    }

    @Provides
    @Singleton
    @AuthRetrofitInstance
    fun provideAuthRetrofitInstance(
        @AuthOkHttpClient okHttpClient: Lazy<OkHttpClient>,
        moshiConverterFactory: MoshiConverterFactory
    ): Retrofit {
        return Retrofit.Builder()
            .baseUrl(FAKE_AUTH_URL)
            .client(okHttpClient.get())
            .addConverterFactory(moshiConverterFactory)
            .build()
    }

}
