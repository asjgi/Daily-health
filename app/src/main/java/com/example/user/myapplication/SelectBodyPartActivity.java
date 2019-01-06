package com.example.user.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class SelectBodyPartActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_body_part);
        Button b_button = (Button) findViewById(R.id.page_back_button);
        Button option_button_13 = (Button) findViewById(R.id.shoulder_button_13);
        Button option_button_14 = (Button) findViewById(R.id.back_button_14);
        Button option_button_15 = (Button) findViewById(R.id.upper_leg_button_15);
        Button option_button_16 = (Button) findViewById(R.id.lower_leg_button_16);
        Button option_button_17 = (Button) findViewById(R.id.triceps_button_17);
        Button option_button_18 = (Button) findViewById(R.id.biceps_button_18);
        Button p_button = (Button) findViewById(R.id.place_save_button);

        b_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SelectBodyPartActivity.super.onBackPressed();
            }
        });

        option_button_13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast = Toast.makeText(SelectBodyPartActivity.this, "Pressed shoulder_button", Toast.LENGTH_SHORT);
                toast.show();
            }
        });
        option_button_14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast = Toast.makeText(SelectBodyPartActivity.this, "Pressed back_button", Toast.LENGTH_SHORT);
                toast.show();
            }
        });
        option_button_15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast = Toast.makeText(SelectBodyPartActivity.this, "Pressed upper_leg_button", Toast.LENGTH_SHORT);
                toast.show();
            }
        });
        option_button_16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast = Toast.makeText(SelectBodyPartActivity.this, "Pressed lower_leg_button", Toast.LENGTH_SHORT);
                toast.show();
            }
        });
        option_button_17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast = Toast.makeText(SelectBodyPartActivity.this, "Pressed triceps_button", Toast.LENGTH_SHORT);
                toast.show();
            }
        });
        option_button_18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast = Toast.makeText(SelectBodyPartActivity.this, "Pressed biceps_button", Toast.LENGTH_SHORT);
                toast.show();
            }
        });
        p_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SelectBodyPartActivity.this, SelectTimeActivity.class);
                startActivity(intent);
            }
        });

    }
}
