package ru.mvrlrd.add_category.data

import ru.mvrlrd.core_api.database.entity.CategoryEntity

interface LocalDataSource {
    suspend fun addCategory(categoryEntity: CategoryEntity): Long
}