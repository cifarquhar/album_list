package com.codeclan.albumlist;

import java.util.ArrayList;

/**
 * Created by user on 15/03/2017.
 */

public class AlbumList {

    private ArrayList<Album> albumList;

    public AlbumList(){
        albumList = new ArrayList<Album>();
        albumList.add(new Album(1,"R.E.M","Out of Time",1991));
        albumList.add(new Album(2,"Queen","A Night at the Opera",1975));
        albumList.add(new Album(3,"The Beatles","Revolver",1966));
        albumList.add(new Album(4,"Led Zeppelin", "Led Zeppelin", 1969));
        albumList.add(new Album(5,"Nirvana","Nevermind",1991));
        albumList.add(new Album(6,"Foo Fighters","Sonic Highways",2015));
        albumList.add(new Album(7,"U2","Achtung Baby",1992));
        albumList.add(new Album(8,"David Bowie","Hunky Dory",1971));
        albumList.add(new Album(9,"Stevie Ray Vaughan","Texas Flood",1983));
        albumList.add(new Album(10,"Oasis","Definitely Maybe",1994));

    }

    public ArrayList<Album> getList() {

        return new ArrayList<Album>(albumList);
    }
}
