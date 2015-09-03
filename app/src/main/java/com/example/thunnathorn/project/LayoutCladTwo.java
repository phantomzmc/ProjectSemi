package com.example.thunnathorn.project;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.ImageView;

/**
 * Created by Thunnathorn on 17/7/2558.
 */
public class LayoutCladTwo extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layoutclass2);

        ImageView back= (ImageView) findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {

            public void onClick(View View) {
                Intent add = new Intent(getApplicationContext(), LayoutEx.class);
                startActivity(add);
            }


        });
    }
}
