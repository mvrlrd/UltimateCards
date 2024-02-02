package ru.mvrlrd.network.di

import com.jakewharton.retrofit2.converter.kotlinx.serialization.asConverterFactory
import dagger.Module
import dagger.Provides
import kotlinx.serialization.json.Json
import okhttp3.MediaType.Companion.toMediaType
import okhttp3.OkHttpClient
import retrofit2.Converter
import retrofit2.Retrofit
import ru.mvrlrd.network.data.SkyEngApiService


@Module
class RetrofitModule{
        @Provides
        fun provideRetrofit(
            okHttpClient: OkHttpClient,
            converterFactory: Converter.Factory
        ): Retrofit {
            return Retrofit.Builder()
                .baseUrl("https://dictionary.skyeng.ru/api/public/v1/")
                .client(okHttpClient)
                .addConverterFactory(converterFactory)
                .build()
        }

        @Provides
        fun provideConverterFactory(): Converter.Factory {
            val contentType = "application/json".toMediaType()
            return Json { ignoreUnknownKeys = true }.asConverterFactory(contentType)
        }

        @Provides
        fun provideOkHttpClient(): OkHttpClient {
            return OkHttpClient.Builder()
                .build()
        }

        @Provides
        fun providesApiService(retrofit: Retrofit): SkyEngApiService {
            return retrofit.create(SkyEngApiService::class.java)
        }


}