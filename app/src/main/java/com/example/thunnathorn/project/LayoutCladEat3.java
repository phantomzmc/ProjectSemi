package com.example.thunnathorn.project;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.ImageView;

/**
 * Created by Thunnathorn on 28/8/2558.
 */
public class LayoutCladEat3 extends Activity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layouteating3);

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