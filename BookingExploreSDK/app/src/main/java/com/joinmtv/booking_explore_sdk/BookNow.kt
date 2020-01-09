package com.joinmtv.booking_explore_sdk

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_book_now.*

class BookNow : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_book_now)


        val hotel = intent.extras!!.getString("hotel");

        LogUtil.log("book now hotel : ${hotel}")

        bookNowHotel.setText(hotel)
    }
}
