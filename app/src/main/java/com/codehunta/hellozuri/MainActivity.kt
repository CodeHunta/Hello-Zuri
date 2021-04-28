package com.codehunta.hellozuri

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val increase = findViewById<Button>(R.id.btnHelloZuri)
        val number = findViewById<TextView>(R.id.txtViewCount)
        var count = 0

        increase.setOnClickListener {
            count++
            number.text = count.toString()
        }
    }
}