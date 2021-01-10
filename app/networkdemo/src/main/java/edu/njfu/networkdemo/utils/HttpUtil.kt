package edu.njfu.networkdemo.utils

import android.util.Log
import okhttp3.Call
import okhttp3.FormBody
import okhttp3.OkHttpClient
import okhttp3.Request
import javax.security.auth.callback.Callback

object HttpUtil{
    //无参函数
    fun sendOKHttpRequest(url:String, callback: okhttp3.Callback){
        val client=OkHttpClient()
        val request=Request.Builder()
            .url(url)
            .build()
        client.newCall(request).enqueue(callback)
    }
    //有参函数
    fun sendOKHttpRequest(
        url:String,
        data:Map<String,String>,
        callback: okhttp3.Callback
    ){
        val client=OkHttpClient()
        val requestBody=FormBody.Builder()
        for(key in data.keys) {
            requestBody.add(key,data.get(key).toString())
        }
        println( requestBody.build().toString());

        val request=Request.Builder()
            .url(url)
            .post(requestBody.build())
            .build()
        println(request.toString());

        client.newCall(request).enqueue(callback)

    }
}

