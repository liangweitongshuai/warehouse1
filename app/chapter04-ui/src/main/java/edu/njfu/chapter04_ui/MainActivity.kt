package edu.njfu.chapter04_ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ProgressBar
import edu.njfu.chapter04_ui.activity.*
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(),View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button3.setOnClickListener(this)
    }

    override fun onClick(v: View?){
        when(v?.id){
            R.id.button3->{
                val intent=Intent(this,ListFruit::class.java)
                startActivity(intent)
            }
        }
    }
}
