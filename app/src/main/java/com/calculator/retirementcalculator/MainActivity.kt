package com.calculator.retirementcalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.microsoft.appcenter.AppCenter
import com.microsoft.appcenter.analytics.Analytics
import com.microsoft.appcenter.crashes.Crashes

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //this line of code is enogh to get crash analaytics
        AppCenter.start(application,"71559eab-d953-4c32-88dd-74bb8cc12664",Analytics::class.java,Crashes::class.java)
    }
}