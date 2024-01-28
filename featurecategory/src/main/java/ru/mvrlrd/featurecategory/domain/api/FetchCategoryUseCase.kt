package ru.mvrlrd.featurecategory.domain.api

import kotlinx.coroutines.flow.Flow
import ru.mvrlrd.featurecategory.domain.Category

interface FetchCategoryUseCase {
    suspend fun fetchCategory(id: Long): Flow<Category>
}