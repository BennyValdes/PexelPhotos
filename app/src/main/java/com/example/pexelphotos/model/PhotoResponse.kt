package com.example.pexelphotos.model

data class PhotoResponse (
    val hits: List<Hits>
    )

data class Hits(
    val pageURL: String,
    val previewURL: String,
    val webformatURL: String,
    val largeImageURL: String,
    val user: String
)
