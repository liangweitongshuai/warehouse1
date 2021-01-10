package edu.njfu.activitybootmode.activilitylife

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity

object ActivityController:AppCompatActivity(){
    private val activities=ArrayList<Activity>();
    fun addActivity(activity:Activity):Unit{
        activities.add(activity)
    }
    fun removeActivity(activity: Activity):Boolean= activities.remove(activity)
    fun finishAll(){
        for(activity in activities){
            if(!activity.isFinishing){
                activity.finish()
            }
        }
        activities.clear()
    }
}