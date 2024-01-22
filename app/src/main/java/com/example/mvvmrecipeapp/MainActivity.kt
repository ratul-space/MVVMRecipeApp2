package com.example.mvvmrecipeapp

import android.os.Build
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.annotation.RequiresApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Column {
                Image(
                    bitmap = ImageBitmap.imageResource(R.drawable.img_pexels_jonathan_borba),
                    contentDescription = null
                )

                Column {
                    Text(
                        text = "Happy meal",
                        color = Color.Gray,
                        fontSize = 34.sp
                    )
                    Text(
                        text = "800 calories",
                        fontSize = 27.sp,
                    )
                    Text(
                        text = "200 TK",
                        fontSize = 30.sp,
                        color = Color.Blue
                    )
                }
            }
        }
    }
}
