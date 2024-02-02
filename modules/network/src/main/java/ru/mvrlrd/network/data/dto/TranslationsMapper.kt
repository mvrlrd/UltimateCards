package ru.mvrlrd.network.data.dto

import ru.mvrlrd.network.data.dto.request.Response
import ru.mvrlrd.network.domain.model.Meaning
import ru.mvrlrd.network.domain.model.SearchResult
import ru.mvrlrd.network.domain.model.Translation
import javax.inject.Inject

class TranslationsMapper @Inject constructor() {
    fun mapTranslationResponseToTranslation(translationResponse: TranslationResponse): Translation =
        with(translationResponse) {
             Translation(
                translation = translation ?: ""
            )
        }

    fun mapMeaningsResponseToMeanings(meaningsResponse: MeaningsResponse): Meaning =
        with(meaningsResponse) {
            Meaning(
                translationResponse = translationResponse ?:TranslationResponse(""),
                imageUrl = imageUrl ?: "",
                transcription = transcription ?: "[]",
                partOfSpeech = partOfSpeech ?: "",
//                prefix = prefix ?: ""
            )
        }
    fun mapSearchResultResponseToSearchResult(searchResultResponse: SearchResultResponse): SearchResult =
        with(searchResultResponse){
            SearchResult(
                text=text,
                meanings=meanings
            )
        }
    fun mapResponseToListSearchResult(response: ListResp): List<SearchResult> =
        with(response){
            this.map {
                mapSearchResultResponseToSearchResult(it)
            }
        }
}