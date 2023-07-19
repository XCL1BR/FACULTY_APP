package com.example.utio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class cutie extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cutie);
        Intent intent = getIntent();
        Button pdff;
        pdff =(Button) findViewById(R.id.pdf);

        pdff.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), cutiepdf.class);
                i.putExtra("pdf_url","https://cse.sjcit.ac.in/mamatha-g/");
                startActivity(i);
            }
        });
    }
}