package ru.mvrlrd.featurecategory.data.model

import ru.mvrlrd.featurecategory.data.model.CategoryEntity
import ru.mvrlrd.featurecategory.domain.Category

internal fun CategoryEntity.mapToCategory() =
    Category(
        this.id,
        this.name
    )

internal fun Category.mapToEntity() =
    CategoryEntity(
        this.id,
        this.name
    )