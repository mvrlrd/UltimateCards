package ru.mvrlrd.featurecategory.domain

import kotlinx.coroutines.flow.Flow
import ru.mvrlrd.core_api.dto.Category


interface CategoryRepository {
   suspend fun removeCategory(id: Long): Flow<Int>
   suspend fun fetchAllCategories(): Flow<List<Category>>
}