package com.example.android.musicplayer;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    public static NowPlaying nowPlaying;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Song data
        ArrayList<Song> songList = new ArrayList<Song>();
        songList.add(new Song("Title #1", "Artist"));
        songList.add(new Song("Title #2", "Artist"));
        songList.add(new Song("Title #3", "Artist"));
        songList.add(new Song("Title #4", "Artist"));
        songList.add(new Song("Title #6", "Artist"));
        songList.add(new Song("Title #7", "Artist"));
        songList.add(new Song("Title #8", "Artist"));
        songList.add(new Song("Title #9", "Artist"));
        songList.add(new Song("Title #10", "Artist"));

        // Attach adapter
        SongAdapter songAdapter = new SongAdapter(this, songList);
        ListView listView = (ListView) findViewById(R.id.song_list);
        listView.setAdapter(songAdapter);

        // Instantiate the currentSong and hide it
        nowPlaying = new NowPlaying((LinearLayout) findViewById(R.id.now_playing), false, null);
        nowPlaying.hide();

        // Add onClickListener to the now_playing box
        ((LinearLayout) findViewById(R.id.now_playing)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), PlayActivity.class);
                startActivity(intent);
            }
        });

        // Add onClickListener to the playPauseImageView
        ((ImageView) findViewById(R.id.play_pause_image_view)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(nowPlaying.isPlaying()) {
                    nowPlaying.pause();
                } else {
                    nowPlaying.play();
                }
            }
        });
    }
}
