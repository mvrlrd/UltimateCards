package ru.mvrlrd.featurecategory.domain.api

import kotlinx.coroutines.flow.Flow

interface RemoveCategoryUseCase {
    suspend fun removeCategory(id: Long): Flow<Int>
}