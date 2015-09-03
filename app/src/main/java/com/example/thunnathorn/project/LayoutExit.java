package com.example.thunnathorn.project;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.widget.ImageView;


public class LayoutExit extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layoutmusic);

        ImageView button = (ImageView) findViewById(R.id.exit);

        final AlertDialog.Builder dialog = new AlertDialog.Builder(this);
        dialog.setTitle("Are You Sure? Want to Quit?");
        dialog.setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Intent add = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(add);
            }
        });
        dialog.setNegativeButton(android.R.string.no, null);
        dialog.show();
    }
}



