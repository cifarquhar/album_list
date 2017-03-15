package com.codeclan.albumlist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class FavouriteAlbumActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.albums_list);

        AlbumList favouriteAlbums = new AlbumList();
        ArrayList<Album> albumList = favouriteAlbums.getList();

        AlbumAdapter albumAdapter = new AlbumAdapter(this,albumList);

        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(albumAdapter);

    }

    public void rankingClicked(View textView) {
        TextView ranking = (TextView) textView;
        Log.d("User clicked",ranking.getText().toString());
    }

}
