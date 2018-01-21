package com.example.gauravsarkar.myprojapp2;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

/**
 * Created by Gaurav Sarkar on 12/13/2017.
 */

public class ActivityTwo extends Activity implements View.OnClickListener {
    EditText Name, pass, confirm;
    Button btnAdd;
    SQLiteDatabase dbs;
    ImageView im;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two);
        Name = (EditText) findViewById(R.id.editText);
        pass = (EditText) findViewById(R.id.editText2);
        confirm = (EditText) findViewById(R.id.editText3);
        btnAdd = (Button) findViewById(R.id.button);
//        WebView wv = (WebView) findViewById(R.id.web);
//        wv.loadUrl("file:///android_asset/student_regis.html");
        btnAdd.setOnClickListener(this);
        dbs = openOrCreateDatabase("UserDB", Context.MODE_PRIVATE, null);
        dbs.execSQL("CREATE TABLE IF NOT EXISTS student(rollno VARCHAR,name VARCHAR,marks VARCHAR);");
        im=(ImageView)findViewById(R.id.imageView4);
    }

    @Override
    public void onClick(View view) {
        if (view == btnAdd) {
            if (Name.getText().toString().trim().length() == 0 ||
                    pass.getText().toString().trim().length() == 0 ||
                    confirm.getText().toString().trim().length() == 0) {
                showMessage("Error", "Please enter all values");
                return;
            }
            dbs.execSQL("INSERT INTO student VALUES('" + Name.getText() + "','" + pass.getText() +
                    "','" + confirm.getText() + "');");
            showMessage("Success", "Registered");
            clearText();
            Intent intent = new Intent(ActivityTwo.this,ActivityFour.class);
            startActivity(intent);
            Toast.makeText(ActivityTwo.this, "Thank You for Registering ", Toast.LENGTH_SHORT).show();
        }
    }

    private void clearText() {
        Name.setText("");
        pass.setText("");
        confirm.setText("");
        Name.requestFocus();
    }

    private void showMessage(String title, String s) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setCancelable(true);
        builder.setTitle(title);
        builder.setMessage(s);
        builder.show();
    }
}
