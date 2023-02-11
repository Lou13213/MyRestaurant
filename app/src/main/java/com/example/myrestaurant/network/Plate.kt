package com.example.myrestaurant.network

import com.google.gson.annotations.SerializedName
import java.io.Serializable

class Plate(
    @SerializedName("name_fr") val name: String,
    @SerializedName("images") val images: List<String>,
    @SerializedName("prices") val prices: Array<Price>,
    @SerializedName("ingredients") val ingredients: List<Ingredient>
): Serializable