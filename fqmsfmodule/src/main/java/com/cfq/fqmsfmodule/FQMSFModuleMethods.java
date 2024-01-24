package com.cfq.fqmsfmodule;

import android.app.Activity;
import android.content.Context;

import com.alibaba.msf.performance.sdk.MSFPerformanceService;
import com.alibaba.msf.performance.sdk.interfaces.IPerformanceCallback;

import java.util.Map;


public class FQMSFModuleMethods {
    private static Context contextApp;
    private static String aMapKey;

    public static void setUpWithAppKey(Context context, String gdKey, Boolean flag) {
        contextApp = context;
        aMapKey = gdKey;
        MSFPerformanceService.setUpWithAppKey(contextApp, aMapKey, flag);

    }

    public static void markUserAgreedPrivacyPolicy(Context context) {
        contextApp = context;
        MSFPerformanceService.markUserAgreedPrivacyPolicy(contextApp);
    }

    public static void msfSignIn(Activity activity, Map<String, Object> dataMap, IPerformanceCallback callback) {
        MSFPerformanceService
                .create(activity)
                .build()
                .workerAttendanceCertificationWithParams(dataMap, callback);
    }
}
