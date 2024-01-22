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
import androidx.compose.material3.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            Column {
                Column(
                    Modifier
                        .fillMaxWidth()
                        .height(200.dp)
                        .border(border = BorderStroke(width = 1.dp, color = Color.Black)),
                    verticalArrangement = Arrangement.SpaceAround
                ) {
                    Text(
                        text = "ITEM 1",
                        Modifier.align(Alignment.CenterHorizontally)
                    )
                    Text(
                        text = "ITEM 1",
                        Modifier.align(Alignment.CenterHorizontally)
                    )
                }
                Spacer(Modifier.padding(20.dp))
                Row(
                    Modifier
                        .width(200.dp)
                        .height(200.dp)
                        .border(border = BorderStroke(width = 1.dp, color = Color.Black)),
                    horizontalArrangement = Arrangement.Center
                ) {
                    Text(
                        text = "ITEM 2",
                        Modifier.align(Alignment.CenterVertically)
                    )
                }
            }


        }


//        setContent {
//            Column {
//                Image(
//                    bitmap = ImageBitmap.imageResource(R.drawable.img_pexels_jonathan_borba),
//                    contentDescription = null
//                )
//
//                Column {
//                    Text(
//                        text = "Happy meal",
//                        color = Color.Gray,
//                        fontSize = 34.sp
//                    )
//                    Text(
//                        text = "800 calories",
//                        fontSize = 27.sp,
//                    )
//                    Text(
//                        text = "200 TK",
//                        fontSize = 30.sp,
//                        color = Color.Blue
//                    )
//                }
//            }
//        }
    }
}
