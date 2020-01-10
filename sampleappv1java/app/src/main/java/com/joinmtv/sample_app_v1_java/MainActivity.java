package com.joinmtv.sample_app_v1_java;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;


import com.adobe.marketing.mobile.AdobeCallback;
import com.adobe.marketing.mobile.Analytics;
import com.adobe.marketing.mobile.Identity;
import com.adobe.marketing.mobile.InvalidInitException;
import com.adobe.marketing.mobile.Lifecycle;
import com.adobe.marketing.mobile.LoggingMode;
import com.adobe.marketing.mobile.MobileCore;
import com.adobe.marketing.mobile.Signal;
import com.adobe.marketing.mobile.UserProfile;
import java.util.HashMap;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onResume() {
        super.onResume();

        MobileCore.setApplication(getApplication());
        MobileCore.lifecycleStart(null);


        HashMap cData = new HashMap<String, String>();
        cData.put("cd.section", "Bus Booking");
        cData.put("cd.subSection", "Booking");
        cData.put("cd.conversionType", "Landing");

        MobileCore.trackState("MTV : Booking Screen", cData);


        HashMap<String, String> contextData = new HashMap<String, String>();
        contextData.put("key", "value");
        MobileCore.trackAction("mtv : action taken", contextData);


    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

       MobileCore.setApplication(this.getApplication());
       MobileCore.setLogLevel(LoggingMode.DEBUG);


        setContentView(R.layout.activity_main);


        try{


            Analytics.registerExtension();
            UserProfile.registerExtension();
            Identity.registerExtension();
            Lifecycle.registerExtension();
            Signal.registerExtension();
            MobileCore.start(new AdobeCallback () {
                @Override
                public void call(Object o) {
                    MobileCore.configureWithAppID("da3424fdbc19/32e29cb9b726/launch-6d69b26751df-development");
                }
            });


            HashMap<String, String> contextData = new HashMap<String, String>();
            contextData.put("key", "value");
            MobileCore.trackAction("mtv : app ready", contextData);


        }catch(Exception exp){
            Log.e("error", "Exception " + exp);
        }

    }
}
