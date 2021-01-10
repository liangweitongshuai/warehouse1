package edu.njfu.chapter04_ui.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import android.widget.Toast
import com.google.gson.Gson
import edu.njfu.chapter04_ui.R
import edu.njfu.chapter04_ui.model.User
import edu.njfu.chapter04_ui.model.student2
import kotlinx.android.synthetic.main.activity_login.*
import kotlinx.android.synthetic.main.activity_register.*
import kotlinx.android.synthetic.main.activity_registeract.*

class RegisterAct : AppCompatActivity(), View.OnClickListener {
    private val Gender= listOf("男","女")
    private val Classes= listOf("1808041","1808042")
    private val Department= listOf("软件工程","软件技术","计算机应用","计算机科学")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registeract)
        var adapter= ArrayAdapter(this,android.R.layout.simple_selectable_list_item,Gender)
        adapter.setDropDownViewResource(android.R.layout.simple_expandable_list_item_1)
        gender.setAdapter(adapter)
        var adapter2=ArrayAdapter(this,android.R.layout.simple_selectable_list_item,Classes)
        adapter2.setDropDownViewResource(android.R.layout.simple_expandable_list_item_1)
        classes.setAdapter(adapter2)
        var adapter3=ArrayAdapter(this,android.R.layout.simple_selectable_list_item,Department)
        adapter3.setDropDownViewResource(android.R.layout.simple_expandable_list_item_1)
        department.setAdapter(adapter3)
        button4.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when(v?.id){
            R.id.button4-> {
                val stuno=stuno.text.toString()
                val stuname=stuname.text.toString()
                val gender=gender.selectedItem.toString()
                val classes=classes.selectedItem.toString()
                val department=department.selectedItem.toString()
                val dornno=dornno.text.toString()

                val student= student2(stuno,stuname,gender,classes,department,dornno)
                val gson= Gson()
                val toJson=gson.toJson(student)
                Toast.makeText(this,toJson, Toast.LENGTH_LONG).show()
            }
        }
    }
}