package ru.mvrlrd.network.domain.api

import ru.mvrlrd.network.domain.model.SearchResult

interface SearchTranslationsUseCase {
    suspend fun searchTranslation(word: String): List<SearchResult>
}