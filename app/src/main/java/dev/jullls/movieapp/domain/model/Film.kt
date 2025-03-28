package dev.jullls.movieapp.domain.model

import com.google.gson.annotations.SerializedName

data class Film(
    @SerializedName("id") val id: Long,
    @SerializedName("poster") val poster: Poster?,
    @SerializedName("name") val name: String?,
    @SerializedName("year") val year: String?
) {
    fun getPosterUrl(): String? {
        return poster?.url
    }
}