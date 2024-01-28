package ru.mvrlrd.featurecategory.domain.impl

import kotlinx.coroutines.flow.Flow
import ru.mvrlrd.featurecategory.domain.CategoryRepository
import ru.mvrlrd.featurecategory.domain.api.RemoveCategoryUseCase
import javax.inject.Inject

class RemoveCategoryUseCaseImpl@Inject constructor(private val repository: CategoryRepository): RemoveCategoryUseCase {
    override suspend fun removeCategory(id: Long): Flow<Int> {
        return repository.removeCategory(id)
    }
}