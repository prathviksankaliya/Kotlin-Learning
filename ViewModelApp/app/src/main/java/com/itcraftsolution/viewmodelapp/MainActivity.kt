package com.itcraftsolution.viewmodelapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import androidx.lifecycle.ViewModelProvider
import com.itcraftsolution.viewmodelapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding;
    private lateinit var mainViewModel: MainViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        mainViewModel = ViewModelProvider(this).get(MainViewModel::class.java)
        binding.txCount.setText(mainViewModel.count.toString());
        binding.btnIncrementCount.setOnClickListener{
            mainViewModel.increment();
            binding.txCount.setText(mainViewModel.count.toString());
        }
    }
}