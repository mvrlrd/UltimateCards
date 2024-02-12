package ru.mvrlrd.featurecategory.data

import kotlinx.coroutines.flow.Flow
import ru.mvrlrd.core_api.dto.Category

interface LocalDataSource {
   suspend fun deleteCategory(id: Long): Flow<Int>
   suspend fun getAllCategories():Flow<List<Category>>
}