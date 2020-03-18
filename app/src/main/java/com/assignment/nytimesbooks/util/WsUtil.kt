package com.assignment.nytimesbooks.util

import com.assignment.nytimesbooks.BuildConfig
import com.assignment.nytimesbooks.api.BooksService
import com.google.gson.GsonBuilder
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit

object WsUtil {
    private var booksService: BooksService? = null

 /*   val webService by lazy {
        Retrofit.Builder()
            .baseUrl(BuildConfig.SERVER_URL)
            *//*.callFactory()*//*
            .build()
            .create(BooksService::class.java)
    }*/

    /**
     * Static method to to get api client instance
     *
     * @return ApiCallback instance
     */
    fun getClient(): BooksService {
        try {
            if (booksService == null) {
                val httpClient = OkHttpClient.Builder()
                httpClient.connectTimeout(
                    9000L,
                    TimeUnit.SECONDS
                )
                httpClient.readTimeout(
                    6000L,
                    TimeUnit.SECONDS
                )
                if (BuildConfig.DEBUG) {
                    val httpLoggingInterceptor = HttpLoggingInterceptor()
                    httpLoggingInterceptor.setLevel(HttpLoggingInterceptor.Level.BODY)
                    httpClient.addInterceptor(httpLoggingInterceptor)
                }
                booksService = Retrofit.Builder()
                    .baseUrl(BuildConfig.SERVER_URL)
                    .client(httpClient.build())
                    .addConverterFactory(GsonConverterFactory.create(GsonBuilder().create()))
                    .build().create(BooksService::class.java)
            }
        } catch (e: Exception) {
            e.printStackTrace()
        }
        return booksService as BooksService
    }
}