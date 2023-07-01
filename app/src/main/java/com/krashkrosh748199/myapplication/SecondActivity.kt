package com.krashkrosh748199.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class SecondActivity:AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_seconed)
val btnSecond=findViewById<Button>(R.id.btnBack)
        btnSecond.setOnClickListener {
            finish()
        }
        val btnNext=findViewById<Button>(R.id.btnNextActivity)
        btnNext.setOnClickListener {
            Intent(this, ThirdActivity::class.java).also {
                startActivity(it)
            }

        }
    }
}