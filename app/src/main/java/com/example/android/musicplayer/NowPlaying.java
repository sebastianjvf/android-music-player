package com.example.android.musicplayer;

import android.widget.LinearLayout;

public class NowPlaying {

    private LinearLayout linearLayout;
    private boolean isPlaying;
    private Song song;

    public NowPlaying(LinearLayout linearLayout, boolean isPlaying, Song song) {
        this.linearLayout = linearLayout;
        this.isPlaying = isPlaying;
        this.song = song;
    }

    public LinearLayout getLinearLayout() {
        return linearLayout;
    }

    public boolean isPlaying() {
        return isPlaying;
    }

    public void setPlaying(boolean playing) {
        isPlaying = playing;
    }

    public Song getSong() {
        return song;
    }

    public void setSong(Song song) {
        this.song = song;
    }
}
