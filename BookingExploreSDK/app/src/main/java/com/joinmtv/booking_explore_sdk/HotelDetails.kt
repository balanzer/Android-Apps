package com.joinmtv.booking_explore_sdk

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_hotel_details.*

class HotelDetails : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hotel_details)


        val hotel = intent.extras!!.getString("hotel");

        LogUtil.log("List hotels details : ${hotel}")

        hotelText.setText(hotel)
    }
}
