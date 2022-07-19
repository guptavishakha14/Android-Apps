package com.example.myapplicationvideo;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {
    VideoView vv;
    Button video;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        vv = findViewById(R.id.videoView);
        video = findViewById(R.id.pv);
        video.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String path = "android.resource://"+getPackageName()+"/"+R.raw.blossoms;
                Uri url = Uri.parse(path);
                vv.setVideoURI(url);
                //vv.start();
                MediaController mdc = new MediaController(MainActivity.this);
                vv.setMediaController(mdc);
                mdc.setAnchorView(vv);
            }
        });
    }
}