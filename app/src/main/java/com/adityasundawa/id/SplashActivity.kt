package com.adityasundawa.id

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        Handler().postDelayed({
            //start main activity
            startActivity(Intent(this@SplashActivity, MainActivity::class.java))
            //finish this activity
            finish()
        },4000)
    }
    }

