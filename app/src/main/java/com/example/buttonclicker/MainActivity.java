package com.example.buttonclicker;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

public class MainActivity extends AppCompatActivity {

    private int timesClicked;
    private Button buttonClickerButton;
    private TextView textViewScore;
    private ConstraintLayout constraintLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //generally set up initial values here
        timesClicked = 0;
        textViewScore = findViewById(R.id.textview_main_score);
        constraintLayout = findViewById(R.id.constraint_layout_main);
    }

    public void onClickerClicked(View view) {
        Toast.makeText(this, "Imagine a cookie here please", Toast.LENGTH_LONG).show();
        //increase times clicked

        //show value
        timesClicked++;
        //wiring widgets links the xml to java
        buttonClickerButton = findViewById(R.id.button_main_clicker);
        buttonClickerButton.setText("Score: " + timesClicked);

        changeBackgroundColor();
    }

    private void changeBackgroundColor() {

        int b = (int) (Math.random() * 256);
        int g = (int) (Math.random() * 256);
        int r = (int) (Math.random() * 256);
        int color = Color.rgb(r, g, b);
        constraintLayout.setBackgroundColor(color);
    }
}