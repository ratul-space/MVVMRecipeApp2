package com.example.mvvmrecipeapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.mvvmrecipeapp.domain.model.Recipe
import com.example.mvvmrecipeapp.network.model.RecipeNetworkEntity
import com.example.mvvmrecipeapp.network.model.RecipeNetworkMapper
import retrofit2.Retrofit

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val service = Retrofit.Builder()





//        val mapper = RecipeNetworkMapper()
//        val recipe = Recipe()
//        val networkEntity: RecipeNetworkEntity = mapper.mapToEntity(recipe)
//        val r: Recipe = mapper.mapFromEntity(networkEntity)

    }
}