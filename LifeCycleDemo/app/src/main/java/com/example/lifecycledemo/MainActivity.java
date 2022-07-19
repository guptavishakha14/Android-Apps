package com.example.lifecycledemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast t = Toast.makeText(MainActivity.this, "In onCreated", Toast.LENGTH_SHORT);
        t.show();
    }

    @Override
    protected void onStart() {
        super.onStart();
        Toast t = Toast.makeText(MainActivity.this, "In onStarted", Toast.LENGTH_SHORT);
        t.show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast t = Toast.makeText(MainActivity.this, "In onResume", Toast.LENGTH_SHORT);
        t.show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast t = Toast.makeText(MainActivity.this, "onPause", Toast.LENGTH_SHORT);
        t.show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast t = Toast.makeText(MainActivity.this, "In onStop", Toast.LENGTH_SHORT);
        t.show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast t = Toast.makeText(MainActivity.this, "In onDestroy", Toast.LENGTH_SHORT);
        t.show();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Toast t = Toast.makeText(MainActivity.this, "In onRestart", Toast.LENGTH_SHORT);
        t.show();
    }
}
