package com.mobileaders.tamm.activities;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.mobileaders.tamm.R;

public class MainActivity extends AppCompatActivity {

    Runnable run;
    Handler handler = new Handler();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        run = new Runnable() {

            @Override

            public void run() {

                Intent intent = new Intent(getApplicationContext(),SecondActivity.class);

                startActivity(intent);

                overridePendingTransition(R.anim.enter_from_right, R.anim.exit_out_left);

                finish();

            }
        };

        handler.postDelayed(run, 3000);
    }
}
