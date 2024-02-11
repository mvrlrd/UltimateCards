package ru.mvrlrd.featurecategory.domain.api

import kotlinx.coroutines.flow.Flow
import ru.mvrlrd.core.Category

interface AddCategoryUseCase {
    suspend fun addCategory(category: Category): Flow<Long>
}