package ru.mvrlrd.network.data.dto

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import ru.mvrlrd.network.data.dto.request.Response

@Serializable

class TranslationResponse(
    @SerialName("text") val translation: String?
)