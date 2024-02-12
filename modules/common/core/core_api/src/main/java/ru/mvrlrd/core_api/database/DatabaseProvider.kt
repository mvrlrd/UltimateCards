package ru.mvrlrd.core_api.database

interface DatabaseProvider {
    fun provideDatabase(): UltimateCardsDatabaseContract

    fun categoryDao():CategoryDao
}