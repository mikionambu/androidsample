package com.example.myapplication

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class DisplayMessageActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_display_message)
        // Activity開始時にIntentを取得し、文字列をセットする
        val intent: Intent = getIntent()
        val message: String? = intent.getStringExtra(“KEY”)
        val textView: TextView = findViewById(R.id.textView)
        textView.setText(message)
    }
}