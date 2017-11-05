package com.example.android.musicplayer;

import android.content.Context;
import android.view.View;
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

    /**
     * Returns the current context of the current song box.
     * @return
     */
    public Context getContext() {
        return linearLayout.getContext();
    }

    /**
     * Plays the current song.
     */
    public void play() {
        isPlaying = true;
    }

    /**
     * Pauses the current song.
     */
    public void pause() {
        isPlaying = false;
    }

    /**
     * Hides the current song box.
     */
    public void hide() {
        linearLayout.setVisibility(View.GONE);
    }

    /**
     * Hides the current song box.
     */
    public void show() {
        linearLayout.setVisibility(View.VISIBLE);
    }

    /**
     * Retrieves the current song.
     * @return
     */
    public Song getSong() {
        return song;
    }

    /**
     * Sets the current song.
     * @return
     */
    public void setSong(Song song) {
        this.song = song;
    }
}
