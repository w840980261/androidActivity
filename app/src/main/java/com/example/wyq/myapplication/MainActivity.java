package com.example.wyq.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    public static final String TAG="msg:";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i(TAG,"MainActivity onCreate");
    }
    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(TAG,"MainActivity onRestart");
        // The activity is about to become visible.
    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG,"MainActivity onStart");
        // The activity is about to become visible.
    }
    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG,"MainActivity onResume");
        // The activity has become visible (it is now "resumed").
    }
    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG,"MainActivity onPause");
        // Another activity is taking focus (this activity is about to be "paused").
    }
    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG,"MainActivity onStop");
        // The activity is no longer visible (it is now "stopped")
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG,"MainActivity onDestroy");
        // The activity is about to be destroyed.
    }
}
