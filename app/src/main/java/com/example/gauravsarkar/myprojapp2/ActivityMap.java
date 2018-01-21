package com.example.gauravsarkar.myprojapp2;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;

public class ActivityMap extends Activity {
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map);
        WebView wv = (WebView)findViewById(R.id.web);
        wv.loadUrl("file:///android_asset/gmap.html");
    }
}