package com.itcraftsolution.listview

import android.media.Image
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class PhoneRecyclerAdapter(private var phoneList: ArrayList<PhoneDataClass>):
    RecyclerView.Adapter<PhoneRecyclerAdapter.viewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): viewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.sample_recycler_view, parent, false)
        return viewHolder(view)
    }

    override fun getItemCount(): Int {
        return phoneList.size
    }

    override fun onBindViewHolder(holder: viewHolder, position: Int) {
        var curItem = phoneList[position]
        holder.contactPhone.setText(curItem.phone)
        holder.contactImage.setImageResource(curItem.img)
        holder.contactName.setText(curItem.name)
    }

    class viewHolder(itemview : View) : RecyclerView.ViewHolder(itemview) {
        val contactName = itemview.findViewById<TextView>(R.id.txContactName)
        val contactPhone = itemview.findViewById<TextView>(R.id.txContactPhone)
        val contactImage = itemview.findViewById<ImageView>(R.id.igContactImage)
    }

}