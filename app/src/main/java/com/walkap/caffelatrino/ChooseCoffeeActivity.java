package com.walkap.caffelatrino;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class ChooseCoffeeActivity extends AppCompatActivity {

    public RadioGroup radioCoffeeGroup;
    public RadioButton radioCoffeeButton;
    public final static String EXTRA_MESSAGE = "com.example.caffelatrino.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_coffee);
    }

    /*Called when button "Go" is pressed*/
    public void sendMessage(View view){
        Intent intent = new Intent(this, SugarSlider.class);
        radioCoffeeGroup = (RadioGroup) findViewById(R.id.radioCoffeeGroup);
        int selectedId = radioCoffeeGroup.getCheckedRadioButtonId();
        radioCoffeeButton = (RadioButton) findViewById(selectedId);
        String coffee = radioCoffeeButton.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, coffee);
        startActivity(intent);
    }
}