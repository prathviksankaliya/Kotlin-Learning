package com.itcraftsolution.splashscreenwithapi

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Thread.sleep(2000)
        installSplashScreen()
        setContentView(R.layout.activity_main)

        val btnWelcome = findViewById<Button>(R.id.btnWelcome)
        val btnImplicit = findViewById<Button>(R.id.btnImplicit)

        btnWelcome.setOnClickListener {
            startActivity(Intent(this, ExplicitIntentActivity::class.java))
            finish()
        }

        btnImplicit.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://www.github.com")));
        }
    }
}