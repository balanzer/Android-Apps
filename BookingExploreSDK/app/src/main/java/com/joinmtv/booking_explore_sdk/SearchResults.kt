package com.joinmtv.booking_explore_sdk

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

    }
}
