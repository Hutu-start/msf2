package com.cfq.fqmsfmodule.common;

import android.util.Log;

import com.cfq.fqmsfmodule.config.VendorKeyConfig;

public class FQLogger {
    public static final String TAG = VendorKeyConfig.LogType;
    private static boolean isLoggerEnable = true;

    public FQLogger() {
    }

    public static void setIsLoggerEnable(boolean loggerEnable) {
        Log.d(TAG, "setIsLoggerEnable:" + loggerEnable);
        isLoggerEnable = loggerEnable;
    }

    public static void i(String msg) {
        if(isLoggerEnable){
            Log.i(TAG,msg);
        }
    }

    public static void d(String msg) {
        if(isLoggerEnable){
            Log.d(TAG,msg);
        }
    }

    public static void e(String msg) {
        if(isLoggerEnable) {
            Log.e(TAG,msg);
        }
    }

    public static void v(String msg) {
        if(isLoggerEnable){
            Log.v(TAG,msg);
        }
    }

    public static void w(String msg) {
        if(isLoggerEnable){
            Log.w(TAG,msg);
        }
    }
}
