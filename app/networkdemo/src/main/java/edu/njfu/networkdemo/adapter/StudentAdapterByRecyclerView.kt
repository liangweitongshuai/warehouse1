package edu.njfu.networkdemo.adapter

import android.view.LayoutInflater
import android.view.TextureView
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import edu.njfu.networkdemo.R
import edu.njfu.networkdemo.model.Student

class StudentAdapterByRecyclerView (val stduents:List<Student>):
        RecyclerView.Adapter<StudentAdapterByRecyclerView.ViewHolder>(){
    inner class ViewHolder(view: View):RecyclerView.ViewHolder(view){
        var studenName:TextView=view.findViewById(R.id.studenName)
        var studenNunber:TextView=view.findViewById(R.id.studentNumber)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
//        TODO("Not yet implemented")
        val view=LayoutInflater.from(parent.context)
            .inflate(R.layout.student_info_layout,parent,false)
        return ViewHolder(view)
    }


    override fun getItemCount(): Int{
        return stduents.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
//        TODO("Not yet implemented")
        val student=stduents[position]
        holder.studenName.text=student.stuName
        holder.studenNunber.text=student.stuNo
    }
}