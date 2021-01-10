package edu.njfu.chapter04_ui.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import edu.njfu.chapter04_ui.R
import kotlinx.android.synthetic.main.activity_imagedemo.*

class imagedemo : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_imagedemo)
        button2.setOnClickListener {
            val intent=Intent(this,register::class.java)
        }
    }
}