package com.example.week1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        val edt1 = findViewById<EditText>(R.id.edt1);
        val edt2 = findViewById<EditText>(R.id.edt2);
        val btn = findViewById<Button>(R.id.btn);
        btn.setOnClickListener {
            val username = "ronaldo@gmail.com";
            val password = "123456";
            if(edt1.text.toString() == username && edt2.text.toString() == password ){
                Toast.makeText(applicationContext,"Account Hợp Lệ",Toast.LENGTH_LONG).show();
                val intent = Intent(this@MainActivity,ProfileActivity::class.java)
                startActivity(intent)

            }
            else {
                Toast.makeText(applicationContext,"Mời nhập lại ",Toast.LENGTH_LONG).show();
            }


        }
    }

}