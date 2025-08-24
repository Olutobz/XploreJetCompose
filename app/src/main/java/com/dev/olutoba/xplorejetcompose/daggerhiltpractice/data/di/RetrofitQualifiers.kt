package com.dev.olutoba.xplorejetcompose.daggerhiltpractice.data.di

import javax.inject.Qualifier


/**
 * Created by Onikoyi Damola Olutoba
 * DATE: 24 August, 2025
 * EMAIL: damexxey94@gmail.com
 */


@Qualifier
@Retention(AnnotationRetention.BINARY)
annotation class BaseRetrofitQualifier

@Qualifier
@Retention(AnnotationRetention.BINARY)
annotation class XRetrofitQualifier