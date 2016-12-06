package com.walkap.caffelatrino;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;
import android.widget.TextView;

public class SugarSlider extends AppCompatActivity implements OnSeekBarChangeListener {

    public SeekBar slider;
    public int value;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sugar_slider);

        Intent intent = getIntent();
        String coffee = intent.getStringExtra("extra_coffee");
        TextView tvCoffee = (TextView) findViewById(R.id.tvCoffee);
        String coffeeString = getResources().getString(R.string.coffee);
        String newString = coffeeString + ": " + coffee;
        tvCoffee.setText(newString);

        slider = (SeekBar) findViewById(R.id.slider);
        slider.setMax(5);
        slider.setProgress(1);
        slider.setOnSeekBarChangeListener(this);
    }

    @Override
    public void onProgressChanged(SeekBar slider, int progress, boolean fromUser) {
        value = progress;
    }
    @Override
    public void onStartTrackingTouch(SeekBar slider) {}
    @Override
    public void onStopTrackingTouch(SeekBar slider) {}

    public void sendMessage(View view){
        Intent intent = new Intent(this, AdditionActivity.class);
        String seekValue = "" + value;

        Intent intent2 = getIntent();
        String coffee = intent2.getStringExtra("extra_coffee");

        intent.putExtra("extra_coffee", coffee);
        intent.putExtra("extra_sugar", seekValue);
        startActivity(intent);
    }


}
