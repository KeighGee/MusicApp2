package com.example.admin.musicalapp;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;


import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button play = (Button) findViewById(R.id.button_play);
        Button pause = (Button) findViewById(R.id.button_pause);
        Button stop = (Button) findViewById(R.id.button_stop);
        Button next = (Button) findViewById(R.id.button_next);
        Button previous = (Button) findViewById(R.id.button_previous);

        final MediaPlayer mp = MediaPlayer.create(MainActivity.this, R.raw.coldplay_a_sky_full_of_stars);
        final MediaPlayer mb = MediaPlayer.create(MainActivity.this, R.raw.coldplay_fix_you);
        final MediaPlayer mh = MediaPlayer.create(MainActivity.this, R.raw.coldplay_paradise);
        final MediaPlayer ml = MediaPlayer.create(MainActivity.this, R.raw.coldplay_the_scientist);
        final MediaPlayer mt = MediaPlayer.create(MainActivity.this, R.raw.onerepublic_secrets);
        final MediaPlayer mf = MediaPlayer.create(MainActivity.this, R.raw.the_script_breakeven);
        final MediaPlayer md = MediaPlayer.create(MainActivity.this, R.raw.the_script_no_good_in_goodbye);
        final MediaPlayer mn = MediaPlayer.create(MainActivity.this, R.raw.the_script_nothing);
        final MediaPlayer mm = MediaPlayer.create(MainActivity.this, R.raw.the_script_six_degrees_of_separation);
        final MediaPlayer mo = MediaPlayer.create(MainActivity.this, R.raw.the_script_superheroes);


        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                mp.start();
            }
        });


        pause.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                mp.pause();
            }
        });

        next.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View arg0) {
                // get current song position
                int currentPosition = mp.getCurrentPosition();
                // check if seekForward time is lesser than song duration
                if(currentPosition <= mp.getDuration()){
                    // forward song
                    mb.seekTo(currentPosition);
                }else{
                    // forward to end position
                    mp.seekTo(mb.getDuration());
                }
            }
        });

        stop.setOnClickListener (new View.OnClickListener(){
            @Override
            public void onClick(View v){
                mp.stop();
                MainActivity.this.finish();
            }
        });


        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                mb.start();

            }
        });

        pause.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                mb.pause();
            }
        });



        previous.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                mb.start();
            }
        });

        stop.setOnClickListener (new View.OnClickListener(){
            @Override
            public void onClick(View v){
                mb.stop();
                MainActivity.this.finish();
            }
        });


        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                mh.start();
            }
        });

        pause.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                mh.pause();
            }
        });

        next.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                ml.start();
            }
        });


        stop.setOnClickListener (new View.OnClickListener(){
            @Override
            public void onClick(View v){
                mh.stop();
                MainActivity.this.finish();
            }
        });


        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                ml.start();
            }
        });

        pause.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                ml.pause();
            }
        });

        next.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                mt.start();
            }
        });


        stop.setOnClickListener (new View.OnClickListener(){
            @Override
            public void onClick(View v){
                ml.stop();
                MainActivity.this.finish();
            }
        });


        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                mt.start();
            }
        });

        pause.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                mt.pause();
            }
        });

        next.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                mf.start();
            }
        });


        stop.setOnClickListener (new View.OnClickListener(){
            @Override
            public void onClick(View v){
                mt.stop();
                MainActivity.this.finish();
            }
        });



        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                mf.start();
            }
        });

        pause.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                mf.pause();
            }
        });

        next.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                md.start();
            }
        });


        stop.setOnClickListener (new View.OnClickListener(){
            @Override
            public void onClick(View v){
                mf.stop();
                MainActivity.this.finish();
            }
        });


        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                md.start();
            }
        });

        pause.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                md.pause();
            }
        });

        next.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                mn.start();
            }
        });


        stop.setOnClickListener (new View.OnClickListener(){
            @Override
            public void onClick(View v){
                md.stop();
                MainActivity.this.finish();
            }
        });


        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                mn.start();
            }
        });

        pause.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                mn.pause();
            }
        });

        next.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                mm.start();
            }
        });


        stop.setOnClickListener (new View.OnClickListener(){
            @Override
            public void onClick(View v){
                mn.stop();
                MainActivity.this.finish();
            }
        });


        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                mm.start();
            }
        });

        pause.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                mm.pause();
            }
        });

        next.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                mo.start();
            }
        });


        stop.setOnClickListener (new View.OnClickListener(){
            @Override
            public void onClick(View v){
                mm.stop();
                MainActivity.this.finish();
            }
        });


        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                mo.start();
            }
        });

        pause.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                mo.pause();
            }
        });


        stop.setOnClickListener (new View.OnClickListener(){
            @Override
            public void onClick(View v){
                mo.stop();
                MainActivity.this.finish();
            }
        });


    }


}


