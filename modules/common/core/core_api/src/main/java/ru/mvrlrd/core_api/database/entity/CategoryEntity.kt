package ru.mvrlrd.core_api.database.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = CategoryEntity.TABLE_NAME)
data class CategoryEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Long,
    val title: String,
    val icon: Int
){
    companion object{
        const val TABLE_NAME = "categories_db"
    }
}