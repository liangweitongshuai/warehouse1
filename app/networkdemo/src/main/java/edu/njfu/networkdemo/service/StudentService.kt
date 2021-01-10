package edu.njfu.networkdemo.service

import edu.njfu.networkdemo.model.ResultVO
import edu.njfu.networkdemo.model.Student
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Query

interface StudentService {
    @POST("listStudents")
    fun getStudentData(): Call<List<Student>>
    @POST("userLogin")
    fun getUserInfo(@Query("username") username:String,@Query("password") password :String):Call<ResultVO>
}