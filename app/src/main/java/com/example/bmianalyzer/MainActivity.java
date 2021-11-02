package com.example.bmianalyzer;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
//    private final int SPLASH_DISPLAY_LENGTH = 1000;
    TextView nextToLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nextToLogin= findViewById(R.id.nextToLogin);

        nextToLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent loginIntent = new Intent(MainActivity.this,Login.class);
                startActivity(loginIntent);
                finish();

            }
        });
//time
//
//        new Handler().postDelayed(new Runnable(){
//            @Override
//            public void run() {
//                /* Create an Intent that will start the Menu-Activity. */
//                Intent mainIntent = new Intent(MainActivity.this,Login.class);
//                MainActivity.this.startActivity(mainIntent);
//                MainActivity.this.finish();
//            }
//        }, SPLASH_DISPLAY_LENGTH);

    }
}