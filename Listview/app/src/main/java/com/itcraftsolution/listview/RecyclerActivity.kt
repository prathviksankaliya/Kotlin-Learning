package com.itcraftsolution.listview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class RecyclerActivity : AppCompatActivity() {

    private lateinit var phoneRecyclerView: RecyclerView
    private lateinit var phoneList: ArrayList<PhoneDataClass>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycler)
        phoneList = ArrayList<PhoneDataClass>()
        phoneList.add(PhoneDataClass("Prathvik Sankaliya", "9723816724", R.drawable.twitter))
        phoneList.add(PhoneDataClass("Akshay Kher", "9723816724", R.drawable.twitter))
        phoneList.add(PhoneDataClass("Mamad alyani", "9723816724", R.drawable.twitter))
        phoneList.add(PhoneDataClass("Bharat Makawana", "9723816724", R.drawable.twitter))
        phoneList.add(PhoneDataClass("Savan Sutariya", "9723816724", R.drawable.twitter))
        phoneList.add(PhoneDataClass("Jaymin valaki", "9723816724", R.drawable.twitter))
        phoneList.add(PhoneDataClass("Rajani Tank", "9723816724", R.drawable.twitter))
        phoneList.add(PhoneDataClass("Yagna Bhatt", "9723816724", R.drawable.twitter))
        phoneList.add(PhoneDataClass("Jignesh Lakum", "9723816724", R.drawable.twitter))
        phoneList.add(PhoneDataClass("Rutvik Sonani", "9723816724", R.drawable.twitter))
        phoneList.add(PhoneDataClass("Prathvik Sankaliya", "9723816724", R.drawable.twitter))
        phoneList.add(PhoneDataClass("Akshay Kher", "9723816724", R.drawable.twitter))
        phoneList.add(PhoneDataClass("Mamad alyani", "9723816724", R.drawable.twitter))
        phoneList.add(PhoneDataClass("Bharat Makawana", "9723816724", R.drawable.twitter))
        phoneList.add(PhoneDataClass("Savan Sutariya", "9723816724", R.drawable.twitter))
        phoneList.add(PhoneDataClass("Jaymin valaki", "9723816724", R.drawable.twitter))
        phoneList.add(PhoneDataClass("Rajani Tank", "9723816724", R.drawable.twitter))
        phoneList.add(PhoneDataClass("Yagna Bhatt", "9723816724", R.drawable.twitter))
        phoneList.add(PhoneDataClass("Jignesh Lakum", "9723816724", R.drawable.twitter))
        phoneList.add(PhoneDataClass("Rutvik Sonani", "9723816724", R.drawable.twitter))

        phoneRecyclerView = findViewById(R.id.rvList)


        phoneRecyclerView.layoutManager = LinearLayoutManager(this)
        phoneRecyclerView.setHasFixedSize(false)

        phoneRecyclerView.adapter = PhoneRecyclerAdapter(phoneList)
    }
}