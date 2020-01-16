package com.joinmtv.booking_explore_sdk


class DataUtil {


    companion object {
        val logTag: String = "mtv-logs"
        fun getDataForState(view: String = ""): HashMap<String, String> {
            val cData = HashMap<String, String>()
            cData["mobileSDK"] = "true"
            cData["page.name"] = view.toUpperCase();
            cData["page.language"] = "en";
            cData["page.brand"] = "6c";
            cData["page.section"] = view.toUpperCase();
            cData["booking.hotelCode"] = "ATLCP"
            cData["search.destination"] = "Atlanta, GA, USA"
            cData["booking.currencyCode"] = "INR"
            cData["booking.selectedRateCodes"] = "6CBARC"

            cData["booking.confirmationNumber"] = "123121212";
            cData["booking.bookingTotalUSD"] = "69.95";
            cData["booking.bookingTotal"] = "4000";
            cData["booking.tax"] = "650";
            cData["booking.unitPrice"] = "3500";
            cData["booking.taxUSD"] = "9.95";
            cData["booking.unitPriceUSD"] = "60.00";
            cData["booking.roomNights"] = "2";
            cData["booking.roomCount"] = "1";
            cData["booking.adultCount"] = "2";


            cData.put("&&events", "event1");

            cData.put(
                "&&products",
                ";ATLCP;1;69.95;event1=5.5"
            );


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


