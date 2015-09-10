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
        WebViw.loadUrl("http://www.ch7.com/live.html");

    }
}
