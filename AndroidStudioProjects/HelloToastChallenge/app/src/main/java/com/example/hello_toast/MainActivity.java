package com.example.hello_toast;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private int mCount;
    private TextView mShowCount;
    private Button btnIncrement;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mShowCount = (TextView) findViewById(R.id.show_count);
        btnIncrement =  findViewById(R.id.button_count);
        btnIncrement.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                countUp();
            }
        });
        if (savedInstanceState != null){
            mCount = savedInstanceState.getInt("key_counter");
            mShowCount.setText(String.valueOf(mCount));
        }
    }

    public void countUp() {
        mCount++;
        mShowCount.setText(String.valueOf(mCount));
    }

    public void showToast(View view) {
        Toast toast = Toast.makeText(this, R.string.toast_message, Toast.LENGTH_SHORT);
        toast.show();
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("key_counter", mCount);
    }
}