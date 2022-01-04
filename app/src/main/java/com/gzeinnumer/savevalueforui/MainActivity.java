package com.gzeinnumer.savevalueforui;

import static com.gzeinnumer.savevalueforui.helper.GblFunction.d2;
import static com.gzeinnumer.savevalueforui.helper.GblFunction.di;
import static com.gzeinnumer.savevalueforui.helper.GblFunction.logD;
import static com.gzeinnumer.savevalueforui.helper.GblFunction.ru;
import static com.gzeinnumer.savevalueforui.helper.GblFunction.s;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String str1 =  null;
        logD("1. "+ s(str1)); //logD: 1. -

        String str2 =  "data";
        logD("2. "+ s(str2)); //logD: 2. data

        String str3 = "10.0000";
        logD("3. "+ di(str3)); //logD: 3. 10

        String str4 = "10.0700";
        logD("4. "+ d2(str4)); //logD: 4. 10.07

        String str5 = "10.0600";
        logD("5. "+ ru(str5)); //logD: 5. 11

        String str6 = "10.0800";
        logD("6. "+ ru(str6)); //logD: 6. 11
    }
}