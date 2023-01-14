package com.example.myapplication

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.provider.AlarmClock.EXTRA_MESSAGE
import android.view.View
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    /* Sendボタン押下時 */
    fun sendMessage(view: View) {
        val intent = Intent(this, DisplayMessageActivity::class.java).apply {
            val editText: EditText = findViewById(R.id.edittext) as EditText
            val text: String? = editText.text.toString()
            putExtra(“KEY”, text)
        }
        val editText: EditText = findViewById(R.id.edittext) as EditText
        val text: String? = editText.text.toString()
        intent.putExtra(“KEY”, text)
        startActivity(intent)
    }
}


