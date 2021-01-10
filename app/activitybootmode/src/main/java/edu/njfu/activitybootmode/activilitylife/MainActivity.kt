package edu.njfu.activitybootmode.activilitylife

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import edu.njfu.activitybootmode.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button1.setOnClickListener{
            val intent=Intent(this, MainActivity2::class.java)
            startActivity(intent)
        }
        button3.setOnClickListener {
            val intent=Intent(this, SingleTask::class.java)
            startActivity(intent)
        }
        button5.setOnClickListener {
            val userName="zhangsan"
            val password="123456"
            MainActivity3.startActivity(this,userName,password)
        }
    }

    override fun onStart() {
        super.onStart()
        Log.d("MainActivity","onStart()方法被调用")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("MainActivity","onReStart()方法被调用")
    }

    override fun onResume() {
        super.onResume()
        Log.d("MainActivity","onResume()方法被调用")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("MainActivity","onDestroy()方法被调用")
    }

    override fun onPause() {
        super.onPause()
        Log.d("MainActivity","onPause()方法被调用")
    }

    override fun onStop() {
        super.onStop()
        Log.d("MainActivity","onStop()方法被调用")
    }
}
