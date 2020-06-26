package com.vivek.textviewkotlin

import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import java.lang.StringBuilder

class MainActivity : AppCompatActivity() {
    var stringBuilder = StringBuilder("vivugitdev")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textview1 = findViewById<TextView>(R.id.textview1)
        val textview2 = findViewById<TextView>(R.id.textview2)

        textview1.setTextColor(resources.getColor(R.color.colorPrimaryDark))

        textview1.text = stringBuilder.append(" Get Free Source Code")

        textview2.text = stringBuilder.reverse()
    }

    fun clickhere(view: View) {
        Toast.makeText(this, "clicked", Toast.LENGTH_SHORT).show()
    }
}