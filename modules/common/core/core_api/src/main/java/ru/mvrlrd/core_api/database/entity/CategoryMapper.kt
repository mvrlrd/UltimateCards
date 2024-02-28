package ru.mvrlrd.core_api.database.entity


import ru.mvrlrd.core_api.dto.Category
import javax.inject.Inject

class CategoryMapper@Inject constructor() {
    fun mapToEntity(category: Category) =
        with(category){
            CategoryEntity(
                id,
                title,
                icon
            )
        }

    fun mapToModel(entity: CategoryEntity) =
        with(entity){
            Category(
                id,
                title,
                icon
            )
        }

    fun mapToModelList(entityList: List<CategoryEntity>) =
        entityList.map {
            mapToModel(it)
        }
}