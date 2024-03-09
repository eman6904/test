package com.example.task1

import android.app.Activity
import android.app.ProgressDialog
import android.content.Intent
import android.graphics.Paint
import android.os.Bundle
import android.os.CountDownTimer
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val title=findViewById<TextView>(R.id.title)
        val signup=findViewById<TextView>(R.id.signup)

        //to set underline with text
        title.paintFlags = Paint.UNDERLINE_TEXT_FLAG

        signup.paintFlags = Paint.UNDERLINE_TEXT_FLAG

    }

}