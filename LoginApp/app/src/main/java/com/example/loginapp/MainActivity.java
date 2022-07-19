package com.example.loginapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView t1;
    EditText u, p;
    Button b1, b2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t1 = findViewById(R.id.lg);
        u = findViewById(R.id.user);
        p = findViewById(R.id.pwd);
        b1 = findViewById(R.id.btn1);
        b2 = findViewById(R.id.btn2);
    }

    public void clickLogin(View view) {
        String un = u.getText().toString();
        String pas = p.getText().toString();
        if (un.equals(pas))
        {
            Intent i = new Intent(MainActivity.this, LoginActivity.class);
            i.putExtra("us",un);
            i.putExtra("pa",pas);
            startActivity(i);
        }
        else {
            Toast.makeText(MainActivity.this, "Invalid Username/Password", Toast.LENGTH_SHORT).show();
        }
    }

    public void clickRegister(View view) {
        Intent i = new Intent(MainActivity.this, RegisterActivity.class);
        startActivity(i);
    }
}