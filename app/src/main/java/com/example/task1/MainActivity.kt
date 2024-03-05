package com.example.task1

import android.app.Activity
import android.app.PendingIntent.getActivity
import android.app.ProgressDialog
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.util.Log
import android.view.View
import android.widget.*
import androidx.core.view.isVisible

class MainActivity : AppCompatActivity() {

    private lateinit var progressDialog: ProgressDialog

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

///////////////////////////////////////////////////////////////////////

        // to navigate from main activity to second activity and send data
        val displayButton = findViewById<Button>(R.id.displayButton)

        val name=findViewById<EditText>(R.id.edText)

        displayButton.setOnClickListener {

            val intent=Intent(this,SecondActivity::class.java)

            //intent.data= Uri.parse(name.text.toString())
            //or
            intent.putExtra("key",name.text.toString())
            startActivity(intent)

        }

    }

    ///////////////////////////////////////////////////////////////////////////////////////////
    //to show progressDialog
    override fun onStart() {
        super.onStart()
        progressDialog = ProgressDialog.show(this, "Please Wait", "Processing...", true)
        object : CountDownTimer(3000, 1000) {
            override fun onTick(millisUntilFinished: Long) {
                // Do nothing on tick
            }

            override fun onFinish() {
                progressDialog.dismiss()
            }
        }.start()
    }
}