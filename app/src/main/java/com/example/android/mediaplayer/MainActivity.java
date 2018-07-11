package com.example.android.mediaplayer;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.io.IOException;

public class MainActivity extends AppCompatActivity {

    Button play, pause;
    MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        play = findViewById(R.id.btnPlayId);
        mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.color_black);

        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

               mediaPlayer.start();

                mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        Toast.makeText(MainActivity.this, "I'm done!!", Toast.LENGTH_LONG).show();
                    }
                });
            }
        });

        pause = findViewById(R.id.btnPauseId);
        pause.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mediaPlayer.pause();
            }
        });
    }



}
