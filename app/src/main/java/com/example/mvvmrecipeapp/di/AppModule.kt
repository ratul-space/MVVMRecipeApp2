package com.example.mvvmrecipeapp.di

import android.content.Context
import com.example.mvvmrecipeapp.presentation.BaseApplication
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.internal.managers.ApplicationComponentManager
import dagger.hilt.android.qualifiers.ApplicationContext
import javax.inject.Singleton


@Module
@InstallIn(ApplicationComponentManager::class)
object AppModule {
    @Singleton
    @Provides
    fun ProvideApplication(@ApplicationContext app: Context): BaseApplication {
        return app as BaseApplication
    }
    @Singleton
    @Provides
    fun ProvideRandomString(): String{
        return "HEY LOOK A RANDOM STRING!!! TIME TO EAT"
    }
}
