package com.example.customlist

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.Button
import android.widget.ListView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btn=findViewById<Button>(R.id.btn1)
        btn.setOnClickListener {
            val intent = Intent(this, CustomListBaseAdapter::class.java)
            startActivity(intent)
            finish()
        }
        var listView=findViewById<ListView>(R.id.listview)
        var list= mutableListOf<Model>()
        list.add(Model("Piyush Kumar","Description",R.drawable.pieee))
        list.add(Model("Raushan patel","Description",R.drawable.piee))
        list.add(Model("Rohan Kumar","Description",R.drawable.piee))
        list.add(Model("Vimal Kumar","Description",R.drawable.piee))
        list.add(Model("Prince Kumar","Description",R.drawable.piee))
        list.add(Model("Piyush Kumar","Description",R.drawable.piee))
        list.add(Model("Raushan patel","Description",R.drawable.piee))
        list.add(Model("Rohan Kumar","Description",R.drawable.piee))
        list.add(Model("Vimal Kumar","Description",R.drawable.piee))
        list.add(Model("Prince Kumar","Description",R.drawable.piee))

        listView.adapter=MyAdapter(this,R.layout.listviewrow,list)
        listView.setOnItemClickListener{ parent: AdapterView<*>, view: View, position:Int, id:Long->

            if(position==0){
                Toast.makeText(this, "Piyush Kumar", Toast.LENGTH_SHORT).show()
            }
            else{
                if(position==2){
                    Toast.makeText(this, "Raushan Patel", Toast.LENGTH_SHORT).show()
                }
                else{
                    if(position==3){
                        Toast.makeText(this, "Piyush Kumar", Toast.LENGTH_SHORT).show()
                    }
                    else{
                        Toast.makeText(this, "Piyush Kumar", Toast.LENGTH_SHORT).show()
                    }
                }
            }
            val selectedItem = list[position]
            val intent = Intent(this, Display_photo::class.java).apply {
                putExtra("name", selectedItem.title)
                putExtra("description", selectedItem.description)
                putExtra("imageResId", selectedItem.img)
            }
            startActivity(intent)
        }

    }
}