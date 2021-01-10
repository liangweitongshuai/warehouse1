package edu.njfu.networkdemo.adapter

import android.app.Activity
import android.os.Parcel
import android.os.Parcelable
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView
import edu.njfu.networkdemo.R
import edu.njfu.networkdemo.model.Student

class StudentAdapter(activity: Activity,val resourecId:Int,data:List<Student>):
    ArrayAdapter<Student>(activity,resourecId,data){

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        var view=LayoutInflater.from(context).inflate(resourecId,parent,false)
//        var studentImage:ImageView=view.findViewById(R.id.studentImage)
        var studentName:TextView=view.findViewById(R.id.studenName)
        var studentNumber:TextView=view.findViewById(R.id.studentNumber)
        val student=getItem(position)
        if(student!=null){
            studentName.text=student.stuName
            studentNumber.text=student.stuNo
         }
        return view
}}