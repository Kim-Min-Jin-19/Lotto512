package com.example.lotto512

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.cardview.widget.CardView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<View>(R.id.Constellation_CardView).setOnClickListener {
            val intent = Intent(this,ConstellationActivity::class.java)
            startActivity(intent)
        }
        findViewById<View>(R.id.cardConstellation).setOnClickListener {
            startActivity(Intent(this,NameActivity::class.java))
        }

    }
}

