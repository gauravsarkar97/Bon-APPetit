package com.example.gauravsarkar.myprojapp2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class ActivityIndian extends Activity {
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_indian);
        TextView tt2 = (TextView)findViewById(R.id.textView7);
        TextView tt = (TextView)findViewById(R.id.textView6);
        Button bb = (Button)findViewById(R.id.go);
        bb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ActivityIndian.this,ActivityOrderNow.class);
                startActivity(intent);
            }

        });
    }
}
