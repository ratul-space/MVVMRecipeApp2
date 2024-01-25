package com.example.mvvmrecipeapp

class RecipeNetworkEntity(
    @SerializedName("pk")
    val pk: Int? = null

    @SerializedName("title")
    val title: String? = null

    @SerializedName("publisher")
    val publisher: String? = null

    @SerializedName("rating")
    val rating: Int? = null

    @SerializedName("source_url")
    val sourceUrl: String? = null

    @SerializedName("description")
    val description: String? = null

    @SerializedName("cocking_instructions")
    val cockingInstructions: String? = null

    @SerializedName("ingredients")
    val ingredients: List<String>? = null

    @SerializedName("date_added")
    val dateAdded: String? = null

    @SerializedName("date_updated")
    val dateUpdated: String? = null
)