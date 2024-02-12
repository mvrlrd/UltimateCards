package ru.mvrlrd.core_api.mediator

import ru.mvrlrd.core_api.database.DatabaseProvider

interface ProvidersFacade: AppProvider, DatabaseProvider, MediatorsProvider {
}