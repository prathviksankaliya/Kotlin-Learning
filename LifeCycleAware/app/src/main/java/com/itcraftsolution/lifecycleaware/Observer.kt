package com.itcraftsolution.lifecycleaware

import android.util.Log
import androidx.lifecycle.DefaultLifecycleObserver
import androidx.lifecycle.LifecycleOwner

class Observer: DefaultLifecycleObserver {

    override fun onCreate(owner: LifecycleOwner){
        super.onCreate(owner)
        Log.d("MAINTAG", "Observer OnCreate() is Called....")
    }

    override fun onStart(owner: LifecycleOwner){
        super.onStart(owner)
        Log.d("MAINTAG", "Observer OnStart() is Called....")
    }

    override fun onResume(owner: LifecycleOwner){
        super.onResume(owner)
        Log.d("MAINTAG", "Observer OnResume() is Called....")
    }

    override fun onPause(owner: LifecycleOwner){
        super.onPause(owner)
        Log.d("MAINTAG", "Observer OnPause() is Called....")
    }

    override fun onStop(owner: LifecycleOwner){
        super.onStop(owner)
        Log.d("MAINTAG", "Observer OnStop() is Called....")
    }

    override fun onDestroy(owner: LifecycleOwner) {
        super.onDestroy(owner)
        Log.d("MAINTAG", "Observer OnDestroy() is Called....")
    }
}