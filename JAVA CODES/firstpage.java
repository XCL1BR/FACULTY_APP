package com.example.utio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class firstpage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_firstpage);
        Intent intent = getIntent();
    }
    public void hodkapage(View view){
        Intent intent = new Intent(this, hodpage.class);
        startActivity(intent);
    }
    public void pradeep_page(View view){
        Intent intent = new Intent(this, pradeep.class);
        startActivity(intent);
    }
    public void giripage(View view){
        Intent intent = new Intent(this, giri.class);
        startActivity(intent);
    }
    public void suripage(View view) {
        Intent intent = new Intent(this, suri.class);
        startActivity(intent);
    }
    public void vanerpage(View view) {
        Intent intent = new Intent(this, vaner.class);
        startActivity(intent);
    }
    public void cuteipage(View view) {
        Intent intent = new Intent(this, cutie.class);
        startActivity(intent);
    }


}