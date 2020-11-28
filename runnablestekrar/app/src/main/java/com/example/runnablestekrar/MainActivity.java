package com.example.runnablestekrar;

import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    int number;
    Handler handler;
    Runnable run;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void start(View view){

        textView = (TextView) findViewById(R.id.textView);
        number = 0;
        Button button2 = (Button) findViewById(R.id.button2);
        button2.setEnabled(false);

        handler = new Handler();
        run = new Runnable() {
            @Override
            public void run() {

                textView.setText("Time: " + number);
                number++ ;
                handler.postDelayed(this,1000);
            }
        };
        handler.post(run);

    }


    public void stop(View view){
        Button button2 = (Button) findViewById(R.id.button2);
        button2.setEnabled(true);
        handler.removeCallbacks(run);
        textView = (TextView) findViewById(R.id.textView);

        textView.setText("Time: " + number);
        number = 0;



    }




}
