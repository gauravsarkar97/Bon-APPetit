package com.example.gauravsarkar.myprojapp2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class ActivityFour extends Activity  implements AdapterView.OnItemClickListener{
    Button bt;
    TextView tt1, tt2;
    Spinner s;
    Intent intent;
    String SpinnerValue;

    String[] countries = new String[]{"Select Cuisine","Indian", "Chinese", "Continental", "Deserts"};

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_four);
        bt = findViewById(R.id.button4);
        tt1 = findViewById(R.id.textView);
        tt2 = findViewById(R.id.textView2);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ActivityFour.this, ActivityTwo.class);
                startActivity(intent);
                Toast.makeText(ActivityFour.this, "Just a sec", Toast.LENGTH_SHORT).show();
            }

        });
        ImageView imageView = (ImageView) findViewById(R.id.imageView);
        s = (Spinner) findViewById(R.id.spnr);
        ArrayAdapter <String> adapter = new ArrayAdapter <String>(this, android.R.layout.simple_dropdown_item_1line, countries);
        s.setAdapter(adapter);
        AdapterView.OnItemSelectedListener countrySelectedListener = new AdapterView.OnItemSelectedListener() {
            public void onItemSelected(AdapterView <?> spinner, View container,
                                      int position, long id) {
               SpinnerValue = (String)s.getSelectedItem();
                    //final Intent intent;
                   switch (SpinnerValue){
                       case "Indian":
                           intent = new Intent(ActivityFour.this, ActivityIndian.class);
                            startActivity(intent);
                           break;
                        case "Chinese":
                            intent = new Intent(ActivityFour.this,ActivityChinese.class);
                            startActivity(intent);
                            break;
                        case "Continental":
                            intent = new Intent(ActivityFour.this,ActivityContinental.class);
                            startActivity(intent);
                           break;
                        case "Deserts":
                            intent = new Intent(ActivityFour.this,ActivityDeserts.class);
                            startActivity(intent);
                            break;
                    }
                 //startActivity(intent);
            }
            public void onNothingSelected(AdapterView <?> arg0) {
                // TODO Auto-generated method stub
            }
        };
        s.setOnItemSelectedListener(countrySelectedListener);
    }

    @Override
    public void onItemClick(AdapterView <?> parent, View view, int position, long id) {

    }
    }
