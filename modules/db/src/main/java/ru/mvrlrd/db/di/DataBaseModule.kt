package ru.mvrlrd.db.di

import android.content.Context
import androidx.room.Room
import dagger.Module
import dagger.Provides
import ru.mvrlrd.db.CategoryDao
import ru.mvrlrd.db.UltimateCardsDataBase

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
        ).build()
    }
}