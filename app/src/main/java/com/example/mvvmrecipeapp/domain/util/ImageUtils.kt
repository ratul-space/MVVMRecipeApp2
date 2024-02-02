package com.example.mvvmrecipeapp.domain.util

import android.annotation.SuppressLint
import android.graphics.Bitmap
import android.graphics.drawable.Drawable
import android.support.annotation.DrawableRes
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.platform.LocalContext
import com.bumptech.glide.Glide
import com.bumptech.glide.request.target.CustomTarget
import com.bumptech.glide.request.transition.Transition
import com.example.mvvmrecipeapp.R


@SuppressLint("UnrememberedMutableState")
@Composable
fun loadPicture(
    url: String,
    @DrawableRes defaultImage: Int,
): MutableState<Bitmap?> {
    val bitmapState: MutableState<Bitmap?> = mutableStateOf(null)
    Glide.with(LocalContext.current)
        .asBitmap()
        .load(defaultImage)
        .into(object : CustomTarget<Bitmap>() {
            override fun onResourceReady(
                resource: Bitmap,
                transition: Transition<in Bitmap>?,
            ) {
                // Handle the case when the resource (Bitmap) is ready
                bitmapState.value = resource
            }

            override fun onLoadCleared(placeholder: Drawable?) {
                // Handle the case when the load has been cleared
            }
        })
    Glide.with(LocalContext.current)
        .asBitmap()
        .load(url)
        .into(object : CustomTarget<Bitmap>() {
            override fun onResourceReady(
                resource: Bitmap,
                transition: Transition<in Bitmap>?,
            ) {
                // Handle the case when the resource (Bitmap) is ready
                bitmapState.value = resource
            }

            override fun onLoadCleared(placeholder: Drawable?) {
                // Handle the case when the load has been cleared
            }
        })
    return bitmapState
}