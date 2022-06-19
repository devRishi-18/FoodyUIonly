package com.example.foody;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class SignUp extends AppCompatActivity {
Button btnregister;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        btnregister= findViewById(R.id.btnregister);
        getSupportActionBar().setTitle("Register");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        btnregister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(SignUp.this, "Register clicked!", Toast.LENGTH_LONG).show();
                Intent intent = new Intent(SignUp.this,SignIn.class);
                startActivity(intent);
            }
        });
    }
    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return super.onSupportNavigateUp();
    }
}