package ru.mvrlrd.network.domain

import ru.mvrlrd.network.domain.model.SearchResult

interface NetworkRepository {
    suspend fun searchTranslation(word: String): List<SearchResult>
}