package ru.mvrlrd.featurecategory.data

import kotlinx.coroutines.flow.Flow
import ru.mvrlrd.core.Category

interface LocalDataSource {
   suspend fun insertCategory(category: Category): Flow<Long>
   suspend fun deleteCategory(id: Long): Flow<Int>
   suspend fun getCategory(id: Long):Flow<Category>
   suspend fun getAllCategories():Flow<List<Category>>
}