package com.example.seekbarandratingbar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.SeekBar;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    SeekBar seekBar;
    RatingBar ratingBar;
    Button ratingButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Variable defining
        seekBar = findViewById(R.id.seekbar);
        ratingBar = findViewById(R.id.ratingBar);
        ratingButton = findViewById(R.id.ratingButton);

        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            int progressValue = 0;
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                // If the changes are made by the user, This method will be invoked
                progressValue = progress;
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                // If the user interact, this method will be invoked. Called automatically
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                // If the user end the interaction, this method will be invoked. Called automatically
            }
        });

        ratingButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String totalStars = "Total Stars:: " + ratingBar.getNumStars();
                String rating = "Rating :: " + ratingBar.getRating();
                Toast.makeText(getApplicationContext(), totalStars + "\n" + rating, Toast.LENGTH_LONG).show();
            }
        });
    }
}