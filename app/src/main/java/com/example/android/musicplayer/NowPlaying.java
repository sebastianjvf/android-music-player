package com.example.android.musicplayer;

import android.widget.LinearLayout;

public class NowPlaying {

    LinearLayout linearLayout;
    boolean isPlaying;
    Song song;

    public NowPlaying(LinearLayout linearLayout, boolean isPlaying, Song song) {
        this.linearLayout = linearLayout;
        this.isPlaying = isPlaying;
        this.song = song;
    }

}
