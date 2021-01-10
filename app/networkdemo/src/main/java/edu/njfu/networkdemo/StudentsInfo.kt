package edu.njfu.networkdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import edu.njfu.networkdemo.adapter.StudentAdapterByRecyclerView
import edu.njfu.networkdemo.service.StudentService
import edu.njfu.networkdemo.model.Student
import edu.njfu.networkdemo.utils.ServerCreator
import kotlinx.android.synthetic.main.activity_students_info.*
import retrofit2.Call
import retrofit2.Response

class StudentsInfo : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_students_info)
        val students:List<Student>
        val serviceCreator= ServerCreator.create<StudentService>()
        serviceCreator.getStudentData().enqueue(object :retrofit2.Callback<List<Student>>{
            override fun onFailure(call: Call<List<Student>>, t: Throwable) {
                TODO("Not yet implemented")
            }

            override fun onResponse(call: Call<List<Student>>, response: Response<List<Student>>) {
                val students=response.body()
                val layoutManager=LinearLayoutManager(this@StudentsInfo)
                recyclerView.layoutManager=layoutManager
                val adapter= students?.let { StudentAdapterByRecyclerView(it) }
                recyclerView.adapter=adapter

            }
        })
    }
}