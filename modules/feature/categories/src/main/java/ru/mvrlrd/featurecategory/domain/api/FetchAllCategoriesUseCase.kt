package ru.mvrlrd.featurecategory.domain.api

import kotlinx.coroutines.flow.Flow
import ru.mvrlrd.featurecategory.domain.Category

interface FetchAllCategoriesUseCase {
    suspend fun fetchAllCategories(): Flow<List<Category>>
}