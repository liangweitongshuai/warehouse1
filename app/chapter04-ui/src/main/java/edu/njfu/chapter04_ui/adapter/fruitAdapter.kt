package edu.njfu.chapter04_ui.adapter

import android.app.Activity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView
import edu.njfu.chapter04_ui.R
import edu.njfu.chapter04_ui.model.fruit

class fruitAdapter(activity:Activity,val resourceId: Int,data:List<fruit>):
    ArrayAdapter<fruit>(activity,resourceId,data){

    inner class ViewHolder(val fruitImage:ImageView,val fruitName:TextView)

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val view:View
        val viewHolder:ViewHolder
        if (convertView==null){
            view= LayoutInflater.from(context).inflate(resourceId, parent, false)
            var fruitImage:ImageView=view.findViewById(R.id.fruitImage)
            var fruitName: TextView=view.findViewById(R.id.fruitName)
            viewHolder=ViewHolder(fruitImage,fruitName)
            view.tag=viewHolder
        }else{
            view=convertView
            viewHolder=view.tag as ViewHolder
        }

        var fruit:fruit? =getItem(position)
        if(fruit!=null){
            viewHolder.fruitImage.setImageResource(fruit.imageId)
            viewHolder.fruitName.text=fruit.name
        }
        return view;
    }
}