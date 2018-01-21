package com.example.gauravsarkar.myprojapp2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        ImageView imageView=(ImageView)findViewById(R.id.imageView2);
        TextView tv = (TextView)findViewById(R.id.txtview);
        TextView tv2 = (TextView)findViewById(R.id.textView3);
        TextView tv3 = (TextView)findViewById(R.id.textView4);
        TextView tv4 = (TextView)findViewById(R.id.textView5);
        Button b1 = (Button)findViewById(R.id.button);
        Button b2 = (Button)findViewById(R.id.button2);
        Button b3 = (Button)findViewById(R.id.button3);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,ActivityTwo.class);
                startActivity(intent);
                Toast.makeText(MainActivity.this, "Just a sec", Toast.LENGTH_SHORT).show();
            }

        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,ActivityThree.class);
                startActivity(intent);
                Toast.makeText(MainActivity.this, "Enter Username & Password", Toast.LENGTH_SHORT).show();
            }

        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Register to get Discount", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivity.this,ActivityFour.class);
                startActivity(intent);
            }

        });
    }
}
