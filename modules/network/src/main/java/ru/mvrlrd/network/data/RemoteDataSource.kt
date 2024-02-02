package ru.mvrlrd.network.data

import ru.mvrlrd.network.data.dto.ListResp
import ru.mvrlrd.network.data.dto.request.Response
import ru.mvrlrd.network.data.dto.TranslationsMapper
import ru.mvrlrd.network.data.dto.request.Request
import ru.mvrlrd.network.data.dto.request.SearchTranslationRequest
import javax.inject.Inject

class RemoteDataSource@Inject constructor(
    private val apiService: SkyEngApiService,

) :
    NetworkClient {
    override suspend fun doRequest(request: Request): Response {
        val response =
        when(request){
            is SearchTranslationRequest->{
                apiService.search(request.query)
            }else->{
                null
            }
        }

        return when (response?.code()) {
            200 -> {
                if (!response.body().isNullOrEmpty()){
                    ListResp().apply { addAll(response.body()!!) }
                }else{
                    ListResp()
                }
            }

            else -> {
                throw IllegalArgumentException("ru.mvrlrd.network.data.RepositoryImpl: пришла ошибка с сервера")
            }
        }
    }
}