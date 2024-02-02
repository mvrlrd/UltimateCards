package ru.mvrlrd.network.di

import dagger.Binds
import dagger.Module
import ru.mvrlrd.network.data.NetworkClient
import ru.mvrlrd.network.data.RemoteDataSource
import ru.mvrlrd.network.data.RepositoryImpl
import ru.mvrlrd.network.domain.Repository

@Module
interface NetworkDataModule {
    @Binds
    fun bindsRepository(repositoryImpl: RepositoryImpl): Repository
    @Binds
    fun bindsNetworkClient(remoteDataSource: RemoteDataSource): NetworkClient
}