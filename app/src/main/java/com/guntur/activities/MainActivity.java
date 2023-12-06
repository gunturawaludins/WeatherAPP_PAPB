package com.azhar.guntur.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.azhar.guntur.R;
import com.azhar.guntur.fragment.WeatherFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportFragmentManager().beginTransaction().add(R.id.framelayout_mainactivity, new WeatherFragment()).commit();
    }
}
