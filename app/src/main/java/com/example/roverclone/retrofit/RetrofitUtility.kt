package com.example.roverclone.retrofit

import android.annotation.SuppressLint
import com.example.roverclone.retrofit.interfaces.RetrofitInterface
import com.google.gson.GsonBuilder
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit

class RetrofitUtility {
  private var retrofit: Retrofit? = null
  fun callRetrofit(): RetrofitInterface? {
    val gson = GsonBuilder()
      .setLenient()
      .create()
    val logging = HttpLoggingInterceptor()
    // set your desired log level
    logging.level = HttpLoggingInterceptor.Level.BODY
    val httpClient = OkHttpClient.Builder()
      .readTimeout(60, TimeUnit.SECONDS)
      .connectTimeout(60, TimeUnit.SECONDS)
      .addInterceptor(logging).build()
    // add your other interceptors …
// add logging as last interceptor
// httpClient.addInterceptor(logging);
    val retrofit: Retrofit =
      Retrofit.Builder()
        .baseUrl("http://restapi.adequateshop.com/")
        .client(httpClient)
        .addConverterFactory(GsonConverterFactory.create(gson))
        .build()
      Retrofit.Builder()
      .baseUrl(Urls.BASE_URL)
      .addConverterFactory(GsonConverterFactory.create(gson))
      .client(httpClient)
      .build()
    return retrofit.create(RetrofitInterface::class.java)
  }

  fun callRetrofit2(): RetrofitInterface? {
    val gson = GsonBuilder()
      .setLenient()
      .create()
    val logging = HttpLoggingInterceptor()
    // set your desired log level
    logging.level = HttpLoggingInterceptor.Level.BODY
    val httpClient = OkHttpClient.Builder()
      .readTimeout(60, TimeUnit.SECONDS)
      .connectTimeout(60, TimeUnit.SECONDS)
      .addInterceptor(logging).build()
    // add your other interceptors …
// add logging as last interceptor
// httpClient.addInterceptor(logging);
    val retrofit = Retrofit.Builder()
      .baseUrl("https://maps.googleapis.com/maps/api/")
      .addConverterFactory(GsonConverterFactory.create(gson))
      .client(httpClient)
      .build()
    return retrofit.create(RetrofitInterface::class.java)
  }

  fun callRetrofit3(): RetrofitInterface? {
    val gson = GsonBuilder()
      .setLenient()
      .create()
    val logging = HttpLoggingInterceptor()
    // set your desired log level
    logging.level = HttpLoggingInterceptor.Level.BODY
    val httpClient = OkHttpClient.Builder()
      .readTimeout(60, TimeUnit.SECONDS)
      .connectTimeout(60, TimeUnit.SECONDS)
//      .addInterceptor(BasicAuthInterceptor("plinning@gamma.com", "123"))
      .addInterceptor(logging).build()
    // add your other interceptors …
// add logging as last interceptor
// httpClient.addInterceptor(logging);
    val retrofit = Retrofit.Builder()
      .baseUrl("https://test.plinning.com/plinning-rest/rest/plinning/gamma_project/")
      .addConverterFactory(GsonConverterFactory.create(gson))
      .client(httpClient)
      .build()
    return retrofit.create(RetrofitInterface::class.java)
  }

  fun getClient(): Retrofit? {
    val gson = GsonBuilder()
      .setLenient()
      .create()
    val logging = HttpLoggingInterceptor()
    // set your desired log level
    logging.level = HttpLoggingInterceptor.Level.BODY
    val httpClient = OkHttpClient.Builder()
      .readTimeout(60, TimeUnit.SECONDS)
      .connectTimeout(60, TimeUnit.SECONDS)
      .addInterceptor(logging).build()
    if (retrofit == null) {
      retrofit = Retrofit.Builder()
        .baseUrl(Urls.BASE_URL)
        .addConverterFactory(GsonConverterFactory.create())
        .client(httpClient)
        .build()
    }
    return retrofit
  }
}