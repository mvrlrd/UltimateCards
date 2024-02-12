package ru.mvrlrd.featurecategory.domain.api

import kotlinx.coroutines.flow.Flow
import ru.mvrlrd.core_api.dto.Category


interface FetchAllCategoriesUseCase {
    suspend fun fetchAllCategories(): Flow<List<Category>>
}