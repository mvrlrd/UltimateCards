package ru.mvrlrd.db

import androidx.room.Database
import androidx.room.RoomDatabase
import ru.mvrlrd.db.entity.CategoryEntity

@Database(
    entities = [
        CategoryEntity::class
    ], version = 1
)
abstract class UltimateCardsDataBase : RoomDatabase() {
    abstract fun categoryDao(): CategoryDao
}