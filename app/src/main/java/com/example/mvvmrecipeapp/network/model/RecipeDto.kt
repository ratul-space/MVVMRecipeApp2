package com.example.mvvmrecipeapp.network.model

import android.os.Parcel
import android.os.Parcelable
import com.google.gson.annotations.SerializedName


data class RecipeDto(
    @SerializedName("pk")
    val pk: Int? = null,

    @SerializedName("id")
    val id: Int? = null,

    @SerializedName("title")
    val title: String? = null,

    @SerializedName("featured_image")
    val featuredImage: String? = null,

    @SerializedName("publisher")
    val publisher: String? = null,

    @SerializedName("rating")
    val rating: Int? = null,

    @SerializedName("source_url")
    val sourceUrl: String? = null,

    @SerializedName("description")
    val description: String? = null,

    @SerializedName("cooking_instructions")
    val cookingInstructions: String? = null,

    @SerializedName("ingredients")
    val ingredients: List<String>? = null,

    @SerializedName("date_added")
    val dateAdded: String? = null,

    @SerializedName("date_updated")
    val dateUpdated: String? = null,
) : Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readValue(Int::class.java.classLoader) as? Int,
        parcel.readValue(Int::class.java.classLoader) as? Int,
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readValue(Int::class.java.classLoader) as? Int,
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.createStringArrayList(),
        parcel.readString(),
        parcel.readString()
    ) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeValue(pk)
        parcel.writeValue(id)
        parcel.writeString(title)
        parcel.writeString(featuredImage)
        parcel.writeString(publisher)
        parcel.writeValue(rating)
        parcel.writeString(sourceUrl)
        parcel.writeString(description)
        parcel.writeString(cookingInstructions)
        parcel.writeStringList(ingredients)
        parcel.writeString(dateAdded)
        parcel.writeString(dateUpdated)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<RecipeDto> {
        override fun createFromParcel(parcel: Parcel): RecipeDto {
            return RecipeDto(parcel)
        }

        override fun newArray(size: Int): Array<RecipeDto?> {
            return arrayOfNulls(size)
        }
    }
}