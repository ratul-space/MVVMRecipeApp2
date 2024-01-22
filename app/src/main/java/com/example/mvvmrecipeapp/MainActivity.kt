package com.example.mvvmrecipeapp

import android.os.Build
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.annotation.RequiresApi
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)



        setContent {
            Column {
                Image(
                    bitmap = ImageBitmap.imageResource(R.drawable.img_pexels_jonathan_borba),
                    contentDescription = null,
                    Modifier.height(300.dp),
                    contentScale = ContentScale.Crop
                )

                Column {
                    Row(
                        Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {
                        Text(
                            text = "Happy meal",
                            color = Color.Black,
                            fontSize = 30.sp
                        )
                        Text(
                            text = "200 TK",
                            fontSize = 24.sp,
                            color = Color.Blue
                        )
                        Modifier.align(Alignment.CenterVertically)
                    }
                    Spacer(Modifier.padding(10.dp))
                    Text(
                        text = "800 calories",
                        fontSize = 27.sp,
                    )
                    Spacer(Modifier.padding(10.dp))
                    Button(
                        onClick = {},
                        Modifier.align(Alignment.CenterHorizontally)
                    ) {
                        Text(text = "ORDER NOW")
                    }
                }
            }
        }
    }
}