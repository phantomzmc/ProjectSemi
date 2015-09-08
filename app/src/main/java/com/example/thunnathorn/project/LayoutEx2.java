package com.example.thunnathorn.project;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;

/**
 * Created by Thunnathorn on 8/9/2558.
 */
public class LayoutEx2 extends Activity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layoutex2);


        WebView WebViw = (WebView) findViewById(R.id.viewex2);
        WebViw.getSettings().setJavaScriptEnabled(true);
        WebViw.loadUrl("http://dopah.anamai.moph.go.th/");
    }

}
