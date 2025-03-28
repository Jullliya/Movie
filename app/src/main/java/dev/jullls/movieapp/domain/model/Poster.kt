package dev.jullls.movieapp.domain.model

import com.google.gson.annotations.SerializedName

data class Poster(
    @SerializedName("url") val url: String?,
    @SerializedName("previewUrl") val previewUrl: String?
)