package com.example.demodialgoogle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText ephone;
    Button bcall, bgoogle,bmap;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ephone = findViewById(R.id.etphone);
        bcall = findViewById(R.id.btcall);
        bgoogle = findViewById(R.id.btgoogle);
        bmap = findViewById(R.id.btmap);
    }

    public void dialclick(View view) {
        String no = ephone.getText().toString();
        Intent i = new Intent(Intent.ACTION_DIAL);
        i.setData(Uri.parse("tel:"+no));
        //i.setData(Uri.parse("tel:8975576559"));
        startActivity(i);
    }

    public void googleclick(View view) {
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse("http://www.google.com"));
        startActivity(i);
    }

    public void mapclick(View view) {
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse("geo:19.8798785,75.3535243"));
        startActivity(i);
    }
}