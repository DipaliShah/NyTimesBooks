package com.assignment.nytimesbooks.api


import com.google.gson.annotations.SerializedName

data class BuyLink(
    @SerializedName("name")
    val name: String? = null,
    @SerializedName("url")
    val url: String? = null
)