package com.example.thunnathorn.project;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;


public class MainActivity extends Activity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ImageView eat = (ImageView) findViewById(R.id.eat);
        ImageView ex = (ImageView) findViewById(R.id.ex);
        ImageView mon = (ImageView) findViewById(R.id.mon);
        ImageView news = (ImageView) findViewById(R.id.news);

        ImageView movie = (ImageView) findViewById(R.id.movie);

        eat.setOnClickListener(new View.OnClickListener() {
        public void onClick(View view) {
                Intent add = new Intent(getApplicationContext(), LayoutEat.class);
                startActivity(add);
            }
        });

        ex.setOnClickListener(new View.OnClickListener() {
            public void onClick(View View) {
                Intent add = new Intent(getApplicationContext(), LayoutEx.class);
                startActivity(add);
            }
        });

        mon.setOnClickListener(new View.OnClickListener() {
            public void onClick(View View) {
                Intent add = new Intent(getApplicationContext(), LayoutMon.class);
                startActivity(add);
            }
        });

        news.setOnClickListener(new View.OnClickListener() {
            public void onClick(View View) {
                Intent add = new Intent(getApplicationContext(), LayoutNews.class);
                startActivity(add);
            }
        });


        movie.setOnClickListener(new View.OnClickListener() {
            public void onClick(View View) {
                Intent add = new Intent(getApplication(), LayoutMovie.class);
                startActivity(add);
            }
        });

        ImageView exit = (ImageView) findViewById(R.id.exit);
        exit.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                final AlertDialog.Builder dialog = new AlertDialog.Builder(MainActivity.this);
                dialog.setTitle("คุณต้องการออกจากแอปพลิเคชั่นใช่หรือไม่ ??");
                dialog.setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        finish();
                    }
                });
                dialog.setNegativeButton(android.R.string.no, null);
                dialog.show();
            }
            public boolean onCreateOptionsMenu(Menu menu){
                getMenuInflater().inflate(R.menu.menu_main, menu);
                return true;

            }
        });



    }
}



