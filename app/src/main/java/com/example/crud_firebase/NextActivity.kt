package com.example.crud_firebase

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class NextActivity : AppCompatActivity() {
    private val splashScreentimeout : Long = 5000

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_next)

        Handler().postDelayed({

            startActivity(Intent(this, LoginActivity::class.java))
            finish()

        }, splashScreentimeout)
    }
}