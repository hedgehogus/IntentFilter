package com.example.nemesis.intentfilter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateActivity extends AppCompatActivity {
    TextView tvDate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_date);

        tvDate = (TextView) findViewById(R.id.tvDate);

        SimpleDateFormat sdf = new SimpleDateFormat("d, MM, yyyy");
        String date = sdf.format(new Date(System.currentTimeMillis()));

        tvDate.setText(date);
    }
}
