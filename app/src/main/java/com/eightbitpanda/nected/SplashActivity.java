package com.eightbitpanda.nected;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        SharedPreferences pref = getApplicationContext().getSharedPreferences("AppConfig", MODE_PRIVATE); // 0 - for private mode

        Intent intent = null;
        if(pref.getBoolean("userLoggedIn", false)) {
            intent = new Intent(this, MainActivity.class);
            Toast.makeText(this, "Launching Main", Toast.LENGTH_SHORT).show();
        }
        else
        {
            intent = new Intent(this, GettingStartedActivity.class);
            Toast.makeText(this, "Launching GS", Toast.LENGTH_SHORT).show();
        }
        startActivity(intent);
        finish();
    }
}