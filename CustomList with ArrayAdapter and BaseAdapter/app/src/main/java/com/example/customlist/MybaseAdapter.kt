package com.example.customlist

import android.annotation.SuppressLint
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView

class MybaseAdapter (private val context: Context, private val arrayList:java.util.ArrayList<Mydata>):BaseAdapter(){
    private lateinit var serialNum:TextView
    private lateinit var name:TextView
    private lateinit var contactNum:TextView
    override fun getCount(): Int {
        return arrayList.size
    }

    override fun getItem(position: Int): Any {
        return position
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    @SuppressLint("ViewHolder")
    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        var convertview = convertView
        convertview = LayoutInflater.from(context).inflate(R.layout.rowbase,parent,false)
        serialNum=convertview.findViewById(R.id.serialNumber)
        name=convertview.findViewById(R.id.name)
        contactNum=convertview.findViewById(R.id.contact)
        serialNum.text=" "+arrayList[position].num
        name.text=arrayList[position].name
        contactNum.text=arrayList[position].mobileNumber
        return convertview
    }

}