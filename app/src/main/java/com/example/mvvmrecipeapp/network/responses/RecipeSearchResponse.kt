package com.example.mvvmrecipeapp.network.responses

import com.example.mvvmrecipeapp.domain.model.Recipe
import com.example.mvvmrecipeapp.network.model.RecipeNetworkEntity
import com.google.gson.annotations.SerializedName

class RecipeSearchResponse (
    @SerializedName("count")
    var count: Int,

    @SerializedName("results")
    var recipe: List<RecipeNetworkEntity>
)