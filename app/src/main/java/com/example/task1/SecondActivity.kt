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
        val age=findViewById<TextView>(R.id.age)
        val name=findViewById<TextView>(R.id.name)
        val welcome=findViewById<TextView>(R.id.welcome)

        //to receive data
        //  passedValue.text=intent.data?.toString()
        // or
        welcome.text=intent.getStringExtra("key")
        name.text="Hello "+intent.getStringExtra("name")
        age.text=(intent.getStringExtra("age")).toString()

        //to navigate from second activity to main activity
        backButton.setOnClickListener{

            val intent= Intent(this,MainActivity::class.java)
            startActivity(intent)
        }
    }

}