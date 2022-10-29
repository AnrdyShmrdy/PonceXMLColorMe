package com.example.poncexmlcolorme;

import androidx.annotation.ColorInt;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Boolean redButtonPressed = false; //Variable to determine when red button is first pressed
    Boolean greenButtonPressed = false; //Variable to determine when green button is first pressed
    Boolean blueButtonPressed = false; //Variable to determine when blue button is first pressed
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void redButtonPress(View view) {
        Button red_button = findViewById(R.id.red_button);
        if (!redButtonPressed) {
            red_button.setBackgroundColor(getColor(R.color.red));
            redButtonPressed = true;
        }
        Toast.makeText(
                        getApplicationContext(),
                        "You pressed the red button",
                        Toast.LENGTH_SHORT)
                .show();
    }

    public void greenButtonPress(View view) {
        Button green_button = findViewById(R.id.green_button);
        if (!greenButtonPressed) {
            green_button.setBackgroundColor(getColor(R.color.green));
            greenButtonPressed = true;
        }
        Toast.makeText(
                        getApplicationContext(),
                        "You pressed the green button",
                        Toast.LENGTH_SHORT)
                .show();
    }

    public void blueButtonPress(View view) {
        Button blue_button = findViewById(R.id.blue_button);
        if (!blueButtonPressed) {
            blue_button.setBackgroundColor(getColor(R.color.blue));
            blueButtonPressed = true;
        }
        Toast.makeText(
                        getApplicationContext(),
                        "You pressed the blue button",
                        Toast.LENGTH_SHORT)
                .show();

    }
}