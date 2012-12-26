package com.berge.itshappy;

import java.util.Timer;
import java.util.TimerTask;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class SplashActivity extends Activity {
	private long splashDelay = 1500;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                finish();
                Intent hackbookIntent = new Intent().setClass(SplashActivity.this, LoginAll.class);
                startActivity(hackbookIntent);
            }
        };

        Timer timer = new Timer();
        timer.schedule(task, splashDelay);
    }
}
