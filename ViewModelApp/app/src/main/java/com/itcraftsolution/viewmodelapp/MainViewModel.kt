package com.itcraftsolution.viewmodelapp

import androidx.lifecycle.ViewModel

class MainViewModel: ViewModel() {
    var count = 0;

    fun increment(){
        count++;
    }

}