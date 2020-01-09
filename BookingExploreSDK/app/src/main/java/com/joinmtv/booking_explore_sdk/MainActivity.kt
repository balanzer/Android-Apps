package com.joinmtv.booking_explore_sdk


import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.adobe.marketing.mobile.*
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        /**
         * Adobe SDK - Add Initialization Code
         */
        MobileCore.setApplication(application);
        MobileCore.setLogLevel(LoggingMode.DEBUG);

        /**
         *  Adobe SDK - Add Initialization Code - Section Ends
         */

        /**
         * Adobe SDK - Register Extensions
         */

        try {

            MobileServices.registerExtension();
            Analytics.registerExtension();
            UserProfile.registerExtension();
            Identity.registerExtension();
            Lifecycle.registerExtension();
            Signal.registerExtension();

            MobileCore.start { MobileCore.configureWithAppID("da3424fdbc19/dd1344686da5/launch-acbaf05022bf-development") }

        } catch (exp: InvalidInitException) {
            Log.e("error", "InvalidInitException thrown : ${exp.message} ")
            LogUtil.error(exp)

        }
        /**
         * Adobe SDK - Register Extensions - Section Ends
         */


        setContentView(R.layout.activity_main)

        buttonAtlanta.setOnClickListener { view ->
            handleButtonClick("Atlanta, GA, USA")
        }
        buttonChennai.setOnClickListener { view ->
            handleButtonClick("Chennai, India")
        }
        buttonMiami.setOnClickListener { view ->
            handleButtonClick("Miami, FL, USA")
        }
        buttonNewYork.setOnClickListener { view ->
            handleButtonClick("New York, NY, USA")
        }
    }

    private fun handleButtonClick(destination: String = "") {
        LogUtil.log("List hotels button pressed")
        val listIntent = Intent(this, SearchResults::class.java)

        listIntent.putExtra("destination", destination);
        startActivity(listIntent)
    }
}
