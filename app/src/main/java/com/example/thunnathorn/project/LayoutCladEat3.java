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
        WebViw.getSettings().setUseWideViewPort(true);
        WebViw.getSettings().setLoadWithOverviewMode(true);
        WebViw.getSettings().setSupportZoom(true);
        WebViw.getSettings().setBuiltInZoomControls(true);
        WebViw.getSettings().setDisplayZoomControls(false);

        WebViw.loadUrl("http://www.yourhealthyguide.com/index.htm");
    }
}
