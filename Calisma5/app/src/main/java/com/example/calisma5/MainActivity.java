package com.example.calisma5;

import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


      new CountDownTimer(10000,1000){
          public void onTick(long hebele){
              TextView textView = (TextView)findViewById(R.id.textView);
              textView.setText("Left: " + hebele/1000);
          }
          public void onFinish(){
              Toast.makeText(getApplicationContext(),"Time's Done",Toast.LENGTH_LONG).show();
              TextView metin = (TextView)findViewById(R.id.textView);
              metin.setText("Finished");
          }

      }.start();


















       /* new CountDownTimer(10000,1000) {
            public void onTick(long millisUntilFinished) {
                TextView metin = (TextView) findViewById(R.id.textView);
                metin.setText("Left: " + millisUntilFinished / 1000);
            }

            public void onFinish() {
                Toast.makeText(getApplicationContext(), "Time's Done", Toast.LENGTH_LONG).show();
                TextView metin = (TextView) findViewById(R.id.textView);
                metin.setText("Finished");
            }


        }.start();*/
    }



}

