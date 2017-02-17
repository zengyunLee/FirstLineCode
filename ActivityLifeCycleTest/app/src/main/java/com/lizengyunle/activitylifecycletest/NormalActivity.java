package com.lizengyunle.activitylifecycletest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class NormalActivity extends AppCompatActivity {
    public static final String TAG = "MainActivity00";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d(TAG,"2onCreate");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.normal_layout);
    }
    @Override
    protected void onStart(){
        super.onStart();
        Log.d(TAG,"2onStart");
    }
    @Override
    protected void onResume(){
        super.onResume();
        Log.d(TAG,"2onResume");
    }
    @Override
    protected void onPause(){
        super.onPause();
        Log.d(TAG,"2onPause");
    }
    @Override
    protected void onStop(){
        super.onStop();
        Log.d(TAG,"2onStop");
    }
    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.d(TAG,"2onDestroy");
    }
    @Override
    protected void onRestart(){
        super.onRestart();
        Log.d(TAG,"2onRestart");
    }
}
