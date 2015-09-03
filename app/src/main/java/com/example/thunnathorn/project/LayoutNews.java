package com.example.thunnathorn.project;

import android.app.ActionBar;
import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.webkit.WebView;


public class LayoutNews extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layoutnews);



        WebView WebViw = (WebView) findViewById(R.id.webViewnews);
        WebViw.getSettings().setJavaScriptEnabled(true);
        WebViw.loadUrl("http://www.thairath.co.th/home");
    }

}