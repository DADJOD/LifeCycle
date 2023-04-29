package com.example.lifecycle

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText

class EditActivity : AppCompatActivity(), View.OnClickListener {
    lateinit var edit: EditText
    lateinit var button: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit)

        edit = findViewById(R.id.edit)
        button = findViewById(R.id.button)

        val intent = intent
//        val strIntent = intent.getStringExtra("NAME")
        edit.setText(intent.getStringExtra("NAME"))

        button.setOnClickListener(this)

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

    override fun onClick(v: View?) {
        val inputText = edit.text.toString()

        val intent2 = Intent()
        intent2.putExtra("INPUT_TEXT", inputText)
        setResult(RESULT_OK, intent2)
        onBackPressed()
    }


}