package com.example.helloword

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity


class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        val handler = Handler()
        handler.postDelayed({ mostrarMainActivity() }, 4000)
    }

    private fun mostrarMainActivity() {
        val intent = Intent(
            this@SplashActivity, MainActivity::class.java
        )
        startActivity(intent)
        finish()
    }
}