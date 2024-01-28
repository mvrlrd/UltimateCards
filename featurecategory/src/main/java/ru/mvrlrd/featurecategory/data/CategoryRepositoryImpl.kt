package ru.mvrlrd.featurecategory.data

import kotlinx.coroutines.flow.Flow
import ru.mvrlrd.featurecategory.domain.Category
import ru.mvrlrd.featurecategory.domain.CategoryRepository
import javax.inject.Inject

class CategoryRepositoryImpl @Inject constructor(private val localDataSource: LocalDataSource) :
    CategoryRepository {
    override suspend fun fetchCategory(id: Long): Flow<Category> {
        return localDataSource.getCategory(id)
    }

    override suspend fun removeCategory(id: Long): Flow<Int> {
        return localDataSource.deleteCategory(id)
    }

    override suspend fun addCategory(category: Category): Flow<Long> {
        return localDataSource.insertCategory(category)
    }

    override suspend fun fetchAllCategories(): Flow<List<Category>> {
        return localDataSource.getAllCategories()
    }
}