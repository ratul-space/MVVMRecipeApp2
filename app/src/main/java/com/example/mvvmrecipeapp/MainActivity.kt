package com.example.mvvmrecipeapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        supportFragmentManager.beginTransaction()
            .replace(R.id.main_container, RecipeListFragment())
            .commit()


//        setContent {
//            Column {
//                Image(
//                    bitmap = ImageBitmap.imageResource(R.drawable.img_pexels_jonathan_borba),
//                    contentDescription = null,
//                    Modifier.height(300.dp),
//                    contentScale = ContentScale.Crop
//                )
//
//                Column {
//                    Row(
//                        Modifier.fillMaxWidth(),
//                        horizontalArrangement = Arrangement.SpaceBetween
//                    ) {
//                        Text(
//                            text = "Happy meal",
//                            color = Color.Black,
//                            fontSize = 30.sp
//                        )
//                        Text(
//                            text = "200 TK",
//                            fontSize = 24.sp,
//                            color = Color.Blue
//                        )
//                        Modifier.align(Alignment.CenterVertically)
//                    }
//                    Spacer(Modifier.padding(10.dp))
//                    Text(
//                        text = "800 calories",
//                        fontSize = 27.sp,
//                    )
//                    Spacer(Modifier.padding(10.dp))
//                    Button(
//                        onClick = {},
//                        Modifier.align(Alignment.CenterHorizontally)
//                    ) {
//                        Text(text = "ORDER NOW")
//                    }
//                }
//            }
//        }
    }
}