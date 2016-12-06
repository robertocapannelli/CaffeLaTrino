package com.walkap.caffelatrino;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.widget.TextView;

public class AdditionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_addition);

        Intent intent = getIntent();

        String sugar = intent.getStringExtra("extra_sugar");
        String coffee = intent.getStringExtra("extra_coffee");

        TextView tvSugar = (TextView) findViewById(R.id.tvSugar);
        String sugarString = getResources().getString(R.string.sugar);
        String newSugarString = sugarString + ": " + sugar;
        tvSugar.setText(newSugarString);

        TextView tvCoffee = (TextView) findViewById(R.id.tvCoffee);
        String coffeeString = getResources().getString(R.string.coffee);
        String newCoffeeString = coffeeString + ": " + coffee;
        tvCoffee.setText(newCoffeeString);


    }
}
