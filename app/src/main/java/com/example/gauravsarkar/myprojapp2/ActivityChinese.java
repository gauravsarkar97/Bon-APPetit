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

public class ActivityChinese extends Activity {
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chinese);
        TextView w = (TextView)findViewById(R.id.textView11);
        TextView w2 = (TextView)findViewById(R.id.textView12);
        Button r = (Button)findViewById(R.id.button5);
        r.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ActivityChinese.this,ActivityOrderNow.class);
                startActivity(intent);
            }

        });
    }
}
