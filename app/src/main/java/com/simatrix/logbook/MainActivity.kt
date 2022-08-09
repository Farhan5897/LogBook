package com.simatrix.logbook

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var add: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        add = findViewById(R.id.add_button)
        add.setOnClickListener {
            Toast.makeText(this, "moga", Toast.LENGTH_SHORT).show()
        }
    }
}