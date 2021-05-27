package com.example.lotto512

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.lotto512.R
import com.example.lotto512.ResultActivity

class ConstellationActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_constellation)

        val btnGoResult = findViewById<Button>(R.id.btnGoResult)
        btnGoResult.setOnClickListener {
            startActivity(Intent(this,ResultActivity::class.java))
        }
    }
}