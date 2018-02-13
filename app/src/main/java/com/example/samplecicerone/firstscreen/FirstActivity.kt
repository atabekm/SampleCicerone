package com.example.samplecicerone.firstscreen

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.example.samplecicerone.R
import com.example.samplecicerone.secondscreen.SecondActivity
import kotlinx.android.synthetic.main.activity_first.*

class FirstActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first)

        goToNextActivity.setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java)
            startActivity(intent)
        }
    }
}
