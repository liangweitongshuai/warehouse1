package edu.njfu.fragement

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.left_fragment.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button.setOnClickListener {
            replaceFragment(anotherRightFragment())
        }
    }
    private fun replaceFragment(fragment: Fragment){
        var supportFragmentManager = supportFragmentManager
        
        var beginTransaction = supportFragmentManager.beginTransaction()
        beginTransaction.replace(R.id.rightLayout,fragment)
        beginTransaction.commit()
    }
}
