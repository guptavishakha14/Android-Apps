package com.example.sendsms;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText etphoneno, etmessage;
    Button bsms;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etphoneno = findViewById(R.id.et1);
        etmessage = findViewById(R.id.et2);
    }

    public void sendSMS(View view) {
        String phoneno = etphoneno.getText().toString();
        String sms = etmessage.getText().toString();
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse("smsto:+91"+phoneno));
        i.putExtra("sms_body",""+sms);
        i.setType("vnd.android-dir/mms-sms");
        startActivity(i);
    }
}