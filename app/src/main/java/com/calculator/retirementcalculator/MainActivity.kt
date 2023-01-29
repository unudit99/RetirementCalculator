package com.calculator.retirementcalculator

import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.microsoft.appcenter.AppCenter
import com.microsoft.appcenter.analytics.Analytics
import com.microsoft.appcenter.crashes.Crashes
import kotlinx.coroutines.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //this line of code is enogh to get crash analaytics
        AppCenter.start(application,"71559eab-d953-4c32-88dd-74bb8cc12664",Analytics::class.java,Crashes::class.java)
       /* val bird= GlobalScope.launch(Dispatchers.Default){
            repeat(5){
                Log.d("bird","Bird api process")
                delay(1000L)
            }
        }
        val human= GlobalScope.launch(Dispatchers.Default){
            repeat(5){
                Log.d("bird","Human api process")
                delay(1000L)
            }
        }

        runBlocking {
            bird.join()
            human.join()
            Log.d("bird","All api cmplete")

        }*/




    }

    companion object {
        fun HelloClick(view: View) {
            //throw Exception("throw exception")
            Crashes.generateTestCrash()
        }
    }
}