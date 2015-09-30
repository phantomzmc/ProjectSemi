package com.example.thunnathorn.project;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;

/**
 * Created by Thunnathorn on 10/9/2558.
 */
public class Movie3 extends Activity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layoutmovie3);

        WebView webView =(WebView) findViewById(R.id.webview);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.loadUrl("http://www.lakornhit.com/group/68/%E0%B8%A5%E0%B8%B0%E0%B8%84%E0%B8%A3%E0%B8%8A%E0%B9%88%E0%B8%AD%E0%B8%87-8.html");
    }

}
