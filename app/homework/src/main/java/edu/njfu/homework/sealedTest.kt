package edu.njfu.homework

import java.lang.Exception

sealed class Result()
class Success(val msg:String):Result()
class Failure(val error:Exception):Result()

fun getResultMsg(result: Result)=when(result){
    is Success->result.msg
    is Failure->result.error
}

fun main(){
    val s=Success("ok")
    val f=Failure(Exception("error"))
    println(getResultMsg(s))
    println(getResultMsg(f))
}