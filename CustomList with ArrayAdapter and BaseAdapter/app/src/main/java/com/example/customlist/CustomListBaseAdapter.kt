package com.example.customlist

import android.os.Bundle
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity

class CustomListBaseAdapter :AppCompatActivity(){
    lateinit var listView: ListView
    var arrayList:ArrayList<Mydata> = ArrayList()
    var adapter:MybaseAdapter?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.customlistbaseadapter)
        title="ListView BaseAdapter"
        listView=findViewById(R.id.listview)
        arrayList.add(Mydata(1,"Piyush","7739655582"))
        arrayList.add(Mydata(2,"Prince","7739655582"))
        arrayList.add(Mydata(3,"Aman","7739655582"))
        arrayList.add(Mydata(4,"Piyush","7739655582"))
        arrayList.add(Mydata(5,"Prince","7739655582"))
        arrayList.add(Mydata(6,"Aman","7739655582"))
        arrayList.add(Mydata(7,"Piyush","7739655582"))
        arrayList.add(Mydata(8,"Prince","7739655582"))
        arrayList.add(Mydata(9,"Aman","7739655582"))

        adapter=MybaseAdapter(this,arrayList)
        listView.adapter = adapter

    }
}