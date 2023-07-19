package com.example.utio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class suri extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_suri);
        Intent intent = getIntent();
        Button pdff;
        pdff =(Button) findViewById(R.id.pdf);

        pdff.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), suripdf.class);
                i.putExtra("pdf_url","https://cse.sjcit.ac.in/suresh-kumar-h-s/");
                startActivity(i);
            }
        });
    }
}