package com.example.onboarding

import android.content.Intent
import android.os.Bundle
import android.view.WindowManager
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity
import com.example.week1.ProfileActivity
import com.example.week1.R
import com.example.week1.WelcomeTo


class onboarding_three : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_on_board3)
        val skip = findViewById<ImageButton>(R.id.skip)
        skip.setOnClickListener {
            val intent = Intent(this@onboarding_three,WelcomeTo::class.java)
            startActivity(intent)
        }
    }
}