package com.example.gauravsarkar.myprojapp2;

import android.Manifest;
import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.ActivityCompat;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class ActivityOrderNow extends Activity {
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ordernow);
        TextView v1 = (TextView)findViewById(R.id.ttt);
        TextView v2 = (TextView)findViewById(R.id.textView8);
        TextView v3 = (TextView)findViewById(R.id.textView9);
        TextView v4 = (TextView)findViewById(R.id.textView10);
        Button n2 = (Button)findViewById(R.id.button6);
        Button n = (Button)findViewById(R.id.call);
        Button n3 = (Button)findViewById(R.id.button7);
        n.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent call = new Intent(Intent.ACTION_CALL);
                call.setData(Uri.parse("tel:+9612341659"));
                if (ActivityCompat.checkSelfPermission(ActivityOrderNow.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    return;
                }
                startActivity(call);
                Toast.makeText(ActivityOrderNow.this, "Just a sec", Toast.LENGTH_SHORT).show();
            }
        });
        n2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               Intent it = new Intent(ActivityOrderNow.this,ActivityMap.class);
               startActivity(it);
                Toast.makeText(ActivityOrderNow.this, "Just a sec", Toast.LENGTH_SHORT).show();
        }
    });
        n3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
              Intent i = new Intent(ActivityOrderNow.this,ActivityRate.class);
              startActivity(i);
            }
        });
}
}