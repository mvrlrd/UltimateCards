package ru.mvrlrd.add_category.di

import dagger.Component
import ru.mvrlrd.add_category.AddCategoryFragment
import ru.mvrlrd.core_api.mediator.ProvidersFacade


@Component(
    dependencies = [ProvidersFacade::class],
    modules = [AddCategoryDataModule::class,
        AddCategoryDomainModule::class]
)
interface AddCategoryComponent {
    fun inject(fragment: AddCategoryFragment)

    companion object {
        fun getFeatureCategoryComponent(providersFacade: ProvidersFacade): AddCategoryComponent{
            return DaggerAddCategoryComponent.builder().providersFacade(providersFacade).build()
        }
    }
}