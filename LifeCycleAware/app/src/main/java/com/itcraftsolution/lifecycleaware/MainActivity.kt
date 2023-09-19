package com.itcraftsolution.lifecycleaware

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        lifecycle.addObserver(Observer())
        Log.d("MAINTAG", "Activity OnCreate() is Called....")
    }

    override fun onStart() {
        super.onStart()
        Log.d("MAINTAG", "Activity OnStart() is Called....")
    }

    override fun onResume() {
        super.onResume()
        Log.d("MAINTAG", "Activity OnResume() is Called....")

    }

    override fun onPause() {
        super.onPause()
        Log.d("MAINTAG", "Activity OnPause() is Called....")

    }

    override fun onStop() {
        super.onStop()
        Log.d("MAINTAG", "Activity OnStop() is Called....")

    }

    override fun onRestart() {
        super.onRestart()
        Log.d("MAINTAG", "Activity OnRestart() is Called....")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("MAINTAG", "Activity OnDestroy() is Called....")
    }
}

// at the time of creation first call activity life cycles and then call observer life cycle
//At the time of pause and stop then first call observer life cycle and then called activity life cycle
