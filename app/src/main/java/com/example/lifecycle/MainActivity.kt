package com.example.lifecycle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d("happySDK", Thread.currentThread().stackTrace[2].methodName)
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