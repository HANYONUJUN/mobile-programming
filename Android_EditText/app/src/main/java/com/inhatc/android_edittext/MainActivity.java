package com.inhatc.android_edittext;


import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText objET=(EditText)findViewById(R.id.editText); // EditText는 Text를 입력 및 수정까지 가능한 뷰(View)위젯
        objET.setText("Google : ");
        objET.setGravity(0x01);
        String strData =objET.getText().toString();
        objET.setText(strData + "Android Programming.");

    }

}