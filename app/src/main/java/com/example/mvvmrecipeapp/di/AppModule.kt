package com.example.mvvmrecipeapp.di

import android.content.Context
import com.example.mvvmrecipeapp.BaseApplication

@Module
@InstallIn(ApplicationComponent::Class)
object AppModule {
    @Singleton
    @Provides
    fun ProvideApplication(@ApplicationContext app: Context): BaseApplication {
        return App as BaseApplication
    }
}