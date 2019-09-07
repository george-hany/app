package com.example.android.myapplication3.Model

data class VolumeInfo(
    val allowAnonLogging: Boolean,
    val authors: List<String>?= listOf(""),
    val canonicalVolumeLink: String,
    val categories: List<String>,
    val contentVersion: String,
    val imageLinks: ImageLinks,
    val industryIdentifiers: List<IndustryIdentifier>,
    val infoLink: String,
    val language: String,
    val maturityRating: String,
    val previewLink: String,
    val printType: String,
    val publishedDate: String?="",
    val readingModes: ReadingModes,
    val title: String
)