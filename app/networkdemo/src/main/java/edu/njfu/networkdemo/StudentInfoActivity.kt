package edu.njfu.networkdemo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.gson.Gson
import edu.njfu.networkdemo.adapter.StudentAdapter
import edu.njfu.networkdemo.service.StudentService
import edu.njfu.networkdemo.model.Student
import edu.njfu.networkdemo.utils.ServerCreator
import kotlinx.android.synthetic.main.activity_student_info.*

class StudentInfoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        var students:ArrayList<Student>;
        var students1:List<Student>?;

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_student_info)

        //1. 获取Service实例对象
        val studentService= ServerCreator.create<StudentService>();
//2. 调用实例对象方法，由于需要网络请求，需要继续调用enqueue方法
        studentService.getStudentData().enqueue(object: retrofit2.Callback<List<Student>> {
            override fun onFailure(call: retrofit2.Call<List<Student>>, t: Throwable) {
                t.printStackTrace()
            }
            //3. 请求成功！
            override fun onResponse(
                call: retrofit2.Call<List<Student>>,
                response: retrofit2.Response<List<Student>>
            ) {
                 students1 = response.body()
                if(students1!=null){
                        var adapter= StudentAdapter(this@StudentInfoActivity,R.layout.student_info_layout, students1!!)
                        studentList.adapter=adapter
                        studentList.setOnItemClickListener{
                            parent, view, position, id ->
                            val student= students1!![position]
                            var studentInfo=Gson().toJson(student);
                            var intent=Intent(this@StudentInfoActivity,StudentInformationActivity::class.java)
                            intent.putExtra("studentInformation",studentInfo)
                            startActivity(intent)

                        }
                }

            }

        })
    }
}