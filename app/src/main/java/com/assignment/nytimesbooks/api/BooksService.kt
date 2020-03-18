package com.assignment.nytimesbooks.api

import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

/**
 * REST API access points
 */
interface BooksService {

    @GET("lists/current/hardcover-fiction.json")
    suspend fun getBooks(@Query("api-key") key: String): Response<ResponseModel>

}

