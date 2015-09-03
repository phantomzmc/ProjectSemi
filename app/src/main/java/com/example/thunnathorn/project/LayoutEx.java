package com.example.thunnathorn.project;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.ImageView;

/**
 * Created by Thunnathorn on 8/7/2558.
 */
public class LayoutEx extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layoutex);

        ImageView back = (ImageView) findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent add = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(add);
            }
        });

        ImageView IconClassOne = (ImageView) findViewById(R.id.IconClassOne);
        IconClassOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent add = new Intent(getApplicationContext(), LayoutCladOne.class);
                startActivity(add);

            }
        });

        ImageView IconClassTwo = (ImageView) findViewById(R.id.IconClassTwo);
        IconClassTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent add = new Intent(getApplicationContext(), LayoutCladTwo.class);
                startActivity(add);
            }
        });

        ImageView IconClassThree = (ImageView) findViewById(R.id.IconClassThree);
        IconClassThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent add = new Intent(getApplicationContext(), LayoutCladThree.class);
                startActivity(add);
            }

        });
    }
}
