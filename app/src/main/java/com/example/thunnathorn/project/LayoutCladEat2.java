package com.example.thunnathorn.project;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AlertDialog;
import android.util.Log;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.Toast;

/**
 * Created by Thunnathorn on 28/8/2558.
 */
public class LayoutCladEat2 extends Activity {
    private ProgressBar progressBar;
    private WebView WebViw;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layouteating2);
        progressBar = (ProgressBar) findViewById(R.id.process);
        progressBar.setMax(100);
        getWindow().setFeatureInt(Window.FEATURE_PROGRESS, Window.PROGRESS_VISIBILITY_ON);

        WebView WebViw = (WebView) findViewById(R.id.webVieweat2);
        WebViw.getSettings().setJavaScriptEnabled(true);
        WebViw.getSettings().setUseWideViewPort(true);
        WebViw.getSettings().setLoadWithOverviewMode(true);
        WebViw.getSettings().setSupportZoom(true);
        WebViw.getSettings().setBuiltInZoomControls(true);
        WebViw.getSettings().setDisplayZoomControls(false);
        WebViw.loadUrl("http://library.cmu.ac.th/ntic/lannafood/classify_food.php");

        final Activity MyActivity = this;
        WebViw.setWebChromeClient(new WebChromeClient() {
            public void onProgressChanged(WebView view, int progress) {
                MyActivity.setTitle("Loading...");
                MyActivity.setProgress(progress * 100);

                // Return the app name after finish loading
                if (progress == 100)
                    MyActivity.setTitle(R.string.app_name);
            }
        });
    }
}



