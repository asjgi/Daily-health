package com.example.user.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.view.Window;
import android.widget.ImageButton;

public class SecondLogoActivity extends Activity{

    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_login);
    }
}
