package com.example.thunnathorn.project;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.res.Configuration;
import android.graphics.Typeface;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.MediaController;
import android.widget.TextView;
import android.widget.VideoView;

/**
 * Created by Thunnathorn on 8/9/2558.
 */
public class LayoutEx1 extends Activity {


    public VideoView video;
    public VideoView video2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layoutex1);


        Uri uri = Uri.parse("android.resource://" + this.getPackageName() + "/" + R.raw.vdo1);

        MediaController mediacontroller = new MediaController(this);

        final VideoView video = (VideoView) this.findViewById(R.id.vdo1);

        video.setMediaController(mediacontroller);
        video.setVideoURI(uri);
        video.requestFocus();


        ImageView buttonStart = (ImageView) findViewById(R.id.buttonStart);
        buttonStart.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                video.start();
            }
        });
        Uri uri2 = Uri.parse("android.resource://" + this.getPackageName() + "/" + R.raw.vdo2);
        MediaController mediacontrollerII = new MediaController(this);
        final VideoView video2 = (VideoView) this.findViewById(R.id.vdo2);

        video2.setMediaController(mediacontrollerII);
        video2.setVideoURI(uri2);
        video2.requestFocus();
        ImageView buttonStart2 = (ImageView) findViewById(R.id.buttonStart2);
        buttonStart.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                video2.start();
            }
        });
    }

}




