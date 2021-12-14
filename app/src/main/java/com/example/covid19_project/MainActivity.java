package com.example.covid19_project;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button backButton = (Button) findViewById(R.id.backButton);
        backButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent resultIntent = new Intent();
                resultIntent.putExtra("message", "back to login");

                setResult(Activity.RESULT_OK, resultIntent);
                finish();
            }
        });
        Button CovidpreventionBtn = (Button) findViewById(R.id.CovidpreventionBtn);
        CovidpreventionBtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), ChangeImageActivity.class);
                startActivity(intent);


            }
        });
        Button selfBtn = (Button) findViewById(R.id.selfBtn);
        selfBtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), SelfCheckActivity.class);
                startActivity(intent);
            }

        });
    }

    public void OnClickedCovidBtn(View v){
        Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://corona-live.com/"));
        startActivity(intent);
        }






    public void OnClickedCovidvaccineBtn(View v) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://ncvr2.kdca.go.kr/"));
        startActivity(intent);
    }



}

