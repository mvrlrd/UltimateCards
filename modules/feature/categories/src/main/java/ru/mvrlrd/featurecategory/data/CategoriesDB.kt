package ru.mvrlrd.featurecategory.data

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map
import ru.mvrlrd.core_api.database.CategoryDao
import ru.mvrlrd.core_api.dto.Category
import ru.mvrlrd.core_api.database.entity.CategoryMapper
import javax.inject.Inject

class CategoriesDB @Inject constructor(private val categoryDao: CategoryDao, private val mapper: CategoryMapper) : LocalDataSource {

    override suspend fun deleteCategory(id: Long): Flow<Int> {
        TODO("Not yet implemented")
    }

    override suspend fun getAllCategories(): Flow<List<Category>> {
        return categoryDao.getAllCategories().map {
            mapper.mapToModelList(it)
        }
    }
}