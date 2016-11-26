package com.jimmytai.library.colorpicker_demo;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.jimmytai.libary.jcolorpicker.JColorPicker;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ((JColorPicker) findViewById(R.id.jColorPicker)).setColor(Color.parseColor("#0000FF"));
    }
}
