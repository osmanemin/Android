package com.example.intent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



    }

    EditText userInput;

    EditText userInput2;

    public void changeActivity(View view){

        userInput = (EditText) findViewById(R.id.editText);

        userInput2 = (EditText) findViewById(R.id.editText2);

        Intent intent = new Intent(getApplicationContext(), Main2Activity.class);

        intent.putExtra("input",userInput.getText().toString());

        intent.putExtra("surname",userInput2.getText().toString());

        startActivity(intent);



    }



}
