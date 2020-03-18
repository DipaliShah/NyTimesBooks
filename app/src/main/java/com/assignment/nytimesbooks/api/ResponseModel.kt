package com.assignment.nytimesbooks.api


import com.google.gson.annotations.SerializedName

data class ResponseModel(
    @SerializedName("copyright")
    val copyright: String? = null,
    @SerializedName("last_modified")
    val lastModified: String? = null,
    @SerializedName("num_results")
    val numResults: Int? = null,
    @SerializedName("results")
    val results: Results? = null,
    @SerializedName("status")
    val status: String? = null
)