package com.example.thunnathorn.project;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.LinearLayout;

/**
 * Created by Thunnathorn on 5/9/2558.
 */
public class Tab2 extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layouteating2);

        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.tabeat2);
        linearLayout.setBackgroundColor(Color.parseColor("#ffffff"));
    }
}

