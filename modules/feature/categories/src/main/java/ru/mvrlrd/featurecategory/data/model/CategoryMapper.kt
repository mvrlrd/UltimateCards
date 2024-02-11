package ru.mvrlrd.featurecategory.data.model

import ru.mvrlrd.core.Category
import ru.mvrlrd.db.entity.CategoryEntity
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