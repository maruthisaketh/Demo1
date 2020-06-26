package com.example.demo1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.demo1.utilities.StringUtility
import com.google.gson.GsonBuilder

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Toast.makeText(this,"Hello from The Developer!", Toast.LENGTH_LONG).show()

        val gson = GsonBuilder().create()

        val util = StringUtility()
        println(util.getAString())
    }
}