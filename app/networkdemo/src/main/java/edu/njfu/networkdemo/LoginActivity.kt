package edu.njfu.networkdemo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import com.google.gson.Gson
import edu.njfu.networkdemo.model.ResultVO
import edu.njfu.networkdemo.utils.HttpUtil
import kotlinx.android.synthetic.main.activity_main.*
import okhttp3.Call
import okhttp3.Response
import java.io.IOException
import javax.security.auth.callback.Callback

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var intentOK=Intent(this,StudentInfoActivity::class.java)
        var intentError=Intent(this,LoginActivity::class.java)
        var judge="-1";
        loginBtn.setOnClickListener{
            var userMap= HashMap<String,String>()
            userMap.put("username",loginAccount.text.toString())
            userMap.put("password",loginPassword.text.toString())
            Log.d("msg",loginAccount.text.toString()+"   "+loginPassword.text.toString()  )

            HttpUtil.sendOKHttpRequest("http://106.15.192.167:8080/userLogin",userMap,object :okhttp3.Callback{//http://10.15.47.16:8080/studentadminsystem_war_exploded/userLogin2
                override fun onFailure(call: Call, e: IOException) {
                    e.printStackTrace()
                }

                override fun onResponse(call: Call, response: Response) {
                    val responseData=response.body()?.string();
                    val resultOK= Gson().fromJson(responseData, ResultVO::class.java)
                    Log.d("msg",resultOK.msg+"   "+resultOK.result  )
                    if(resultOK.result.toString()=="ok"){
                        startActivity(intentOK);
//                        judge="1";
                    }else{
                        startActivity(intentError)
                    }
                }
            })
        }
    }
}





