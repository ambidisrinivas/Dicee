package com.mysviews.dicee;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button rollButton = (Button) findViewById(R.id.rollButton);
        final ImageView leftDice = (ImageView) findViewById(R.id.image_leftDice);
        final ImageView rightDice = (ImageView) findViewById(R.id.image_rightDice);
        final TextView textView = (TextView) findViewById(R.id.Done);
        final int[] diceArray={R.drawable.dice1,
                R.drawable.dice2,
                R.drawable.dice3,
                R.drawable.dice4,
                R.drawable.dice5,
                R.drawable.dice6};
        rollButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("Dicee", "the button has been pressed!");
                Random randomNumberGenerator = new Random();
                int num = randomNumberGenerator.nextInt(6);
                Log.d("Dicee","the number generated is :"+num);
                leftDice.setImageResource(diceArray[num]);
                num = randomNumberGenerator.nextInt(6);
                Log.d("Dicee","the number generated is :"+num);
                rightDice.setImageResource(diceArray[num]);
                textView.setText("Done");
            }
        });
    }
}
