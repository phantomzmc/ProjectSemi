package com.example.thunnathorn.project;


import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;

/**
 * Created by Thunnathorn on 28/8/2558.
 */
public class LayoutCladEat3 extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layouteating3);

        WebView WebViw = (WebView) findViewById(R.id.vieweat);
        WebViw.getSettings().setJavaScriptEnabled(true);


        WebViw.loadUrl("http://www.ihealth24.com/category/%E0%B8%AA%E0%B8%B8%E0%B8%82%E0%B8%A0%E0%B8%B2%E0%B8%9E%E0%B8%81%E0%B8%B2%E0%B8%A3%E0%B8%81%E0%B8%B4%E0%B8%99/");
    }
}
