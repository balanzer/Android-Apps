package com.joinmtv.booking_explore_sdk

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonAtlanta.setOnClickListener { view ->
            handleButtonClick("Atlanta, GA, USA")
        }
    }

    private fun handleButtonClick(destination: String = "") {
        LogUtil.log("List hotels button pressed")
        val listIntent = Intent(this, SearchResults::class.java)

        listIntent.putExtra("destination", destination);
        startActivity(listIntent)
    }
}
