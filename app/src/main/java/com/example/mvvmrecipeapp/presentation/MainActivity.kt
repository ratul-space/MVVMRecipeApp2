package com.example.mvvmrecipeapp.presentation

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.mvvmrecipeapp.R
import javax.inject.Inject


class MainActivity : AppCompatActivity() {
    @Inject
    lateinit var someRandomString: String
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



//        val service = Retrofit.Builder()





//        val mapper = RecipeNetworkMapper()
//        val recipe = Recipe()
//        val networkEntity: RecipeNetworkEntity = mapper.mapToEntity(recipe)
//        val r: Recipe = mapper.mapFromEntity(networkEntity)

    }
}