package com.example.timerdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        new CountDownTimer(10000,1000){
            public void onTick(long milliSecondsUntilDone){
                Log.i("Seconds Left",String.valueOf((milliSecondsUntilDone/1000)));
            }

            @Override
            public void onFinish() {
                Log.i("WE are done","No more second");
            }
        }.start();



        /*
        Handler handler = new Handler();


        Runnable run = new Runnable() {
            @Override
            public void run() {
                Log.i("Info","The time is passed by : ");
                handler.postDelayed(this,1000);
            }
        };
        handler.post(run);*/


    }
}