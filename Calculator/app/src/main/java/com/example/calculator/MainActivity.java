package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText e1, e2;
    TextView t1;
    Button badd, bsub, bmul, bdiv;
    int a,b,c;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e1 = findViewById(R.id.et1);
        e2 = findViewById(R.id.et2);
        t1 = findViewById(R.id.tvans);
        badd = findViewById(R.id.btnadd);
        bsub = findViewById(R.id.btnsub);
        bmul = findViewById(R.id.btnmul);
        bdiv = findViewById(R.id.btndiv);
        badd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                a = Integer.parseInt(e1.getText().toString());
                b = Integer.parseInt(e2.getText().toString());
                c = a+b;
                t1.setText(""+c);
                Toast t = Toast.makeText(MainActivity.this,"Addition is "+c, Toast.LENGTH_SHORT);
                t.setGravity(Gravity.CENTER, 0,0);
                t.show();
            }
        });
        bsub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                a = Integer.parseInt(e1.getText().toString());
                b = Integer.parseInt(e2.getText().toString());
                c = a-b;
                t1.setText(""+c);
                Toast t = Toast.makeText(MainActivity.this,"Subtraction is "+c, Toast.LENGTH_SHORT);
                t.setGravity(Gravity.CENTER, 0,0);
                t.show();
            }
        });
        bmul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                a = Integer.parseInt(e1.getText().toString());
                b = Integer.parseInt(e2.getText().toString());
                c = a*b;
                t1.setText(""+c);
                Toast t = Toast.makeText(MainActivity.this,"Multiplication is "+c, Toast.LENGTH_SHORT);
                t.setGravity(Gravity.CENTER, 0,0);
                t.show();
            }
        });
        bdiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                a = Integer.parseInt(e1.getText().toString());
                b = Integer.parseInt(e2.getText().toString());
                c = a/b;
                t1.setText(""+c);
                Toast t = Toast.makeText(MainActivity.this,"Division is "+c, Toast.LENGTH_SHORT);
                t.setGravity(Gravity.CENTER, 0,0);
                t.show();
            }
        });
    }
}