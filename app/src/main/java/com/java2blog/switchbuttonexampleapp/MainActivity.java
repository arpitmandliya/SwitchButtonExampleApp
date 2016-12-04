package com.java2blog.switchbuttonexampleapp;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Switch;
import android.widget.Toast;
import android.view.View.OnClickListener;

public class MainActivity extends AppCompatActivity {

    Switch switchButton;
    private Activity activity;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        activity = this;

        switchButton = (Switch) findViewById(R.id.switch1);
        switchButton.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                if (switchButton.isChecked()) {

                    Toast.makeText(activity, "Switch is in ON State", Toast.LENGTH_LONG).show();
                } else {

                    Toast.makeText(activity, "Switch is in OFF State", Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}

