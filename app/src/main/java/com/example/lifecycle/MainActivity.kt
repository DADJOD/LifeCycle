package com.example.lifecycle

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity(), View.OnClickListener {
    lateinit var text: TextView

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d("happySDK", Thread.currentThread().stackTrace[2].methodName)

        text = findViewById(R.id.textView)
        text.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        startActivity(Intent(this, EditActivity::class.java))
    }

    override fun onStart() {
        super.onStart()

        Log.d("happySDK", Thread.currentThread().stackTrace[2].methodName)
    }

    override fun onResume() {
        super.onResume()

        Log.d("happySDK", Thread.currentThread().stackTrace[2].methodName)
    }

    override fun onPause() {
        super.onPause()

        Log.d("happySDK", Thread.currentThread().stackTrace[2].methodName)
    }

    override fun onStop() {
        super.onStop()

        Log.d("happySDK", Thread.currentThread().stackTrace[2].methodName)
    }

    override fun onRestart() {
        super.onRestart()

        Log.d("happySDK", Thread.currentThread().stackTrace[2].methodName)
    }

    override fun onDestroy() {
        super.onDestroy()

        Log.d("happySDK", Thread.currentThread().stackTrace[2].methodName)
    }
}