package edu.njfu.myapplicatio

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button.setOnClickListener{
            val uri=Uri.parse("http://www.baidu.com")
            val intent=Intent(Intent.ACTION_VIEW,uri)
            startActivity(intent)
        }
    }
}