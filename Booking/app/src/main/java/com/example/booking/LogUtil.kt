package com.example.booking

import android.util.Log

class LogUtil {


    companion object {
        val logTag:String = "mtv-analytics"
        fun log(message : String) {
           Log.d(logTag, message);
        }
    }

}
