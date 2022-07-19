package com.example.loginapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        Bundle b = getIntent().getExtras();
        String name = b.getString("us");
        Toast.makeText(LoginActivity.this, ""+name, Toast.LENGTH_SHORT).show();
    }
}