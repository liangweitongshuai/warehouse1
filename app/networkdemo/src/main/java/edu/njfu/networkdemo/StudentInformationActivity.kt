package edu.njfu.networkdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.gson.Gson
import edu.njfu.networkdemo.adapter.InfoAdapter
import edu.njfu.networkdemo.model.Info
import edu.njfu.networkdemo.model.Student
import kotlinx.android.synthetic.main.activity_student_information.*

class StudentInformationActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_student_information)
        var info=intent.getStringExtra("studentInformation")
        var student=Gson().fromJson(info, Student::class.java)
        var adapter= InfoAdapter(this,R.layout.text_layout,initInfo(student))
        studentInfoList.adapter=adapter

    }
    fun initInfo(student: Student):ArrayList<Info>{
        var list=ArrayList<Info>()
        list.add(Info("姓名",student.stuName))
        list.add(Info("学号",student.stuNo))
        list.add(Info("班级",student.classes))
        list.add(Info("性别",student.gender))
        list.add(Info("专业",student.department))
        list.add(Info("宿舍",student.dormNo))
        list.add(Info("照片",student.photoPath))
         return list
    }

}