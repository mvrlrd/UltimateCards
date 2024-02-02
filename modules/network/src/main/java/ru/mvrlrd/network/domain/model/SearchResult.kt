package ru.mvrlrd.network.domain.model

import kotlinx.serialization.SerialName
import ru.mvrlrd.network.data.dto.MeaningsResponse

data class SearchResult(
    val text : String,
    val meanings: List<MeaningsResponse>?
)
