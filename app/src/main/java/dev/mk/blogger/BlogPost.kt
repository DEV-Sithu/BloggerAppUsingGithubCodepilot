package dev.mk.blogger

import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
import com.google.gson.annotations.SerializedName


data class BlogPost(
    val id: String,
    val title: String,
    val content: String,
    val published: String,
    val updated: String,
    @SerializedName("image")
    val images: List<ImageInfo>? = null
)

data class ImageInfo(
    @SerializedName("url")
    val url: String
)