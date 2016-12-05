package com.walkap.caffelatrino;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.SeekBar;
import android.widget.TextView;

public class SugarSlider extends AppCompatActivity {


    public SeekBar slider;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sugar_slider);

        Intent intent = getIntent();
        String message = intent.getStringExtra(ChooseCoffeeActivity.EXTRA_MESSAGE);
        TextView textView = new TextView(this);
        textView.setText("Coffee: " + message);

        ViewGroup layout = (ViewGroup) findViewById(R.id.activity_sugar_slider);
        layout.addView(textView);

        slider = (SeekBar) findViewById(R.id.slider);
        slider.setMax(5);
        slider.setProgress(1);

    }

}
