package com.example.booking

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.adobe.marketing.mobile.*



class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        MobileCore.setApplication(application)
        MobileCore.setLogLevel(LoggingMode.DEBUG);
        LogUtil.log("MobileCore Basic setup done")

        setContentView(R.layout.activity_main)
        LogUtil.log("MainActivity->onCreate - completed")


        try{
            LogUtil.log("Mobile register extensions - start")

            Analytics.registerExtension()
            UserProfile.registerExtension()
            Identity.registerExtension()
            Lifecycle.registerExtension()
            Signal.registerExtension()
            MobileCore.start { MobileCore.configureWithAppID("da3424fdbc19/dd1344686da5/launch-acbaf05022bf-development") }
            LogUtil.log("Mobile register extensions - completed")

        }catch (exp : InvalidInitException){
            LogUtil.log("[Error] message : ${exp.message}")
        }
    }
}
