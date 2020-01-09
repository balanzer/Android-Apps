package com.joinmtv.booking_explore_sdk

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.joinmtv.booking_explore_sdk.analytics.HandleAnalytics

import kotlinx.android.synthetic.main.activity_search_results.*

class SearchResults : AppCompatActivity() {


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
            "Booking : List Hotels",
            "listhotels",
            "resume",
            DataUtil.getDataForState("listhotels")
        );

        /**
         * Adobe SDK - handle state changes - Section ends
         */


    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_search_results)

        val destinationSelected = intent.extras!!.getString("destination");

        LogUtil.log("List hotels destination : ${destinationSelected}")
        textView3.setText(destinationSelected);


        hotelBook1.setOnClickListener { view ->
            handleBookButtonClick("hotel1")
        }

        hoteldetailsbutton1.setOnClickListener { view ->
            handleDetailsButtonClick("hotel1")
        }


    }

    private fun handleBookButtonClick(hotel: String = "") {


        /**
         * Adobe SDK - handle action changes - analytics
         */


        HandleAnalytics.handleAction(
            "Book Now Button clicked",
            DataUtil.getDataForAction("listhotels")
        )
        /**
         * Adobe SDK - handle action changes - Section ends
         */


        LogUtil.log("Book Now button pressed")
        val intent = Intent(this, BookNow::class.java)

        intent.putExtra("hotel", hotel);
        startActivity(intent)
    }

    private fun handleDetailsButtonClick(hotel: String = "") {

        /**
         * Adobe SDK - handle action changes - analytics
         */


        HandleAnalytics.handleAction(
            "Hotel Details Button clicked",
            DataUtil.getDataForAction("listhotels")
        )
        /**
         * Adobe SDK - handle action changes - Section ends
         */


        LogUtil.log("Hotel Details button pressed")
        val intent = Intent(this, HotelDetails::class.java)

        intent.putExtra("hotel", hotel);
        startActivity(intent)
    }
}