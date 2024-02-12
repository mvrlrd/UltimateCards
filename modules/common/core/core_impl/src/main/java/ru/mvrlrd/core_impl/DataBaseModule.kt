package ru.mvrlrd.core_impl

import android.content.Context
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.sqlite.db.SupportSQLiteDatabase
import dagger.Module
import dagger.Provides
import dagger.Reusable
import ru.mvrlrd.core_api.database.CategoryDao
import ru.mvrlrd.core_api.database.UltimateCardsDatabaseContract
import ru.mvrlrd.core_api.database.entity.CategoryEntity
import javax.inject.Singleton

@Module
class DataBaseModule {

    @Provides
    @Singleton
    fun providesDataBase(context: Context): UltimateCardsDatabaseContract{
        return Room.inMemoryDatabaseBuilder(
            context= context,
            klass = UltimateCardsDataBase::class.java,
        )
            .addCallback(object : RoomDatabase.Callback() {
                override fun onCreate(db: SupportSQLiteDatabase) {
                    super.onCreate(db)
                    prepopulateDatabase(db)
                }
            })
            .build()
    }

    @Provides
    @Reusable
    fun providesCategoryDao(databaseContract: UltimateCardsDatabaseContract): CategoryDao {
        return databaseContract.categoriesDao()
    }

    private fun prepopulateDatabase(db: SupportSQLiteDatabase) {
        db.execSQL("INSERT INTO ${CategoryEntity.TABLE_NAME} VALUES ('1', 'movies')")
        db.execSQL("INSERT INTO ${CategoryEntity.TABLE_NAME} VALUES ('2', 'nature')")
        db.execSQL("INSERT INTO ${CategoryEntity.TABLE_NAME} VALUES ('3', 'sport')")
        db.execSQL("INSERT INTO ${CategoryEntity.TABLE_NAME} VALUES ('4', 'war')")
        db.execSQL("INSERT INTO ${CategoryEntity.TABLE_NAME} VALUES ('5', 'cars')")
        db.execSQL("INSERT INTO ${CategoryEntity.TABLE_NAME} VALUES ('6', 'work')")
    }
}