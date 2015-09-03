package com.example.thunnathorn.project;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class LayoutCladEat1 extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layouteating1);

    ImageView back = (ImageView) findViewById(R.id.backeat1);
        back.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent add = new Intent(getApplicationContext(), LayoutEat.class);
                startActivity(add);
            }
        });
    }

}