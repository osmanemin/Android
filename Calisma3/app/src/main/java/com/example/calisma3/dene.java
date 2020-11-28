package com.example.calisma3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class dene extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dene);
    }

    public void dagis(View view){

        Intent intent = new Intent(getApplicationContext(),MainActivity.class);
        startActivity(intent);


    }



}
