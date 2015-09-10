package com.example.thunnathorn.project;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.webkit.WebView;
import android.widget.ImageView;

/**
 * Created by Thunnathorn on 28/8/2558.
 */
public class LayoutCladEat2 extends Activity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layouteating2);


        WebView WebViw = (WebView) findViewById(R.id.webVieweat2);
        WebViw.getSettings().setJavaScriptEnabled(true);
        WebViw.getSettings().setUseWideViewPort(true);
        WebViw.getSettings().setLoadWithOverviewMode(true);
        WebViw.getSettings().setSupportZoom(true);
        WebViw.getSettings().setBuiltInZoomControls(true);
        WebViw.getSettings().setDisplayZoomControls(false);
        WebViw.loadUrl("http://library.cmu.ac.th/ntic/lannafood/classify_food.php");
    }
}
