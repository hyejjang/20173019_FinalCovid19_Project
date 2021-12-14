package com.example.covid19_project;


import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SelfCheckActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selfcheck);


        final CheckBox cb1 = (CheckBox)findViewById(R.id.checkBox1);
        final CheckBox cb2 = (CheckBox)findViewById(R.id.checkBox2);
        final CheckBox cb3 = (CheckBox)findViewById(R.id.checkBox3);
        final CheckBox cb4 = (CheckBox)findViewById(R.id.checkBox4);
        final CheckBox cb5 = (CheckBox)findViewById(R.id.checkBox5);
        final CheckBox cb6 = (CheckBox)findViewById(R.id.checkBox6);

        Button b = (Button)findViewById(R.id.button1);
        final TextView tv = (TextView)findViewById(R.id.textView2);

        b.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                String result = "";  // 결과를 출력할 문자열  ,  항상 스트링은 빈문자열로 초기화 하는 습관을 가지자
                if(cb1.isChecked() == true) result += cb1.getText().toString();
                if(cb2.isChecked() == true) result += cb2.getText().toString();
                if(cb3.isChecked() == true) result += cb3.getText().toString();
                if(cb4.isChecked() == true) result += cb4.getText().toString();
                if(cb5.isChecked() == true) result += cb5.getText().toString();
                if(cb6.isChecked() == true) result += cb6.getText().toString();
                tv.setText("선택 증상 : " + result);

            } // end onClick
        }); // end setOnClickListener

    } // end onCreate()
}




