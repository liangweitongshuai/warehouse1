package edu.njfu.chapter04_ui.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import edu.njfu.chapter04_ui.R
import kotlinx.android.synthetic.main.activity_register.*

class register : AppCompatActivity() {
    private val sex= listOf("男","女")
    private val major= listOf("软件工程","软件技术","计算机应用","计算机科学")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
        var adapter=ArrayAdapter(this,android.R.layout.simple_selectable_list_item,sex)
        adapter.setDropDownViewResource(android.R.layout.simple_expandable_list_item_1)
        spinner.setAdapter(adapter)
        var adapter2=ArrayAdapter(this,android.R.layout.simple_selectable_list_item,major)
        adapter2.setDropDownViewResource(android.R.layout.simple_expandable_list_item_1)
        spinner3.setAdapter(adapter2)
    }
}