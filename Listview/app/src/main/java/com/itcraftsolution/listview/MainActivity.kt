package com.itcraftsolution.listview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListAdapter
import android.widget.ListView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val listview = findViewById<ListView>(R.id.listView)
        val listItems = arrayOf("Prathvik", "Akshay", "Alyani", "Bharat", "Savan", "Jay", "Rajni", "Jigo", "Rutvik", "Yagna", "Rushit")
        val listAdapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, listItems)
        listview.adapter = listAdapter

        listview.setOnItemClickListener { parent, view, position, id ->
            val pos = parent.getItemAtPosition(position).toString()
            Toast.makeText(this, pos, Toast.LENGTH_SHORT).show()
        }
    }
}