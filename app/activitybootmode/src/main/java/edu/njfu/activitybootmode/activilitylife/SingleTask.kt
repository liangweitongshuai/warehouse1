package edu.njfu.activitybootmode.activilitylife

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import edu.njfu.activitybootmode.R
import kotlinx.android.synthetic.main.activity_single_task.*

class SingleTask : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_single_task)
        button.setOnClickListener{
            val intent=Intent(this,
                MainActivity::class.java)
            startActivity(intent)
        }
        button4.setOnClickListener{
            val intent=Intent(this,
                SingleTask::class.java)
            startActivity(intent)
        }
    }
}