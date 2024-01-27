package com.example.mvvmrecipeapp.di

import android.content.Context
import com.example.mvvmrecipeapp.presentation.BaseApplication
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import javax.inject.Singleton


@Module
@InstallIn(ApplicationComponent::Class)
object AppModule {
    @Singleton
    @Provides
    fun ProvideApplication(@ApplicationContext app: Context): BaseApplication {
        val App = null
        return App as BaseApplication
    }
}
