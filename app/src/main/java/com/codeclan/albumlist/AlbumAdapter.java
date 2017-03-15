package com.codeclan.albumlist;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import static com.codeclan.albumlist.R.id.artist;

/**
 * Created by user on 15/03/2017.
 */

public class AlbumAdapter extends ArrayAdapter<Album>{

    public AlbumAdapter(Context context, ArrayList<Album> albums){
        super(context,0,albums);

    }

    @Override
    public View getView(int position, View listItemView, ViewGroup parent){

        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.album_item,parent,false);
        }

        Album currentAlbum = getItem(position);

        TextView ranking = (TextView) listItemView.findViewById(R.id.ranking);
        ranking.setText(currentAlbum.getRanking().toString());

        TextView artist = (TextView) listItemView.findViewById(R.id.artist);
        artist.setText(currentAlbum.getArtist());

        TextView title = (TextView) listItemView.findViewById(R.id.title);
        title.setText(currentAlbum.getTitle());

        TextView year = (TextView) listItemView.findViewById(R.id.year);
        year.setText(currentAlbum.getYear().toString());

        return listItemView;
    }
}
