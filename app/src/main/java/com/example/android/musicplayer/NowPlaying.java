package com.example.android.musicplayer;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

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
     *
     * @return
     */
    public Context getContext() {
        return linearLayout.getContext();
    }

    /**
     * Plays the current song. Sets the image to play.
     */
    public void play() {
        isPlaying = true;
        ((ImageView) linearLayout.findViewById(R.id.play_pause_image_view)).setImageResource(R.drawable.ic_pause_circle_filled_24dp);
    }

    /**
     * Pauses the current song. Sets the image to pause.
     */
    public void pause() {
        isPlaying = false;
        ((ImageView) linearLayout.findViewById(R.id.play_pause_image_view)).setImageResource(R.drawable.ic_play_circle_filled_24dp);
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
     *
     * @return
     */
    public Song getSong() {
        return song;
    }

    /**
     * Sets and updates the TextViews in the current song.
     *
     * @return
     */
    public void setSong(Song song) {
        // Update the current song
        this.song = song;

        // Set the TextViews to show the current song
        ((TextView) linearLayout.findViewById(R.id.song_title)).setText(this.song.getTitle());
        ((TextView) linearLayout.findViewById(R.id.song_artist)).setText(this.song.getArtist());
    }

    /**
     * Returns true if a song is playing and false if not.
     * @return
     */
    public boolean isPlaying() {
        return isPlaying;
    }
}
