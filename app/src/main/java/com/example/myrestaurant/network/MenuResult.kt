package com.example.myrestaurant.network

import com.example.myrestaurant.network.Category
import com.google.gson.annotations.SerializedName
import java.io.Serializable

class MenuResult(@SerializedName("data") val data:List<Category>): Serializable {

}