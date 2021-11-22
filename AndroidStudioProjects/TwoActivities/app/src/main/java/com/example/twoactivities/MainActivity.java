package com.example.twoactivities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private static final String LOG_TAG =
            MainActivity.class.getSimpleName();
    public static final String EXTRA_MESSAGE =
            "com.example.android.twoactivities.extra.MESSAGE";//constant at the top of the class to define the key for the Intent extra
    private EditText mMessageEditText; //Add a private variable at the top of the class to hold the EditText

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mMessageEditText = findViewById(R.id.editText_main);//use findViewById() to get a reference to the EditText and assign it to that private variable:

    }

    public void launchSecondActivity(View view) {
        Log.d(LOG_TAG, "Button clicked!");
        Intent intent = new Intent(this, SecondActivity.class);
        startActivity(intent);
        String message = mMessageEditText.getText().toString();//get the text from the EditText as a string
        intent.putExtra(EXTRA_MESSAGE, message);//Add that string to the Intent as an extra with the EXTRA_MESSAGE constant as the key and the string as the value:
    }
}