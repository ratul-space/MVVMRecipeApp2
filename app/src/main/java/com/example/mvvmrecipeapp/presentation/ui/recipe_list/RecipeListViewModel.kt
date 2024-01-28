package com.example.mvvmrecipeapp.presentation.ui.recipe_list

import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.ViewModel


class RecipeListViewModel
    @ViewModelInject
    constructor(
        private val randomString: String
    ): ViewModel(){
        init {
            println("VIEW MODEL: $randomString")
        }

    }
