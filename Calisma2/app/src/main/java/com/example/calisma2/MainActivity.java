package com.example.calisma2;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SharedPreferences abc = this.getSharedPreferences("com.example.calisma2",Context.MODE_PRIVATE);

        int sayi = 50;

        abc.edit().putInt("Hebele",sayi).apply();

        int tutucu = abc.getInt("Hebele",0);
        System.out.println("Tutucu: " + tutucu);


        int age = 10;

        abc.edit().putInt("Hebele",age).apply();
        int tutucu2 = abc.getInt("Hebele",0);
        System.out.println("Tutucuuuu: " + tutucu2);

        abc.edit().remove("Hebele").apply();
        tutucu2 = abc.getInt("Hebele",0);
        System.out.println("Tutucu: "+ tutucu2);

    }
}
