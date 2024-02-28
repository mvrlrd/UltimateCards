package ru.mvrlrd.add_category.data

import ru.mvrlrd.core_api.database.CategoryDao
import ru.mvrlrd.core_api.database.entity.CategoryEntity
import javax.inject.Inject

class CategoriesDb@Inject constructor(private val dao: CategoryDao): LocalDataSource {
    override suspend fun addCategory(categoryEntity: CategoryEntity): Long {
        return dao.insertCategory(categoryEntity)
    }
}