package com.example.mvvmrecipeapp.presentation.ui.recipe_list

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.ComposeView
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.fragment.app.viewModels
import androidx.navigation.findNavController
import com.example.mvvmrecipeapp.R
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class RecipeListFragment : androidx.fragment.app.Fragment() {

    val viewModel: RecipeListViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        println("RecipeListFragment: $viewModel")
    }
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        return ComposeView(requireContext()).apply {
            setContent {
                Column(modifier = Modifier.padding(16.dp)) {
                     Text(text = "Recipe list",
                         fontSize = 22.sp
                     )
                    Spacer(modifier = Modifier.padding(10.dp))
                    Button(onClick = {
                        findNavController().navigate(R.id.viewRecipe)
                    }) {
                    Text(text = "TO RECIPE FRAGMENT")
                    }
                }
            }
        }
//        val view = inflater.inflate(R.layout.fragment_recipe_list, container, false)
//        view.findViewById<ComposeView>(R.id.compose_view).setContent {
//            Column(
//                modifier = Modifier
//                    .border(border = BorderStroke(1.dp, color = Color.Black))
//                    .padding(16.dp)
//            ) {
//                Text(text = "THIS IS A COMPOSABLE INSIDE THE FRAGMENT")
//                Spacer(modifier = Modifier.padding(10.dp))
//                CircularProgressIndicator()
//                Spacer(modifier = Modifier.padding(10.dp))
//                Text(text = "NEAT")
//                Spacer(modifier = Modifier.padding(10.dp))
//
//                val customView = HorizontalDottedProgress(requireContext())
//                AndroidView({
//                    customView
//                })
//
//            }
//        }

    }
}