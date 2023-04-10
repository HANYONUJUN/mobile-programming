package com.inhatc.android_intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btnAnimal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnAnimal =(Button) findViewById(R.id.btnCow);
        btnAnimal.setOnClickListener(this);
    }
    public void onClick(View v){
        if(v == btnAnimal){
           Intent cowIntent = new Intent(MainActivity.this, CowActivity.class);
           startActivity(cowIntent);
        }
    }
}