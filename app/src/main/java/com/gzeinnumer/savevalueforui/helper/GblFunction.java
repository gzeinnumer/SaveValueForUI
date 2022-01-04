package com.gzeinnumer.savevalueforui.helper;

import android.util.Log;

import java.util.Locale;

public class GblFunction {

    private static final String TAG = "jkhmvfkjklhk";

    public static void logD(String msg){
        Log.d(TAG, "logD: "+msg);
    }

    public static String s(String value) {
        return value == null ? "-" : value;
    }

    //decimal int only/round down
    public static String di(String value) {
        Double d = Double.valueOf(value);

        double f = d - d.longValue();
        if (f == .0) {
            // format d.longValue() as int
            return String.valueOf(d.longValue());
        } else {
            // format d as double
            return String.valueOf(d);
        }
    }

    //decimal 2 comma
    public static String d2(String value) {
        return s(Double.parseDouble(value)+"");
    }

    //round UP
    public static String ru(String value) {
        return String.valueOf((int) Math.ceil(Double.parseDouble(value)));
    }
}
