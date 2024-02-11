package ru.mvrlrd.featurecategory.data

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.map
import ru.mvrlrd.core.Category
import ru.mvrlrd.db.CategoryDao
import ru.mvrlrd.featurecategory.data.model.CategoryMapper
import javax.inject.Inject

class CategoriesDB @Inject constructor(private val categoryDao: CategoryDao, private val mapper: CategoryMapper) : LocalDataSource {
    override suspend fun insertCategory(category: Category): Flow<Long> {
        return flow {
            emit(categoryDao.insertCategory(mapper.mapToEntity(category)))
        }
    }

    override suspend fun deleteCategory(id: Long): Flow<Int> {
        TODO("Not yet implemented")
    }

    override suspend fun getCategory(id: Long): Flow<Category> {
        TODO("Not yet implemented")
    }

    override suspend fun getAllCategories(): Flow<List<Category>> {
        return categoryDao.getAllCategories().map {
            mapper.mapToModelList(it)
        }
    }
}