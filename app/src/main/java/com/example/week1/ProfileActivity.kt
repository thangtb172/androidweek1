package com.example.week1

import android.nfc.Tag
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

class ProfileActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)
        val btn2 = findViewById<Button>(R.id.btn2);
        val btn3 = findViewById<Button>(R.id.btn3);
        val btn4 = findViewById<Button>(R.id.btn4);
        val btn5 = findViewById<Button>(R.id.btn5);
        val edt3 = findViewById<EditText>(R.id.edt3);
        val edt4 = findViewById<EditText>(R.id.edt4);
        val edt5 = findViewById<EditText>(R.id.edt5);


        btn3.setOnClickListener {
            val builder = AlertDialog.Builder(this)
            builder.apply {
                title="FULLNAME"
                setMessage("Mời edit thông tin fullname")
                setPositiveButton("YES") { dialog, _ ->
                    Toast.makeText(this@ProfileActivity, "Edit fullname", Toast.LENGTH_LONG).show()
                    dialog.dismiss()

                }
                setNegativeButton("Cancel") { dialog, _ ->
                    dialog.dismiss()

                }

            }
            builder.show()
        }
        btn4.setOnClickListener {
            val builder = AlertDialog.Builder(this)
            builder.apply {
                title="FULLNAME"
                setMessage("Mời edit thông tin email")
                setPositiveButton("YES") { dialog, _ ->
                    Toast.makeText(this@ProfileActivity, "Edit email ", Toast.LENGTH_LONG).show()
                    dialog.dismiss()

                }
                setNegativeButton("Cancel") { dialog, _ ->
                    dialog.dismiss()

                }

            }
            builder.show()
        }
        btn5.setOnClickListener {
            val builder = AlertDialog.Builder(this)
            builder.apply {
                title="FULLNAME"
                setMessage("Mời edit thông tin phone")
                setPositiveButton("YES") { dialog, _ ->
                    Toast.makeText(this@ProfileActivity, "Edit phone", Toast.LENGTH_LONG).show()
                    dialog.dismiss()

                }
                setNegativeButton("Cancel") { dialog, _ ->
                    dialog.dismiss()

                }

            }
            builder.show()
        }
        btn2.setOnClickListener {
            var sologan ="";
            sologan = "Thông tin là :"+edt3.text.toString()+"-" + edt4.text.toString()+"-"+edt5.text.toString();
            Toast.makeText(applicationContext,sologan,Toast.LENGTH_LONG).show();


        }

    }
}