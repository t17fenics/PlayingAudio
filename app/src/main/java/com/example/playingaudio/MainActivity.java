package com.example.playingaudio;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;

public class MainActivity extends AppCompatActivity {
    MediaPlayer mediaPlayer;
    Button playButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.stuff);
        playButton = (Button)findViewById(R.id.playButton);
        mediaPlayer.start();
    }

    public void play(View view) {
        if(playButton.getText().toString().equals("Play")) {
            mediaPlayer.pause();
            playButton.setText("Pause");
        } else if(playButton.getText().toString().equals("Pause")){
            playButton.setText("Play");
            mediaPlayer.start();
        }
    }


}
