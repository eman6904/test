package com.example.task1

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
/////////////////////////////////////////////////////////////////////


        val backButton=findViewById<Button>(R.id.backButton)
        val passedValue=findViewById<TextView>(R.id.passedValue)

        //to receive data
        //  passedValue.text=intent.data?.toString()
        // or
        passedValue.text="Hello "+intent.getStringExtra("key")

        //to navigate from second activity to main activity
        backButton.setOnClickListener{

            val intent= Intent(this,MainActivity::class.java)
            startActivity(intent)
        }
    }

}