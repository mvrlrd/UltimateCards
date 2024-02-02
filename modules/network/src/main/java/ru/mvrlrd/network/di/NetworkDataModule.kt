package ru.mvrlrd.network.di

import dagger.Binds
import dagger.Module
import ru.mvrlrd.network.data.NetworkClient
import ru.mvrlrd.network.data.RemoteDataSource
import ru.mvrlrd.network.data.NetworkRepositoryImpl
import ru.mvrlrd.network.domain.NetworkRepository

@Module
interface NetworkDataModule {
    @Binds
    fun bindsRepository(repositoryImpl: NetworkRepositoryImpl): NetworkRepository
    @Binds
    fun bindsNetworkClient(remoteDataSource: RemoteDataSource): NetworkClient
}