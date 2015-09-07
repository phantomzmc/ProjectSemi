package com.example.thunnathorn.project;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

/**
 * Created by Thunnathorn on 17/7/2558.
 */
public class LayoutCladOne extends Activity {
    private Activity context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layoutclass1);

        ImageView back= (ImageView) findViewById(R.id.back);
        ImageView picdata1 = (ImageView) findViewById(R.id.picdataOne);
        back.setOnClickListener(new View.OnClickListener() {

            public void onClick(View View) {
                Intent add = new Intent(getApplicationContext(), LayoutEx.class);
                startActivity(add);
            }


        });
        Glide.with(context).load("http://www.siamhealth.net/public_html/images/rheumato/squat1.gif").into(picdata1);


    }
}
