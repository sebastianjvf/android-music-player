package com.example.android.musicplayer;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

public class SongAdapter extends ArrayAdapter<Song> {

    public SongAdapter(@NonNull Context context, @NonNull List<Song> objects) {
        super(context, 0, objects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        // View that is passed from the ListView to the ArrayAdapter to be recycled, as it is out of view
        View listItemView = convertView;

        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.song_list_item, null, false);
        }

        // Get the item at the given position
        final Song song = getItem(position);

        // Populate the item
        TextView songTitle = listItemView.findViewById(R.id.song_title);
        songTitle.setText(song.getTitle());

        TextView songArtist = listItemView.findViewById(R.id.song_artist);
        songArtist.setText(song.getArtist());

        return listItemView;
    }
}
