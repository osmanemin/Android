package com.example.intent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        TextView textView = (TextView) findViewById(R.id.textView3);

        Intent intent = getIntent();

        String recevied = intent.getStringExtra("input");

        textView.setText(recevied);

        TextView textView1 = (TextView) findViewById(R.id.textView4);

        Intent intent1 = getIntent();

        String tasiyici = intent1.getStringExtra("surname");

        textView1.setText(tasiyici);


    }

    public void changeScreen(View view){

        Intent intent = new Intent(getApplicationContext(), MainActivity.class);

        startActivity(intent);






    }
}
