package com.example.foody;

import android.content.Intent;
import android.os.Bundle;
import android.view.WindowManager;

import androidx.appcompat.app.AppCompatActivity;

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        getWindow().setFlags(
                WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,
                WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS
        );
        getSupportActionBar().hide();
        Thread thread = new Thread(){
            @Override
            public void run() {

                    try {
                        sleep(3000);
                    }
                    catch (Exception e) {
                    e.printStackTrace();
                    }
                    finally {
                        Intent intent = new Intent(SplashScreen.this, MainActivity.class);
                        startActivity(intent);
                        finish();
                    }

            }

        };thread.start();

    }
}