package com.example.playlistmaker

import java.util.Locale

data class ItunesSearchResult(
    val trackId: String?,
    val trackName: String,
    val artistName: String,
    val trackTimeMillis: Long,
    val artworkUrl100: String,
    val collectionName: String,
    val releaseDate: String,
    val primaryGenreName: String,
    val country: String,
)