package com.assignment.nytimesbooks.api


import com.google.gson.annotations.SerializedName

data class Isbn(
    @SerializedName("isbn10")
    val isbn10: String? = null,
    @SerializedName("isbn13")
    val isbn13: String? = null
)