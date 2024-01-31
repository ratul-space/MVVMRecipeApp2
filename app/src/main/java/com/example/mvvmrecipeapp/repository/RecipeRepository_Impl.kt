package com.example.mvvmrecipeapp.repository

import com.example.mvvmrecipeapp.domain.model.Recipe
import com.example.mvvmrecipeapp.network.RecipeService
import com.example.mvvmrecipeapp.network.model.RecipeDtoMapper
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class RecipeRepository_Impl
@Inject
constructor(
    private val recipeService: RecipeService,
    private val mapper: RecipeDtoMapper,
) : RecipeRepository {
    override suspend fun search(token: String, page: Int, query: String): List<Recipe> {
        return mapper.toDomainList(recipeService.search(token, page, query).recipe)
    }

    override suspend fun get(token: String, id: Int): Recipe {
        return mapper.mapToDomainModel(recipeService.get(token, id))
    }
}