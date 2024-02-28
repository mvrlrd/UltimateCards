package ru.mvrlrd.add_category.domain

import ru.mvrlrd.core_api.dto.Category

interface AddCategoryRepository {
    suspend fun addCategory(category: Category): Long
}