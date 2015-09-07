package com.example.thunnathorn.project;

import android.app.Activity;
import android.content.Context;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

/**
 * Created by Thunnathorn on 7/9/2558.
 */
public class Tabmon2 extends Activity {

    MediaPlayer mpEffect;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layoutmon2);

        ImageView b21 =(ImageView) findViewById(R.id.b21);
        ImageView b22 =(ImageView) findViewById(R.id.b22);
        ImageView b23 =(ImageView) findViewById(R.id.b23);

        Picasso.with(this).load(R.drawable.b21).into(b21);
        Picasso.with(this).load(R.drawable.b22).into(b22);
        Picasso.with(this).load(R.drawable.b23).into(b23);

        ImageView buttonSound = (ImageView) findViewById(R.id.b21);
        buttonSound.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                playSound(Tabmon2.this, R.raw.a201 );
            }
        });
        ImageView buttonSound1 = (ImageView) findViewById(R.id.b22);
        buttonSound1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playSound(Tabmon2.this, R.raw.a302 );
            }
        });
        ImageView buttonSound2 = (ImageView) findViewById(R.id.b23);
        buttonSound2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                playSound(Tabmon2.this, R.raw.a304) ;
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
