package ru.mvrlrd.featurecategory.domain

import kotlinx.coroutines.flow.Flow

interface CategoryRepository {
   suspend fun fetchCategory(id: Long): Flow<Category>
   suspend fun removeCategory(id: Long): Flow<Int>
   suspend fun addCategory(category: Category): Flow<Long>
   suspend fun fetchAllCategories(): Flow<List<Category>>
}