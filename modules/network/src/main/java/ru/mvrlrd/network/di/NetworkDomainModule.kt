package ru.mvrlrd.network.di

import dagger.Binds
import dagger.Module
import ru.mvrlrd.network.domain.api.SearchTranslationsUseCase
import ru.mvrlrd.network.domain.impl.SearchTranslationsUseCaseImpl

@Module
interface NetworkDomainModule {
    @Binds
    fun bindsSearchTranslationsUseCase(searchTranslationsUseCaseImpl: SearchTranslationsUseCaseImpl): SearchTranslationsUseCase
}