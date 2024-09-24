package com.example.thunnathorn.project;

import android.app.Activity;
import android.app.LocalActivityManager;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TabHost;

/**
 * Created by Thunnathorn on 7/9/2558.
 */
public class Tab_movie extends Activity{
    LocalActivityManager mLocalActivityManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tabmovie);
        mLocalActivityManager = new LocalActivityManager(this, false);
        mLocalActivityManager.dispatchCreate(savedInstanceState);

        TabHost tabHost = (TabHost) findViewById(R.id.tabhost);
        tabHost.setup(mLocalActivityManager);

        TabHost.TabSpec tabSpec = tabHost.newTabSpec("tab1")
                .setIndicator("ช่อง 7")
                .setContent(new Intent(this, LayoutMovie.class));
        TabHost.TabSpec tabSpec2 = tabHost.newTabSpec("tab2")
                .setIndicator("ช่อง 8")
                .setContent(new Intent(this, Movie2.class));
        TabHost.TabSpec tabSpec3 = tabHost.newTabSpec("tab3")
                .setIndicator("ช่อง 3")
                .setContent(new Intent(this, Movie3.class));
        TabHost.TabSpec tabSpec4 = tabHost.newTabSpec("tab4")
                .setIndicator("ช่อง ONE")
                .setContent(new Intent(this, Movie4.class));

        tabHost.addTab(tabSpec);
        tabHost.addTab(tabSpec2);
        tabHost.addTab(tabSpec3);
        tabHost.addTab(tabSpec4);
    }

    @Override
    protected void onPause() {
        super.onPause();
        mLocalActivityManager.dispatchPause(!isFinishing());

    }

    @Override
    protected void onResume() {
        super.onResume();
        mLocalActivityManager.dispatchResume();
    }
}

