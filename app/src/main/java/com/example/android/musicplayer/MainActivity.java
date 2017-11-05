package com.example.android.musicplayer;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.LinearLayout;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private static NowPlaying currentSong;

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

        currentSong = new NowPlaying((LinearLayout) findViewById(R.id.now_playing), false, null);
    }
}
