package com.example.foody;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Button login;
    Button register;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getWindow().setFlags(
           WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,
           WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS
        );
        getSupportActionBar().hide();
        login= findViewById(R.id.login);
        register= findViewById(R.id.register);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "LogIn clicked!", Toast.LENGTH_LONG).show();
                Intent intent = new Intent(MainActivity.this,SignIn.class);
                startActivity(intent);
            }
        });
        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Register clicked!", Toast.LENGTH_LONG).show();
                Intent intent = new Intent(MainActivity.this,SignUp.class);
                startActivity(intent);
            }
        });
    }


}