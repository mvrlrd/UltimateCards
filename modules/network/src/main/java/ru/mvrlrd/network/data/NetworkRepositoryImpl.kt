package ru.mvrlrd.network.data

import ru.mvrlrd.network.data.dto.ListResp
import ru.mvrlrd.network.data.dto.TranslationsMapper
import ru.mvrlrd.network.data.dto.request.SearchTranslationRequest
import ru.mvrlrd.network.domain.NetworkRepository
import ru.mvrlrd.network.domain.model.SearchResult
import javax.inject.Inject

class NetworkRepositoryImpl @Inject constructor(
    private val remoteDataSource: RemoteDataSource,
    private val mapper: TranslationsMapper
) : NetworkRepository {
    override suspend fun searchTranslation(word: String): List<SearchResult> {
        return mapper.mapResponseToListSearchResult(remoteDataSource.doRequest(SearchTranslationRequest(word)) as ListResp)
    }
}