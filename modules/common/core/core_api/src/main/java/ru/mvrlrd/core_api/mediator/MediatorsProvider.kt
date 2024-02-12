package ru.mvrlrd.core_api.mediator

interface MediatorsProvider {
    fun provideAddCategoryMediator(): AddCategoryMediator
}