package com.example.thunnathorn.project;

import android.app.Activity;
import android.content.Context;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

import java.security.AccessControlContext;

/**
 * Created by Thunnathorn on 7/9/2558.
 */
public class Tabmon3 extends Activity {

    MediaPlayer mpEffect;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layoutmon3);

        ImageView b31 = (ImageView) findViewById(R.id.b31);
        ImageView b32 = (ImageView) findViewById(R.id.b32);
        ImageView b33 = (ImageView) findViewById(R.id.b33);
        ImageView b34 = (ImageView) findViewById(R.id.b34);

        Picasso.with(this).load(R.drawable.b31).into(b31);
        Picasso.with(this).load(R.drawable.b32).into(b32);
        Picasso.with(this).load(R.drawable.b33).into(b33);
        Picasso.with(this).load(R.drawable.b34).into(b34);

        ImageView buttonSound = (ImageView) findViewById(R.id.b31);
        buttonSound.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                playSound(Tabmon3.this, R.raw.a204);
            }
        });
        ImageView buttonSound1 = (ImageView) findViewById(R.id.b32);
        buttonSound1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playSound(Tabmon3.this, R.raw.a205);
            }
        });
        ImageView buttonSound2 = (ImageView) findViewById(R.id.b33);
        buttonSound2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                playSound(Tabmon3.this, R.raw.a206) ;
            }
        });
        ImageView buttonSound3 = (ImageView) findViewById(R.id.b34);
        buttonSound3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                playSound(Tabmon3.this, R.raw.a207) ;
            }
        });
        ImageView pause = (ImageView) findViewById(R.id.pause);
        Picasso.with(this).load(R.drawable.pause).into(pause);
        pause.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                mpEffect.pause();

            }
        });

        ImageView play = (ImageView) findViewById(R.id.play);
        Picasso.with(this).load(R.drawable.play).into(play);
        play.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                mpEffect.start();

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

    private void stopIfPlating() {
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

