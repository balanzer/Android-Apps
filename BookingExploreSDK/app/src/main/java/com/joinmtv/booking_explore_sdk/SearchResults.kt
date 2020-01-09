package com.joinmtv.booking_explore_sdk

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_search_results.*

class SearchResults : AppCompatActivity() {

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
        LogUtil.log("Book Now button pressed")
        val intent = Intent(this, BookNow::class.java)

        intent.putExtra("hotel", hotel);
        startActivity(intent)
    }

    private fun handleDetailsButtonClick(hotel: String = "") {
        LogUtil.log("Hotel Details button pressed")
        val intent = Intent(this, HotelDetails::class.java)

        intent.putExtra("hotel", hotel);
        startActivity(intent)
    }
}