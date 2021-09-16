package com.example.pexelphotos

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import com.example.pexelphotos.view.FragmentPhoto

class MainActivity : AppCompatActivity() {
    private var typeProvided = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        typeProvided = findViewById<EditText>(R.id.et_look_text).toString()
//        findViewById<Button>(R.id.button_look).setOnClickListener(inflateFragment())
        supportFragmentManager.beginTransaction()
            //HOW TO SEND DATA FROM MAIN ACTIVITY TO FRAGMENT
            .replace(R.id.fragment_container, FragmentPhoto())
            .commit()
    }

//    private fun inflateFragment() {
//        supportFragmentManager.beginTransaction()
//            //HOW TO SEND DATA FROM MAIN ACTIVITY TO FRAGMENT
//            .replace(R.id.fragment_container, FragmentPhoto())
//            .commit()
//    }
}