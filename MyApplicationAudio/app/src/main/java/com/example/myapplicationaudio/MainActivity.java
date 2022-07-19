package com.example.myapplicationaudio;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    MediaPlayer mp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mp = MediaPlayer.create(MainActivity.this,R.raw.gallangoodiyaan);
    }

    public void playclick(View view) {
        mp.start();
    }

    public void pauseclick(View view) {
        mp.pause();
    }

    public void stopclick(View view) {
        mp.stop();
    }
}