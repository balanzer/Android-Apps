package com.joinmtv.booking_explore_sdk


class DataUtil {


    companion object {
        val logTag: String = "mtv-logs"
        fun getDataForState(view: String = ""): HashMap<String, String> {
            val cData = HashMap<String, String>()
            cData["mobileSDK"] = "true"
            cData["cd.section"] = view.toUpperCase();
            cData["cd.hotelCode"] = "ATLCP"
            cData["cd.searchText"] = "Atlanta, GA, USA"
            cData["cd.currencyCode"] = "USD"
            cData["cd.rateCode"] = "6CBARC"


            LogUtil.log("trackState -> Data For ${view} : ${cData}")

            return cData;

        }

        fun getDataForAction(view: String = "", action: String = ""): HashMap<String, String> {

            val cData = HashMap<String, String>()
            cData["cd.pageName"] = view.toUpperCase();

            LogUtil.log("trackAction -> Data For ${view}, action : ${action} : ${cData}")
            return cData;
        }
    }

}


