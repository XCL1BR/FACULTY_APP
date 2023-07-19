package com.example.utio;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class hodpage extends AppCompatActivity {
Button pdff;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hodpage);
        Intent intent = getIntent();
        pdff =(Button) findViewById(R.id.pdf);

        pdff.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), hodpdf.class);
                i.putExtra("pdf_url","https://cse.sjcit.ac.in/dr-manjunatha-kumar-b-h/");
                startActivity(i);
            }
        });
    }
}