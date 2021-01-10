package edu.njfu.networkdemo

import android.app.AlertDialog
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import edu.njfu.networkdemo.model.ResultVO
import edu.njfu.networkdemo.service.StudentService
import edu.njfu.networkdemo.utils.ServerCreator
import kotlinx.android.synthetic.main.activity_main.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var intentOK=Intent(this,StudentInfoActivity::class.java)
        var intentError=Intent(this,LoginActivity::class.java)
        loginBtn.setOnClickListener{
            val studentService= ServerCreator.create(StudentService::class.java)
            studentService.getUserInfo(loginAccount.text.toString(),loginPassword.text.toString()).enqueue(object :
                Callback<ResultVO>{
                override fun onFailure(call: Call<ResultVO>, t: Throwable) {
                    TODO("Not yet implemented")
                }

                override fun onResponse(
                    call: Call<ResultVO>,
                    response: Response<ResultVO>
                ) {
                    var resultVO=response.body()
                    if(resultVO?.result.toString()=="ok"){
                        startActivity(intentOK)
                    }else{
                        AlertDialog.Builder(this@MainActivity).apply {
                            setTitle("登录失败")
                            setMessage("账号密码错误")
                            setCancelable(false)
                            setPositiveButton("ok"){
                                dialog, which ->
                            }
                            show()
                        }

                    }
                }
            })

        }
    }
}

