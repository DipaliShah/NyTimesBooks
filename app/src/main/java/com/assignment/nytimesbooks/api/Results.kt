package com.assignment.nytimesbooks.api


import com.google.gson.annotations.SerializedName

data class Results(
    @SerializedName("bestsellers_date")
    val bestsellersDate: String? = null,
    @SerializedName("books")
    val books: List<Book>? = null,
    @SerializedName("display_name")
    val displayName: String? = null,
    @SerializedName("list_name")
    val listName: String? = null,
    @SerializedName("list_name_encoded")
    val listNameEncoded: String? = null,
    @SerializedName("next_published_date")
    val nextPublishedDate: String? = null,
    @SerializedName("normal_list_ends_at")
    val normalListEndsAt: Int? = null,
    @SerializedName("previous_published_date")
    val previousPublishedDate: String? = null,
    @SerializedName("published_date")
    val publishedDate: String? = null,
    @SerializedName("published_date_description")
    val publishedDateDescription: String? = null,
    @SerializedName("updated")
    val updated: String? = null
)