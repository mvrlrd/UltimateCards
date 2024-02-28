package ru.mvrlrd.add_category.domain

import ru.mvrlrd.add_category.domain.api.AddCategoryUseCase
import ru.mvrlrd.core_api.database.entity.CategoryEntity
import ru.mvrlrd.core_api.dto.Category
import javax.inject.Inject

class AddCategoryUseCaseImpl@Inject constructor(private val repository: AddCategoryRepository) : AddCategoryUseCase {
    override suspend fun addCategory(category: Category): Long {
        return repository.addCategory(category)
    }
}