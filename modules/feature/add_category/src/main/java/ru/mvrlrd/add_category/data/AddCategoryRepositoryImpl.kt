package ru.mvrlrd.add_category.data

import ru.mvrlrd.add_category.domain.AddCategoryRepository
import ru.mvrlrd.core_api.database.entity.CategoryMapper
import ru.mvrlrd.core_api.dto.Category
import javax.inject.Inject

class AddCategoryRepositoryImpl@Inject constructor(private val localDataSource: LocalDataSource, private val mapper: CategoryMapper): AddCategoryRepository {
    override suspend fun addCategory(category: Category): Long {
        return localDataSource.addCategory(mapper.mapToEntity(category))
    }
}