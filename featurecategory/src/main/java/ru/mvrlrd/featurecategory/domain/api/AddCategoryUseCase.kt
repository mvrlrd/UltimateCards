package ru.mvrlrd.featurecategory.domain.api

import kotlinx.coroutines.flow.Flow
import ru.mvrlrd.featurecategory.domain.Category

interface AddCategoryUseCase {
    suspend fun addCategory(category: Category): Flow<Long>
}