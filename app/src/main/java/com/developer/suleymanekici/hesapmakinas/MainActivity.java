package com.developer.suleymanekici.hesapmakinas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //tanımlama işlemi
    EditText deger1;
    EditText deger2;
    TextView result;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


         deger1 = findViewById(R.id.deger1);
         deger2 = findViewById(R.id.deger2);
         result = findViewById(R.id.result);

    }

    public void  toplama (View view) {
        int a = Integer.parseInt(deger1.getText().toString());
        int b = Integer.parseInt(deger2.getText().toString());
        int sonucyazdir = a+b;
        result.setText("Sonuc: " + sonucyazdir);
    }

    public  void cikarma (View view) {
       int a = Integer.parseInt(deger1.getText().toString());
       int b = Integer.parseInt(deger2.getText().toString());
       int sonucyazdir = a-b;
       result.setText("Sonuç: " + sonucyazdir);
    }

    public void carpma (View view) {
        int a = Integer.parseInt(deger1.getText().toString());
        int b = Integer.parseInt(deger2.getText().toString());
        int sonucyazdir = a*b;
        result.setText("Sonuç: " + sonucyazdir);
    }

    public  void bolme (View view) {
        int a = Integer.parseInt(deger1.getText().toString());
        int b = Integer.parseInt(deger2.getText().toString());
        int sonucyazdir = a/b;
        result.setText("Sonuç: " + sonucyazdir);
    }
}
