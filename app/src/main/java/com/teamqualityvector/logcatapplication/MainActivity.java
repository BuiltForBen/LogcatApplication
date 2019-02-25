package com.teamqualityvector.logcatapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    private  static final String TAG="MainActivity";
    @Override
        protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.v(TAG,"This is onCreate()");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.v(TAG,"This is onStart()");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.v(TAG,"This is onRestart()");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.v(TAG,"This is onResume()");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.v(TAG,"This is onPause()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.v(TAG,"This is onStop()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.v(TAG,"This is onDestroy()");
    }
}
