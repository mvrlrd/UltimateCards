package ru.mvrlrd.network.data

import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query
import ru.mvrlrd.network.data.dto.SearchResultResponse

interface SkyEngApiService {

    @GET("words/search")
    suspend fun search(@Query("search") wordToSearch: String): Response<List<SearchResultResponse>>
}