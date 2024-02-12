package ru.mvrlrd.core_impl

import androidx.room.Database
import androidx.room.RoomDatabase
import ru.mvrlrd.core_api.database.UltimateCardsDatabaseContract
import ru.mvrlrd.core_api.database.entity.CategoryEntity

@Database(entities = [CategoryEntity::class], version = 1)
abstract class UltimateCardsDataBase : RoomDatabase(), UltimateCardsDatabaseContract