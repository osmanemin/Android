package com.example.calsima6;

import android.os.Build;
import android.os.Handler;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    TextView metin;
    int number;
    Handler handler;//Eylemci
    Runnable run;//Çalıştırılabilir

    public void start(View view){
        metin = (TextView) findViewById(R.id.textView);
        metin.setText("Time:" + number);
        number = 0;
        handler = new Handler();
        run = new Runnable() {
            @Override
            public void run() {
                metin.setText("Time:" + number);
                number++;
                metin.setText("Time: " + number);
                handler.postDelayed(this,1000);
            }
        };
        handler.post(run);
    }
    public void stop(View view){
        metin = (TextView) findViewById(R.id.textView);
        handler.removeCallbacks(run);

        metin.setText("Time: " + number);
        number = 0;
    }
}
