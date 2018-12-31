package com.example.user.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;

public class SelectCompleteActivity extends Activity{

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_compelete);
        Button p_button = (Button) findViewById(R.id.select_weather_button);
        Button b_button = (Button) findViewById(R.id.page_back_button_complete);

        p_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SelectCompleteActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
        b_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SelectCompleteActivity.super.onBackPressed();
            }
        });
    }
}
