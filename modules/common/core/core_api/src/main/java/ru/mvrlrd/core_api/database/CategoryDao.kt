package ru.mvrlrd.core_api.database

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import kotlinx.coroutines.flow.Flow
import ru.mvrlrd.core_api.database.entity.CategoryEntity


@Dao
interface CategoryDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertCategory(category: CategoryEntity): Long

    @Query("DELETE FROM categories_db")
    suspend fun clearCategories(): Int

    @Query("SELECT * FROM categories_db")
    fun getAllCategories(): Flow<List<CategoryEntity>>

}