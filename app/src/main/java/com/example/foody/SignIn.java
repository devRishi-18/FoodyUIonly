package com.example.foody;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class SignIn extends AppCompatActivity {
Button btnregister;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);
        btnregister= findViewById(R.id.btnregister);
        getSupportActionBar().setTitle("Sign In");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        btnregister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(SignIn.this, "Register clicked!", Toast.LENGTH_LONG).show();
                Intent intent = new Intent(SignIn.this,SignUp.class);
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