package com.example.thunnathorn.project;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.squareup.picasso.Picasso;


/**
 * Created by Thunnathorn on 24/7/2558.
 */
public class LayoutCladThree extends Activity {
    private Activity context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layoutclass3);


        ImageView knee = (ImageView) findViewById(R.id.picex3);
        ImageView knees = (ImageView) findViewById(R.id.knee);


        
        Glide.with(context)
                .load(R.drawable.knee)
                .asGif()
                .placeholder(R.drawable.knee)
                .crossFade()
                .into(knee);
        Glide.with(context).load("http://nuuneoi.com/image.jpg").into(knees);
    }
}



