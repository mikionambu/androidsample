package com.example.myapplication

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.provider.AlarmClock.EXTRA_MESSAGE
import android.view.View
import android.widget.EditText

class MainActivity(var EXTRA_MESSAGE: String) : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    /* Sendボタン押下時 */
    fun sendMessage(view: View) {
        val intent: Intent = Intent(this@MainActivity,
            DisplayMessageActivity::class.java)
        val editText: EditText = findViewById(R.id.edittext) as EditText
        val message: String = editText.text.toString()
        val putExtra = intent.putExtra(EXTRA_MESSAGE, message)
        startActivity(intent)
    }
}