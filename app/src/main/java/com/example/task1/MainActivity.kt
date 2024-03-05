package com.example.task1

import android.app.ProgressDialog
import android.content.Intent
import android.os.Bundle
import android.os.CountDownTimer
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var progressDialog: ProgressDialog

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

///////////////////////////////////////////////////////////////////////

        // to navigate from main activity to second activity and send data
        val displayButton = findViewById<Button>(R.id.displayButton)

        val name=findViewById<EditText>(R.id.name_edText)
        val age=findViewById<EditText>(R.id.age_edText)

        displayButton.setOnClickListener {

            val intent=Intent(this,SecondActivity::class.java)

            //intent.data= Uri.parse(name.text.toString())
            //or
            intent.putExtra("key","welcome every one")

            /////////////////////////////////////////////////////////
            //to send pair of data
            val extras = Bundle()
            extras.putString("name", name.text.toString())
            extras.putString("age", age.text.toString())
            intent.putExtras(extras)
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