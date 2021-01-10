package edu.njfu.activitybootmode.learnkotlin

fun main(){
    /*
    *val variable:(type,,,)->Type={
    *   v1,v2,,,->
    * }
    * (type1,,,,)->type3相当于类型
    * =右边相当于lambda表达式的实现{}
    * v1,v1相当于形参
    * ->相当于函数体
    * */
    val sumN:(Int)->Int={
        n:Int->
        var sum:Int=0
        for (i in 1..n){
            sum+=i
        }
        //lambda表达式最后一行就是返回值
        sum
    }
    println(sumN(100))

    val max1:(Int,Int)->Int={
        n:Int,m:Int->
        if(n>m){
            n
        }else{
            m
        }
    }
    println(max1(3,4))

    /*
    * lambda第二种形式
    * val:varible={n1:type,n2:type->
    * }
    * */
    var sumN2={
        n:Int->
        var sum=0
        for (i in 1..n){
            sum+=i
        }
        sum
    }
    println(sumN2(100))

    var max2={
        n:Int,m:Int->
        if (n>m){
            n
        }else{
            m
        }
    }
    println(max2(5,6))
}