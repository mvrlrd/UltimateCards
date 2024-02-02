package ru.mvrlrd.featurecategory.domain.impl

import kotlinx.coroutines.flow.Flow
import ru.mvrlrd.featurecategory.domain.Category
import ru.mvrlrd.featurecategory.domain.CategoryRepository
import ru.mvrlrd.featurecategory.domain.api.FetchCategoryUseCase
import javax.inject.Inject

class FetchCategoryUseCaseImpl@Inject constructor(private val repository: CategoryRepository): FetchCategoryUseCase {
    override suspend fun fetchCategory(id: Long): Flow<Category> {
        return repository.fetchCategory(id)
    }
}