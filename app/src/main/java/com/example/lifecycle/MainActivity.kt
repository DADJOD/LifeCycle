package com.example.lifecycle

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.TextView
import android.widget.Toast

@Suppress("DEPRECATION")
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
        val intent = Intent(this, EditActivity::class.java)
        intent.putExtra("NAME", "JOHN")

//        startActivity(intent)
        startActivityForResult(intent, 444)
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        if (requestCode == 444) {
//            val name = data?.getStringExtra("INPUT_TEXT")
//            if (name != null) {
//                Toast.makeText(this, "Name: $name", Toast.LENGTH_SHORT).show()
//                text.text = name
//            }
            text.text = data?.getStringExtra("INPUT_TEXT")
            return
        }

        super.onActivityResult(requestCode, resultCode, data)
    }
}