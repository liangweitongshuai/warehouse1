package edu.njfu.chapter04_ui.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import com.google.gson.Gson
import edu.njfu.chapter04_ui.R
import edu.njfu.chapter04_ui.model.User
import kotlinx.android.synthetic.main.activity_login.*

class login : AppCompatActivity(),View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        btsubmit.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when(v?.id){
            R.id.btsubmit-> {
                val userName=ev_username.text.toString()
                val password=ev_password.text.toString()

                val user= User(userName,password)
                val gson=Gson()
                val toJson=gson.toJson(user)

                var fromJson = gson.fromJson<User>(toJson, User::class.java)
                Toast.makeText(this,toJson,Toast.LENGTH_LONG).show()
            }
        }
    }
}