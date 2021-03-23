package com.example.dicee;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
        // check for github...

        Button rollbutton;
        rollbutton = (Button) findViewById(R.id.roll);

        final ImageView leftdice = (ImageView) findViewById(R.id.Image_leftdice);
        final ImageView rightdice = (ImageView) findViewById(R.id.Image_rightdice);

        final int[] Dicearray =  {
                R.drawable.dice1,
                R.drawable.dice2,
                R.drawable.dice3,
                R.drawable.dice4,
                R.drawable.dice5,
                R.drawable.dice6
        };

        rollbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Rolling Done!", Toast.LENGTH_SHORT).show();

                Random Randomnumbergenrator = new Random();
                int number = Randomnumbergenrator.nextInt(6);

                leftdice.setImageResource(Dicearray[number]);

                number = Randomnumbergenrator.nextInt(6);
                rightdice.setImageResource(Dicearray[number]);
            }
        });

    }
}