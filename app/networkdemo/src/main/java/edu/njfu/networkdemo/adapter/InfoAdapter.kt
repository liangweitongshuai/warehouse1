package edu.njfu.networkdemo.adapter

import android.app.Activity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import android.widget.ArrayAdapter
import android.widget.TextView
import edu.njfu.networkdemo.R
import edu.njfu.networkdemo.model.Info

import kotlinx.android.synthetic.main.text_layout.view.*
import kotlin.math.acos

class InfoAdapter (activity: Activity,val resourceId:Int,data:List<Info>):ArrayAdapter<Info>(activity,resourceId,data){
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        var view =LayoutInflater.from(context).inflate(resourceId,parent,false)
        var type= view.findViewById<TextView>(R.id.textType)
        var value=view.findViewById<TextView>(R.id.textValue)
        var info=getItem(position)
        if(info!=null){
            type.text=info.type+":"
            value.text=info.value
        }
        return view;
    }
}