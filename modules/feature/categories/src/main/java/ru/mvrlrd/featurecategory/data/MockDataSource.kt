package ru.mvrlrd.featurecategory.data

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import ru.mvrlrd.featurecategory.domain.Category
import javax.inject.Inject

class MockDataSource @Inject constructor() : LocalDataSource{
    private val categories: MutableList<Category> = mutableListOf(
        Category(1L,"Слэнг"),
        Category(2L,"Movies"),
        Category(3L,"Nature"),
        Category(4L,"Travalling"),
        Category(5L,"Programming"),
        Category(6L,"Work")
    )


    override suspend fun insertCategory(category: Category): Flow<Long> {
        synchronized(categories){
            return flow {
                categories.add(category)
                emit(category.id)
            }
        }
    }

    override suspend fun deleteCategory(id: Long): Flow<Int> {
        synchronized(categories){
            return flow {
                val catToDelete = categories.first { it.id == id }
                categories.remove(catToDelete)
                emit(1)
            }
        }
    }

    override suspend fun getCategory(id: Long): Flow<Category> {
        synchronized(categories){
            return flow {
                emit(categories.first{it.id == id})
            }
        }
    }

    override suspend fun getAllCategories(): Flow<List<Category>> {
        synchronized(categories){
            return flow {
                emit(categories)
            }
        }
    }
}