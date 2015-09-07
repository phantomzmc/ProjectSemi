package com.example.thunnathorn.project;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.LinearLayout;

/**
 * Created by Thunnathorn on 5/9/2558.
 */
public class Tab3 extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layouteating3);

        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.tabeat3);
        linearLayout.setBackgroundColor(Color.parseColor("#ffffff"));
    }
}

