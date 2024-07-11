package com.launcher3.test123;

import android.util.Log;

public class MyLog {
    private static String TAG = "====log====";
    public static void e(String msg){
        if (Config.enableLog) {
            Log.e(TAG, msg);
        }
    }
}
