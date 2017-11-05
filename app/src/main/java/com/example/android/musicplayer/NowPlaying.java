package com.example.android.musicplayer;

import android.widget.LinearLayout;

public class NowPlaying {

    LinearLayout linearLayout;
    String isPlaying;
    Song currentSong;

    public NowPlaying(LinearLayout linearLayout, String isPlaying, Song currentSong) {
        this.linearLayout = linearLayout;
        this.isPlaying = isPlaying;
        this.currentSong = currentSong;
    }

}
