package com.diogopinto.mediaplayer;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private MediaPlayer mediaPlayer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.bach);

    }

    public void executarSom(View view){
        if (mediaPlayer != null){
            mediaPlayer.start();
        }
    }

    public void pausarMusica(View view){
        if (mediaPlayer.isPlaying()){
            mediaPlayer.pause();
        }
    }

    public void pararMusica(View view){
        if(mediaPlayer.isPlaying()){
            mediaPlayer.stop();
            mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.teste);
        }

    }
}
