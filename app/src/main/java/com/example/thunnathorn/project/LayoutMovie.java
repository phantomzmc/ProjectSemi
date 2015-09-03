package com.example.thunnathorn.project;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.webkit.WebView;

public class LayoutMovie extends Activity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layoutmovie);

        WebView WebViw = (WebView) findViewById(R.id.webview);
        WebViw.getSettings().setJavaScriptEnabled(true);
        WebViw.loadUrl("http://www.doolakorntv.com/lakorn/1/%E0%B8%94%E0%B8%B9%E0%B8%A5%E0%B8%B0%E0%B8%84%E0%B8%A3%E0%B8%A2%E0%B9%89%E0%B8%AD%E0%B8%99%E0%B8%AB%E0%B8%A5%E0%B8%B1%E0%B8%87%E0%B8%97%E0%B8%B1%E0%B9%89%E0%B8%87%E0%B8%AB%E0%B8%A1%E0%B8%94.html");

    }
}
