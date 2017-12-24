package com.londonappbrewery.magiceightball;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button tryme;
        tryme = findViewById(R.id.button);

        final ImageView roll = findViewById(R.id.rollimg);
        final int[] rollArray = {R.drawable.ball1,
                R.drawable.ball2,
                R.drawable.ball3,
                R.drawable.ball4,
                R.drawable.ball5};

        tryme.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random randomgen = new Random();
                int number = randomgen.nextInt(5);
                roll.setImageResource(rollArray[number]);
            }
        });

    }
}
