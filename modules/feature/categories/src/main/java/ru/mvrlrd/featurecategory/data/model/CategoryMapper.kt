package ru.mvrlrd.featurecategory.data.model


import ru.mvrlrd.core_api.database.entity.CategoryEntity
import ru.mvrlrd.core_api.dto.Category
import javax.inject.Inject

class CategoryMapper@Inject constructor() {
    fun mapToEntity(category: Category) =
        with(category){
            CategoryEntity(
                id,
                title
            )
        }

    fun mapToModel(entity: CategoryEntity) =
        with(entity){
            Category(
                id,
                title
            )
        }

    fun mapToModelList(entityList: List<CategoryEntity>) =
        entityList.map {
            mapToModel(it)
        }
}