package com.example.customlist

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView
import androidx.core.content.ContextCompat.startActivity

class MyAdapter(var mCtx:Context,var resources:Int,var items:List<Model>):
      ArrayAdapter<Model>(mCtx,resources,items){
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val layoutInflater:LayoutInflater=LayoutInflater.from(mCtx)
        val view:View=layoutInflater.inflate(resources,null)

        val imageView:ImageView=view.findViewById(R.id.image)
        val titleTextView:TextView=view.findViewById(R.id.textview1)
        val descriptionTextView:TextView=view.findViewById(R.id.textview2)
        val mItem:Model=items[position]
        imageView.setImageDrawable(mCtx.resources.getDrawable(mItem.img))
        titleTextView.text=mItem.title
        descriptionTextView.text=mItem.description

        return view
    }
}