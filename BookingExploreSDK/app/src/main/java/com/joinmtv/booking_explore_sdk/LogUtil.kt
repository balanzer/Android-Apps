package com.joinmtv.booking_explore_sdk

import android.util.Log

class LogUtil {


    companion object {
        val logTag: String = "mtv-logs"
        fun log(message: String) {
            Log.i(logTag, message);
        }
    }

}
