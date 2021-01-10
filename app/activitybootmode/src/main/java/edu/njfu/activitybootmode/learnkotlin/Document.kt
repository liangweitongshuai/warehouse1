package edu.njfu.activitybootmode.learnkotlin

import java.io.InputStream
import java.io.OutputStream

interface Document {
    /*
    javazhong  中interface是不允许有attribute
     */
    val version:String
    val Size:Long;
    //定义属性，带有get方法
    val title:String
        get() = "No Name"
    //定义方法
    fun getDescription():String{
        return "this is a test!"
    }
    //声明方法
    fun saveDoc(out: OutputStream)
    fun loadDoc(input: InputStream)
}