package ru.mvrlrd.network.data

import ru.mvrlrd.network.data.dto.request.Response
import ru.mvrlrd.network.data.dto.request.Request

interface NetworkClient {
   suspend fun doRequest(request: Request): Response
}