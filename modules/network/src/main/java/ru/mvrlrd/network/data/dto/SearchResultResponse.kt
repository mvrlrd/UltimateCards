package ru.mvrlrd.network.data.dto

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import ru.mvrlrd.network.data.dto.request.Response

@Serializable
class SearchResultResponse(
    @SerialName("text") val text : String,
    @SerialName("meanings") val meanings: List<MeaningsResponse>?
)

