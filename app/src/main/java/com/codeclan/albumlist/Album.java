package com.codeclan.albumlist;

/**
 * Created by user on 15/03/2017.
 */

public class Album {

    private Integer ranking;
    private String artist;
    private String title;
    private Integer year;

    public Album(Integer ranking, String artist, String title, Integer year) {
        this.ranking = ranking;
        this.artist = artist;
        this.title = title;
        this.year = year;
    }

    public Integer getRanking() {

        return ranking;
    }

    public String getArtist() {

        return artist;
    }

    public String getTitle() {

        return title;
    }

    public Integer getYear() {

        return year;
    }

}
