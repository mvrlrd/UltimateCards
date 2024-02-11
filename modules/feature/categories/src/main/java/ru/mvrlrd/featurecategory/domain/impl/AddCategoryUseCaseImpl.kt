package ru.mvrlrd.featurecategory.domain.impl

import kotlinx.coroutines.flow.Flow
import ru.mvrlrd.core.Category
import ru.mvrlrd.featurecategory.domain.CategoryRepository
import ru.mvrlrd.featurecategory.domain.api.AddCategoryUseCase
import javax.inject.Inject

class AddCategoryUseCaseImpl@Inject constructor(private val repository: CategoryRepository): AddCategoryUseCase {
    override suspend fun addCategory(category: Category): Flow<Long> {
        return repository.addCategory(category)
    }
}