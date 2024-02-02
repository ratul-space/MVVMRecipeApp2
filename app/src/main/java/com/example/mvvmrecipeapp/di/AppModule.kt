package com.example.mvvmrecipeapp.di

import android.content.Context
import com.example.mvvmrecipeapp.presentation.BaseApplication
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.internal.managers.ApplicationComponentManager
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class) // Change this annotation
object AppModule {
    @Provides
    fun provideApplication(@ApplicationContext app: Context): BaseApplication { // Change method name
        return app as BaseApplication
    }

    @Provides
    fun provideRandomString(): String { // Change method name
        return "HEY LOOK A RANDOM STRING!!! TIME TO EAT"
    }
}
