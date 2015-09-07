package com.example.thunnathorn.project;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;


public class LayoutMon extends Activity {
    MediaPlayer mpEffect;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layoutmon);

        ImageView b1 = (ImageView) findViewById(R.id.b1);
        ImageView b2 = (ImageView) findViewById(R.id.b2);
        ImageView b3 = (ImageView) findViewById(R.id.b3);


        Picasso.with(this).load(R.drawable.b1).into(b1);
        Picasso.with(this).load(R.drawable.b2).into(b2);
        Picasso.with(this).load(R.drawable.b3).into(b3);

        ImageView buttonSound = (ImageView) findViewById(R.id.b1);
        buttonSound.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                playSound(LayoutMon.this, R.raw.a201);
            }
        });
        ImageView buttonSound1 = (ImageView) findViewById(R.id.b2);
        buttonSound1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playSound(LayoutMon.this, R.raw.a202);
            }
        });
        ImageView buttonSound2 = (ImageView) findViewById(R.id.b3);
        buttonSound2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                playSound(LayoutMon.this, R.raw.a203);
            }
        });


        ImageView back = (ImageView) findViewById(R.id.back);
        Picasso.with(this).load(R.drawable.backicon).into(back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final AlertDialog.Builder dialog = new AlertDialog.Builder(LayoutMon.this);
                dialog.setTitle("ต้องการกลับไปหน้าเมนูใช่หรือไม่ ?");
                dialog.setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Intent add = new Intent(getApplication(), MainActivity.class);

                        startActivity(add);
                    }
                });

                dialog.setNegativeButton(android.R.string.no, null);
                dialog.show();
            }
        });
    }

    public void onStop() {
        super.onStop();
        stopIfPlating();
    }

    public void playSound(Context context, int resId) {
        stopIfPlating();
        mpEffect = MediaPlayer.create(context, resId);
        mpEffect.start();
        mpEffect.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            public void onCompletion(MediaPlayer mp) {
                mp.release();
            }
        });
    }

    public void stopIfPlating() {
        try {
            if (mpEffect != null && mpEffect.isPlaying()) {
                mpEffect.stop();
                mpEffect.release();
            }
        } catch (IllegalStateException e) {
            e.printStackTrace();
        }
    }
}



