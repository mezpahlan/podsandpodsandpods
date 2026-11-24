package uk.co.mezpahlan.pods.core

data class Podcast(
    val id: Int,
    val title: String,
    val publisher: String,
    val description: String,
    val websiteUrl: String?,
    val favourite: Boolean = false
)