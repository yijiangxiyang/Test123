package com.launcher3.test123;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.e("====", "onCreate");

        test();
    }

    private void test() {
        Log.e("====", "test method");
        testMyLog();
    }

    private void testMyLog() {
        long time = System.currentTimeMillis();
        MyLog.e("my log... time: " + time);
    }
}