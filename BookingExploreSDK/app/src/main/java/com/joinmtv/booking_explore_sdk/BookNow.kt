package com.joinmtv.booking_explore_sdk

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.joinmtv.booking_explore_sdk.analytics.HandleAnalytics
import kotlinx.android.synthetic.main.activity_book_now.*

class BookNow : AppCompatActivity() {


    override fun onPause() {
        super.onPause()

        /**
         * Adobe SDK - handle lifecyle events
         */
        HandleAnalytics.handleLifeCyleEvents(application, "pause");

        /**
         * Adobe SDK - handle lifecyle events - Section Ends
         */
    }


    override fun onResume() {
        super.onResume()

        /**
         * Adobe SDK - handle lifecyle events
         */
        HandleAnalytics.handleLifeCyleEvents(application, "resume");

        /**
         * Adobe SDK - handle lifecyle events - Section Ends
         */


        /**
         * Adobe SDK - handle visitor
         */

        /**
         * rewardsClubNumber & user login status has to be dynamic - remove hard coding later
         */
        HandleAnalytics.handleVisitor(152921272, "implicit")
        /**
         * Adobe SDK - handle visitor - Section Ends
         */

        /**
         * Adobe SDK - handle state changes - analytics
         */

        HandleAnalytics.handleStateChanges(
            "Booking : BookNow",
            "checkout",
            "resume",
            DataUtil.getDataForState("checkout")
        );

        /**
         * Adobe SDK - handle state changes - Section ends
         */


    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_book_now)


        val hotel = intent.extras!!.getString("hotel");

        LogUtil.log("book now hotel : ${hotel}")

        bookNowHotel.setText(hotel)
    }
}
