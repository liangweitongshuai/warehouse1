package edu.njfu.activitybootmode.learnkotlin

import java.lang.StringBuilder

fun main(){
    val fruits= listOf("apple","pear","grape","banana","watermelon")
    val strBuilder=StringBuilder()
    strBuilder.append("水果列表：")
    for(fruit in fruits){
        strBuilder.append(fruit).append("\n");
    }
    strBuilder.append("开始吃水果")
    println(strBuilder.toString())
}