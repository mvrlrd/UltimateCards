package ru.mvrlrd.network.domain.model

import ru.mvrlrd.network.data.dto.TranslationResponse

data class Meaning(
    val translationResponse: TranslationResponse,
    val imageUrl: String,
    val transcription: String,
    val partOfSpeech: String,
//    val prefix: String
)
