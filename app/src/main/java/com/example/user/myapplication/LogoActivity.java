package com.example.user.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.Window;

public class LogoActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_logo);

        Handler x = new Handler();
        x.postDelayed(new splash_handler(), 1500);
    }

    class splash_handler implements Runnable {
        @Override
        public void run() {
            Intent intent = new Intent(LogoActivity.this,  LoginActivity.class);
            startActivity(intent);
            finish();
        }
    }
}
