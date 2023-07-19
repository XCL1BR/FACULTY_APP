package com.example.utio;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class pradeep extends AppCompatActivity {

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pradeep);
        Intent intent = getIntent();
        Button pdff;
        pdff =(Button) findViewById(R.id.pdf);

        pdff.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), pradeepdf.class);
                i.putExtra("pdf_url","https://cse.sjcit.ac.in/pradeep/");
                startActivity(i);
            }
        });
    }
}