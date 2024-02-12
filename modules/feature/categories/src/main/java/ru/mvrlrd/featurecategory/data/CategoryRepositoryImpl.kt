package ru.mvrlrd.featurecategory.data

import kotlinx.coroutines.flow.Flow
import ru.mvrlrd.core_api.dto.Category
import ru.mvrlrd.featurecategory.domain.CategoryRepository
import javax.inject.Inject

class CategoryRepositoryImpl @Inject constructor(private val localDataSource: LocalDataSource) :
    CategoryRepository {

    override suspend fun removeCategory(id: Long): Flow<Int> {
        return localDataSource.deleteCategory(id)
    }

    override suspend fun fetchAllCategories(): Flow<List<Category>> {
        return localDataSource.getAllCategories()
    }
}