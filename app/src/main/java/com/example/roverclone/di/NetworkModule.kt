package com.example.roverclone.di

import com.example.roverclone.retrofit.Urls
import com.example.roverclone.retrofit.interfaces.RetrofitInterface
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
class NetworkModule {

  @Singleton
  @Provides
  fun provideRetrofit():  Retrofit{
    return Retrofit.Builder()
      .addConverterFactory(GsonConverterFactory.create())
      .baseUrl(Urls.BASE_URL)
      .build()
  }

  @Singleton
  @Provides
  fun providesEnterMobileApi(retrofit: Retrofit): RetrofitInterface{
    return retrofit.create(RetrofitInterface::class.java)
  }
}
