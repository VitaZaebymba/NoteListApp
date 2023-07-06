package com.vita_zaebymba.notelistapp.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.vita_zaebymba.notelistapp.R
import com.vita_zaebymba.notelistapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setBottomNavListener()
    }

    private fun setBottomNavListener() {
        binding.bNav.setOnItemSelectedListener {

            when(it.itemId){
                R.id.settings -> {
                    Toast.makeText(applicationContext, "Settings clicked!", Toast.LENGTH_SHORT).show()
                }
                R.id.notes -> {
                    Toast.makeText(applicationContext, "Notes clicked!", Toast.LENGTH_SHORT).show()
                }
                R.id.shop_list -> {
                    Toast.makeText(applicationContext, "List clicked!", Toast.LENGTH_SHORT).show()
                }
                R.id.new_item -> {
                    Toast.makeText(applicationContext, "New item clicked!", Toast.LENGTH_SHORT).show()
                }
            }
            true
        }
    }

}