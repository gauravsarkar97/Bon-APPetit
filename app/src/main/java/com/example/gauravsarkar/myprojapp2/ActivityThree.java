package com.example.gauravsarkar.myprojapp2;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by Gaurav Sarkar on 12/13/2017.
 */

public class ActivityThree extends Activity{
    Button bu;
    EditText username,pass;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_three);
        EditText username = (EditText) findViewById(R.id.edt);
        EditText pass = (EditText) findViewById(R.id.editText);
        Button bu = (Button) findViewById(R.id.b);
//        bu.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent = new Intent(ActivityThree.this, ActivityFour.class);
//                startActivity(intent);
//                Toast.makeText(ActivityThree.this, "Login Successful", Toast.LENGTH_SHORT).show();
//            }
//
//        });
        bu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ActivityThree.this,ActivityFour.class);
                startActivity(intent);
                Toast.makeText(ActivityThree.this, "Login Successful", Toast.LENGTH_SHORT).show();
            }

        });
    }
    }
