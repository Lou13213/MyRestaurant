package com.example.myrestaurant

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.myrestaurant.databinding.ActivityMenuListBinding

enum class Category { STARTER, MAIN, DESSERT }

class MenuListActivity : AppCompatActivity() {

    companion object {
        val extraKey = "extraKey"
    }

    lateinit var binding: ActivityMenuListBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMenuListBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val category = intent.getSerializableExtra(extraKey) as? Category

        supportActionBar?.title = categoryName( category ?: Category.STARTER)
        // if category == null { category = STARTER }
        showDatas()
    }

    private fun showDatas() {
        binding.recyclerView.layoutManager = LinearLayoutManager(this)
        binding.recyclerView.adapter = CustomAdapter(listOf("1", "2", "3"))
    }

    private fun categoryName(category: Category): String {
        return when(category) {
            Category.STARTER -> getString(R.string.starter)
            Category.MAIN -> getString(R.string.main)
            Category.DESSERT -> getString(R.string.finish)
        }
    }

    override fun onStart() {
        super.onStart()
        Log.d( "lifeCycle", "MenuListActivity onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d("lifeCycle", "MenuListActivity onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d("lifeCycle", "MainActivity onPause")
    }

    override fun onDestroy() {
        Log.d("lifeCycle", "MainActivity onDestroy")
        super.onDestroy()
    }
}