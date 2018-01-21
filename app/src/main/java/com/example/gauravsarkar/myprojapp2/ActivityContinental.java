package com.example.gauravsarkar.myprojapp2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by Gaurav Sarkar on 12/14/2017.
 */

public class ActivityContinental extends Activity {
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_continental);
        TextView vb = (TextView)findViewById(R.id.ew);
        TextView vb2 = (TextView)findViewById(R.id.textView14);
        Button bb = (Button)findViewById(R.id.button8);
        bb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ActivityContinental.this,ActivityOrderNow.class);
                startActivity(intent);
            }

        });
    }
}
