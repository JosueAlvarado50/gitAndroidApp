package com.example.implicitintents;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText mWebsiteEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mWebsiteEditText = findViewById(R.id.website_edittext);//use findViewById() to get a reference to the EditText instance and assign it to that private variable:

    }

    public void openWebsite(View view) {
        String url = mWebsiteEditText.getText().toString();//Add a statement to the new openWebsite() method that gets the string value of the EditText:
        Uri webpage = Uri.parse(url);//Encode and parse that string into a Uri object:
        Intent intent = new Intent(Intent.ACTION_VIEW, webpage);//Create a new Intent with Intent.ACTION_VIEW as the action and the URI as the data:
        if (intent.resolveActivity(getPackageManager()) != null) {

        }

    }
}