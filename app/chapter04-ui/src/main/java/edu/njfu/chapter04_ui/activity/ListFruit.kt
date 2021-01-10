package edu.njfu.chapter04_ui.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Adapter
import android.widget.AdapterView
import android.widget.Toast
import edu.njfu.chapter04_ui.R
import edu.njfu.chapter04_ui.adapter.fruitAdapter
import edu.njfu.chapter04_ui.model.fruit
import kotlinx.android.synthetic.main.activity_listfruit.*

class ListFruit : AppCompatActivity() {
    private val fruits=ArrayList<fruit>();
    private fun initFruit(){
        repeat(3){
            fruits.add(fruit("apple",R.drawable.apple_pic))
            fruits.add(fruit("banana",R.drawable.banana_pic))
            fruits.add(fruit("orange",R.drawable.orange_pic))
            fruits.add(fruit("watermelon",R.drawable.watermelon_pic))
            fruits.add(fruit("paer",R.drawable.pear_pic))
            fruits.add(fruit("garpe",R.drawable.grape_pic))
            fruits.add(fruit("pineapple",R.drawable.pineapple_pic))
            fruits.add(fruit("strawberry",R.drawable.strawberry_pic))
            fruits.add(fruit("cherry",R.drawable.cherry_pic))
            fruits.add(fruit("mango",R.drawable.mango_pic))
        }
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_listfruit)
        initFruit()
        var adapter = fruitAdapter(this, R.layout.fruit_item, fruits)
        listfruit.adapter=adapter
    }
}