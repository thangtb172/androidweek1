package com.example.week1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class onboarding_one : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_onboarding_one)

        val btn = findViewById<ImageButton>(R.id.btOnbOne)

        btn.setOnClickListener {
            val intent = Intent(this,onboarding_two::class.java)
            startActivity(intent)
        }
    }
}


