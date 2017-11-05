package com.example.android.musicplayer;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class PlayActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play);

        TextView titleTextView = (TextView) findViewById(R.id.play_activity_song_title);
        TextView artistTextView = (TextView) findViewById(R.id.play_activity_song_artist);

        titleTextView.setText(MainActivity.nowPlaying.getSong().getTitle());
        artistTextView.setText(MainActivity.nowPlaying.getSong().getArtist());

        final ImageView playPauseImageView = (ImageView) findViewById(R.id.play_pause_image_view);

        if (MainActivity.nowPlaying.isPlaying()) {
            playPauseImageView.setImageResource(R.drawable.ic_pause_circle_filled_24dp);
        } else {
            playPauseImageView.setImageResource(R.drawable.ic_play_circle_filled_24dp);
        }

        playPauseImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(MainActivity.nowPlaying.isPlaying()) {
                    MainActivity.nowPlaying.pause();
                    playPauseImageView.setImageResource(R.drawable.ic_play_circle_filled_24dp);
                } else {
                    MainActivity.nowPlaying.play();
                    playPauseImageView.setImageResource(R.drawable.ic_pause_circle_filled_24dp);
                }
            }
        });

    }
}
