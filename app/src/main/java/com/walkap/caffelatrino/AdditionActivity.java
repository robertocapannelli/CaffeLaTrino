package com.walkap.caffelatrino;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.widget.TextView;

//import static com.walkap.caffelatrino.ChooseCoffeeActivity.EXTRA_COFFEE;
//import static com.walkap.caffelatrino.SugarSlider.EXTRA_SUGAR;

public class AdditionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_addition);

        Intent intent = getIntent();

        String sugar = intent.getStringExtra("extra_sugar");
        String coffee = intent.getStringExtra("extra_coffee");

        TextView tvSugar = (TextView) findViewById(R.id.tvSugar);
        tvSugar.setText("Sugar: " + sugar);

        TextView tvCoffee = (TextView) findViewById(R.id.tvCoffee);
        tvCoffee.setText("Coffee: " + coffee);

    }
}
