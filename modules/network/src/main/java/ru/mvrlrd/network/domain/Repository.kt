package ru.mvrlrd.network.domain

import ru.mvrlrd.network.domain.model.SearchResult

interface Repository {
    suspend fun searchTranslation(word: String): List<SearchResult>
}