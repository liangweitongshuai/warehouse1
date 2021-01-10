package edu.njfu.activitybootmode.activilitylife

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import edu.njfu.activitybootmode.R
import kotlinx.android.synthetic.main.activity_main3.*

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)
        button6.setOnClickListener {
            var userName=intent.getStringArrayExtra("userName")
            var password=intent.getStringArrayExtra("password")
            Toast.makeText(this,"${userName},${password}",Toast.LENGTH_LONG).show()
        }
    }
    companion object{
        fun startActivity(context:Context,data1:String,data2:String){
            val intent=Intent(context,MainActivity3::class.java)
            intent.putExtra("userName",data1)
            intent.putExtra("password",data2)
            context.startActivity(intent)
        }
    }
}