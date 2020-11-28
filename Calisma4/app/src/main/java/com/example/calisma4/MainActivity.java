package com.example.calisma4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

   /* EditText editText2;//   Name
    EditText editText3;//   Surname
    EditText editText4;//   e-mail
    EditText editText5;//   Password*/


   EditText metin;


    public void degistir(View view){

        metin = (EditText) findViewById(R.id.editText);
        Intent intent = new Intent(getApplicationContext(),Main2Activity.class);
        intent.putExtra("name",metin.getText().toString());
        startActivity(intent);






        /* editText2 = (EditText) findViewById(R.id.editText2);
        editText3 = (EditText) findViewById(R.id.editText3);
        editText4 = (EditText) findViewById(R.id.editText6);
        editText5 = (EditText) findViewById(R.id.editText7);
        Intent intent = new Intent(getApplicationContext(),Main2Activity.class);
        intent.putExtra("name",editText2.getText().toString());
        intent.putExtra("surname",editText3.getText().toString());
        intent.putExtra("e-mail",editText4.getText().toString());
        intent.putExtra("password",editText5.getText().toString());
        startActivity(intent);*/
    }

   /* userInput = (EditText) findViewById(R.id.editText);

    userInput2 = (EditText) findViewById(R.id.editText2);

    Intent intent = new Intent(getApplicationContext(), Main2Activity.class);

        intent.putExtra("input",userInput.getText().toString());

        intent.putExtra("surname",userInput2.getText().toString());

    startActivity(intent);*/





}
