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

public class ActivityDeserts extends Activity {
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_deserts);
        TextView j1 = (TextView)findViewById(R.id.textView15);
        TextView j2 = (TextView)findViewById(R.id.textView16);
        Button r = (Button)findViewById(R.id.button9);
        r.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ActivityDeserts.this,ActivityOrderNow.class);
                startActivity(intent);
            }

        });
    }
}
