package ru.mvrlrd.network.domain.impl

import ru.mvrlrd.network.domain.NetworkRepository
import ru.mvrlrd.network.domain.api.SearchTranslationsUseCase
import ru.mvrlrd.network.domain.model.SearchResult
import javax.inject.Inject

class SearchTranslationsUseCaseImpl @Inject constructor(private val networkRepository: NetworkRepository): SearchTranslationsUseCase {
    override suspend fun searchTranslation(word: String): List<SearchResult> {
        return networkRepository.searchTranslation(word)
    }
}