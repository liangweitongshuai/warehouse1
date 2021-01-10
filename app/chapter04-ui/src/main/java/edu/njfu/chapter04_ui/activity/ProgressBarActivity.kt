package edu.njfu.chapter04_ui.activity

import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import edu.njfu.chapter04_ui.R
import kotlinx.android.synthetic.main.activity_progress_bar.*

class ProgressBarActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_progress_bar)
        button5.setOnClickListener {
            if(progressBar.visibility===View.VISIBLE){
                progressBar.visibility=View.GONE
            }else{
                progressBar.visibility=View.VISIBLE
            }
        }
        button7.setOnClickListener {
            progressBar2.progress+=10
        }
        button6.setOnClickListener {
            progressBar2.progress-=10
        }
        button8.setOnClickListener {
            val context:ProgressBarActivity=this
            var block:AlertDialog.Builder.()->Unit= {
                setTitle("提示信息")
                setMessage("hello world")
                setCancelable(false)
                setPositiveButton("确定", { dialog: DialogInterface?, which: Int ->
                    Toast.makeText(context, "ok", Toast.LENGTH_LONG).show()
                    Log.d("ok", "ok")
                })
                setNegativeButton("取消"){
                    dialog: DialogInterface?, which: Int ->
                    Toast.makeText(context, "cancel", Toast.LENGTH_LONG).show()
                    Log.d("cancel", "canceel")
                }
            }
            var dialog:AlertDialog.Builder = AlertDialog.Builder(context).apply(block)
            dialog.show()
        }
    }
}