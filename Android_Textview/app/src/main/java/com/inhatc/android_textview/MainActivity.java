package com.inhatc.android_textview;

import androidx.appcompat.app.AppCompatActivity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Gravity;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       // setContentView(R.layout.activity_main);

        TextView objTV = new TextView(this);
        objTV.setText("Android Programming!");

        objTV.setTextColor(Color.BLUE);
        objTV.setTextSize(32);
        objTV.setGravity(Gravity.CENTER);

        setContentView(objTV);
    }
}