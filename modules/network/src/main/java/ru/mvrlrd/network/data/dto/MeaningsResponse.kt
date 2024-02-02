package ru.mvrlrd.network.data.dto


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
class MeaningsResponse(
    @SerialName("translation") val translationResponse: TranslationResponse?,
    @SerialName("imageUrl") val imageUrl: String?,
    @SerialName("transcription") val transcription: String?,
    @SerialName("partOfSpeechCode") val partOfSpeech: String?,
//    @SerialName("prefix") val prefix: String?

)