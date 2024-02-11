package ru.mvrlrd.featurecategory.domain.api

import kotlinx.coroutines.flow.Flow
import ru.mvrlrd.core.Category

interface FetchAllCategoriesUseCase {
    suspend fun fetchAllCategories(): Flow<List<Category>>
}