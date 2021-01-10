package edu.njfu.myapplication

import android.text.style.LineHeightSpan
import edu.njfu.myapplication.Retangle.printArea

fun main(){
    var r=Retangle
    r.printArea(2,3)
    printArea(2,3)
}

fun print(str:String):Unit= println(str)

object Retangle{
    fun printArea(width:Int,height:Int):Unit{
        fun calculateArea(width:Int,height:Int):Int=width*height
        var area=calculateArea(width,height)
        println("The Area is $area")
    }
}
fun foo(k:Int):Unit{
    require(k>10,{"K should be greater than 10"});
    print("the k'value is $k");
}