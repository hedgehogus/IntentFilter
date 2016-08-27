package com.example.nemesis.intentfilter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button btnTime, btnDate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnTime = (Button) findViewById(R.id.btnTime);
        btnDate = (Button) findViewById(R.id.btnDate);
        btnTime.setOnClickListener(this);
        btnDate.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        //https://developer.android.com/reference/android/content/Intent.html#ACTION_VIEW
        Intent intent;
        switch (view.getId()){
            case R.id.btnTime:
                intent = new Intent("com.nemesis.intent.action.showtime");
                startActivity(intent);
                break;
            case R.id.btnDate:
                intent = new Intent("com.nemesis.intent.action.showdate");
                startActivity(intent);
                break;
        }

    }
}
