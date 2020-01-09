package com.example.booking

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.adobe.marketing.mobile.*


class MainActivity : AppCompatActivity() {

    override fun onRestart() {
        super.onRestart()

        MobileCore.setApplication(application)
        MobileCore.setLogLevel(LoggingMode.DEBUG);
        MobileCore.lifecycleStart(null);

        LogUtil.log("MobileCore Basic setup done - onRestart")

        triggerAnalytics()

    }

    override fun onResume() {
        super.onResume()

        MobileCore.setApplication(application)
        MobileCore.setLogLevel(LoggingMode.DEBUG);
        MobileCore.lifecycleStart(null);
        LogUtil.log("MobileCore Basic setup done - onResume")

        //  MobileCore.trackState("Home Page MTV", null);


        triggerAnalytics()


    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        MobileCore.setApplication(application)
        MobileCore.setLogLevel(LoggingMode.DEBUG);
        MobileCore.lifecycleStart(null);

        LogUtil.log("MobileCore Basic setup done")

        setContentView(R.layout.activity_main)
        LogUtil.log("MainActivity->onCreate - completed")


        try {
            LogUtil.log("Mobile register extensions - start")

            Analytics.registerExtension()
            UserProfile.registerExtension()
            Identity.registerExtension()
            Lifecycle.registerExtension()
            Signal.registerExtension()
            MobileCore.start { MobileCore.configureWithAppID("da3424fdbc19/dd1344686da5/launch-acbaf05022bf-development") }
            LogUtil.log("Mobile register extensions - completed")


        } catch (exp: InvalidInitException) {
            LogUtil.log("[Error] message : ${exp.message}")
        }


        triggerAnalytics()

    }

    private fun triggerAnalytics() {

        val cData = HashMap<String, String>();
        cData["cd.section"] = "Booking"
        cData["cd.subSection"] = "Home"
        cData["ensightentriggered"] = "true"
        cData["app_platform"] = "Pixel 3 API 29"
        cData["app_subsection"] = "HOME MTV Load"




        MobileCore.trackState("State Mobile Activity Loaded", null)

        // MobileCore.trackState("Home Page MTV", cData)
        MobileCore.trackAction("Action Mobile Activity Home Loaded", null);
    }
}
