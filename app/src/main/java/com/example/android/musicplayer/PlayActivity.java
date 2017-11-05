package com.example.android.musicplayer;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class PlayActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play);

        TextView titleTextView = (TextView) findViewById(R.id.play_activity_song_title);
        TextView artistTextView = (TextView) findViewById(R.id.play_activity_song_artist);

        titleTextView.setText(MainActivity.currentSong.getSong().getTitle());
        artistTextView.setText(MainActivity.currentSong.getSong().getArtist());
    }
}
