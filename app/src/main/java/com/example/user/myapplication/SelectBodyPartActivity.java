package com.example.user.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SelectBodyPartActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_body_part);
        Button p_button = (Button) findViewById(R.id.place_save_button);
        Button b_button = (Button) findViewById(R.id.page_back_button);

        p_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SelectBodyPartActivity.this, SelectTimeActivity.class);
                startActivity(intent);
            }
        });
        b_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SelectBodyPartActivity.super.onBackPressed();
            }
        });
    }
}
