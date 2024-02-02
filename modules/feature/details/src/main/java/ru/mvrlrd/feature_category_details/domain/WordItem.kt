package ru.mvrlrd.feature_category_details.domain

data class WordItem(
    val id: Long,
    val text: String,
    val translations: List<String>
)
