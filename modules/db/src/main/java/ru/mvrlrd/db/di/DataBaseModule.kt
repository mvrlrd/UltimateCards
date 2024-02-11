package ru.mvrlrd.db.di

import android.content.Context
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.sqlite.db.SupportSQLiteDatabase
import dagger.Module
import dagger.Provides
import ru.mvrlrd.db.CategoryDao
import ru.mvrlrd.db.UltimateCardsDataBase
import ru.mvrlrd.db.entity.CategoryEntity
import javax.inject.Named

@Module
class DataBaseModule {
    @Provides
    fun providesCategoryDao(ultimateCardsDataBase: UltimateCardsDataBase): CategoryDao{
        return ultimateCardsDataBase.categoryDao()
    }

    @Provides
    fun providesDataBase(context: Context): UltimateCardsDataBase{
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

    private fun prepopulateDatabase(db: SupportSQLiteDatabase) {
        db.execSQL("INSERT INTO ${CategoryEntity.TABLE_NAME} VALUES ('1', 'movies')")
        db.execSQL("INSERT INTO ${CategoryEntity.TABLE_NAME} VALUES ('2', 'nature')")
        db.execSQL("INSERT INTO ${CategoryEntity.TABLE_NAME} VALUES ('3', 'sport')")
        db.execSQL("INSERT INTO ${CategoryEntity.TABLE_NAME} VALUES ('4', 'war')")
        db.execSQL("INSERT INTO ${CategoryEntity.TABLE_NAME} VALUES ('5', 'cars')")
        db.execSQL("INSERT INTO ${CategoryEntity.TABLE_NAME} VALUES ('6', 'work')")
    }
}