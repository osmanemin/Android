package com.example.calisma4;

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

       TextView metnim;
       metnim = (TextView) findViewById(R.id.textView1);
       Intent intent = getIntent();
       metnim.setText(intent.getStringExtra("name"));




        /*TextView textView = (TextView) findViewById(R.id.textView3);
        Intent intent = getIntent();
        String tasiyici = intent.getStringExtra("name");
        textView.setText(tasiyici);
        Intent intent1 = getIntent();
        TextView textView1 = (TextView) findViewById(R.id.textView4);
        String tasiyici1 = intent1.getStringExtra("surname");
        textView1.setText(tasiyici1);
        TextView textView2 = (TextView) findViewById(R.id.textView7);
        Intent intent2 = getIntent();
        String a = intent2.getStringExtra("e-mail");
        textView2.setText(a);
        TextView textView3 = (TextView) findViewById(R.id.textView8);
        Intent intent3 = getIntent();
        String b = intent2.getStringExtra("password");
        textView2.setText(b);*/


        /*TextView textView = (TextView) findViewById(R.id.textView3);
        Intent intent = getIntent();
        String recevied = intent.getStringExtra("input");
        textView.setText(recevied);
        TextView textView1 = (TextView) findViewById(R.id.textView4);
        Intent intent1 = getIntent();
        String tasiyici = intent1.getStringExtra("surname");
        textView1.setText(tasiyici);*/

    }

    public void degis(View view){
        Intent intent = new Intent(getApplicationContext(),MainActivity.class);
        startActivity(intent);
    }


}
