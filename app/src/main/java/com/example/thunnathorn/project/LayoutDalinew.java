package com.example.thunnathorn.project;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;

/**
 * Created by Thunnathorn on 7/9/2558.
 */
public class LayoutDalinew extends Activity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layoutdalinews);


        WebView WebViw = (WebView) findViewById(R.id.webViewdalinews);
        WebViw.getSettings().setJavaScriptEnabled(true);
        WebViw.loadUrl("http://www.dailynews.co.th/");
    }
}
