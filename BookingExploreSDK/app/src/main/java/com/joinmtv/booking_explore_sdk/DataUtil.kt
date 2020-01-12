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

            cData.put("&&events", "event1");
            cData.put("&&products", ";Running Shoes;1;69.95;event1=5.5;eVar1=Merchandising,;Running Socks;10;29.99");
            cData.put("myapp.purchase", "1");
            cData.put("myapp.purchaseid", "1234567890");



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


