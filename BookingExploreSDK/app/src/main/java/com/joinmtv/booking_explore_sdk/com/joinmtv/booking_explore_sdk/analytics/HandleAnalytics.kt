package com.joinmtv.booking_explore_sdk.analytics

import android.app.Application
import com.adobe.marketing.mobile.MobileCore
// import com.adobe.marketing.mobile.MobileCore
import com.joinmtv.booking_explore_sdk.LogUtil


class HandleAnalytics {
    companion object {

        fun handleVisitor(rewardsClubNumber: Long, loginState: String = "") {


            val identifiers = HashMap<String, String>()

            identifiers.put("ihgCRM", rewardsClubNumber.toString());
            identifiers.put("pcr_id", rewardsClubNumber.toString());
            // Identity.syncIdentifiers(identifiers, VisitorID.AuthenticationState.AUTHENTICATED)
            /**
             * Handle AuthenticationState based on login status - implicit, explicit or anonymous
             */
        }

        fun handleStateChanges(
            state: String,
            viewName: String = "",
            event: String = "",
            cData: HashMap<String, String>
        ) {

            LogUtil.log("handleStateChanges state : ${state}, event : ${event}, viewName : ${viewName}")
            /**
             * Adobe SDK - handle state changes - analytics
             */

            //val cData = DataUtil.getDataForState(viewName);

            cData.put("cd.event", event);
            cData.put("cd.viewName", viewName);
            MobileCore.trackState(state, cData)

            /**
             * Adobe SDK - handle state changes - Section ends
             */

        }

        fun handleAction(action: String, cData: HashMap<String, String>) {
            LogUtil.log("handleAction action : ${action}")

            /**
             * Adobe SDK - handle state changes - analytics
             */

            // MobileCore.trackAction(action, cData)

            /**
             * Adobe SDK - handle state changes - Section ends
             */


        }

        fun handleLifeCyleEvents(application: Application, event: String = "") {


            LogUtil.log("handleLifeCyleEvents event : ${event}")
            /**
             * Adobe SDK - handle lifecyle events
             */

            if (event.equals("pause", true)) {
                //   MobileCore.lifecyclePause();
            } else {
                //    MobileCore.setApplication(application);
                //    MobileCore.lifecycleStart(null);
            }


            /**
             * Adobe SDK - handle lifecyle events - Section Ends
             */


        }
    }
} 