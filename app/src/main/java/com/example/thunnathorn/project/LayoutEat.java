package com.example.thunnathorn.project;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.ImageView;


public class LayoutEat extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layouteat);

        ImageView back= (ImageView) findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent add = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(add);
            }


        });
        ImageView beakFood1 = (ImageView) findViewById(R.id.beakFood);
        beakFood1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent add = new Intent(getApplicationContext(), LayoutCladEat1.class);
                startActivity(add);
            }
        });
        ImageView FastFood = (ImageView) findViewById(R.id.fastFood);
        FastFood.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent add = new Intent(getApplicationContext(), LayoutCladEat2.class);
                startActivity(add);
            }
        });

        ImageView goodFood = (ImageView) findViewById(R.id.goodfood);
        goodFood.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent add = new Intent(getApplicationContext(), LayoutCladEat3.class);
                startActivity(add);
            }
        });




    }


}

