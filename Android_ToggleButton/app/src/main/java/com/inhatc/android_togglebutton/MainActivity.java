package com.inhatc.android_togglebutton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    ToggleButton objTButton = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        objTButton = (ToggleButton)findViewById(R.id.tglOnOff);
        objTButton.setOnClickListener(this);
    }

    public void onClick(View v){
        if(objTButton.isChecked()){
            Toast.makeText(MainActivity.this, "ON", Toast.LENGTH_SHORT).show();
            //LENGTH_SHORT -> 메시지를 짧게 띄워줌, LENGTH_LONG ->메시지를 길게 띄워줌
        }else{
            Toast.makeText(MainActivity.this, "OFF",Toast.LENGTH_SHORT).show();
        }
    }
}