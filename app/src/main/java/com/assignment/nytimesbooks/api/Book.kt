package com.assignment.nytimesbooks.api


import com.google.gson.annotations.SerializedName

data class Book(
    @SerializedName("age_group")
    val ageGroup: String? = null,
    @SerializedName("amazon_product_url")
    val amazonProductUrl: String? = null,
    @SerializedName("article_chapter_link")
    val articleChapterLink: String? = null,
    @SerializedName("asterisk")
    val asterisk: Int? = null,
    @SerializedName("author")
    val author: String? = null,
    @SerializedName("book_image")
    val bookImage: String? = null,
    @SerializedName("book_image_height")
    val bookImageHeight: Int? = null,
    @SerializedName("book_image_width")
    val bookImageWidth: Int? = null,
    @SerializedName("book_review_link")
    val bookReviewLink: String? = null,
    @SerializedName("book_uri")
    val bookUri: String? = null,
    @SerializedName("buy_links")
    val buyLinks: List<BuyLink?>? = null,
    @SerializedName("contributor")
    val contributor: String? = null,
    @SerializedName("contributor_note")
    val contributorNote: String? = null,
    @SerializedName("dagger")
    val dagger: Int? = null,
    @SerializedName("description")
    val description: String? = null,
    @SerializedName("first_chapter_link")
    val firstChapterLink: String? = null,
    @SerializedName("isbns")
    val isbns: List<Isbn?>? = null,
    @SerializedName("price")
    val price: Int? = null,
    @SerializedName("primary_isbn10")
    val primaryIsbn10: String? = null,
    @SerializedName("primary_isbn13")
    val primaryIsbn13: String? = null,
    @SerializedName("publisher")
    val publisher: String? = null,
    @SerializedName("rank")
    val rank: Int? = null,
    @SerializedName("rank_last_week")
    val rankLastWeek: Int? = null,
    @SerializedName("sunday_review_link")
    val sundayReviewLink: String? = null,
    @SerializedName("title")
    val title: String? = null,
    @SerializedName("weeks_on_list")
    val weeksOnList: Int? = null
)