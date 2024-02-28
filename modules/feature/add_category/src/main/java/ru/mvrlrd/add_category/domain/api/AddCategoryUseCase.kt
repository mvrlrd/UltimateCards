package ru.mvrlrd.add_category.domain.api

import ru.mvrlrd.core_api.dto.Category

interface AddCategoryUseCase {
    suspend fun addCategory(category: Category):Long
}