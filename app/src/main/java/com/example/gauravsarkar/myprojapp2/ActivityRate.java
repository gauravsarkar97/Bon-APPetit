package com.example.gauravsarkar.myprojapp2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by Gaurav Sarkar on 12/14/2017.
 */

public class ActivityRate extends Activity {
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rate);
        TextView p = (TextView) findViewById(R.id.ratings);
        Button button = (Button)findViewById(R.id.button10);
        final RatingBar ra = (RatingBar)findViewById(R.id.ratingBar);
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                // get values and then displayed in a toast
               // String totalStars = "Total Stars:: " + ra.getNumStars();
                String rating = "Rating :: " + ra.getRating();
                Toast.makeText(getApplicationContext(), "Thank You for Raing Us" + rating, Toast.LENGTH_LONG).show();
                Intent i = new Intent(ActivityRate.this,ActivityFour.class);
                startActivity(i);
            }
        });
    }
}