package ru.mvrlrd.featurecategory.domain.impl

import kotlinx.coroutines.flow.Flow
import ru.mvrlrd.featurecategory.domain.Category
import ru.mvrlrd.featurecategory.domain.CategoryRepository
import ru.mvrlrd.featurecategory.domain.api.FetchAllCategoriesUseCase
import javax.inject.Inject

class FetchAllCategoriesUseCaseImpl@Inject constructor(private val repository: CategoryRepository): FetchAllCategoriesUseCase {
    override suspend fun fetchAllCategories(): Flow<List<Category>> {
        return repository.fetchAllCategories()
    }
}