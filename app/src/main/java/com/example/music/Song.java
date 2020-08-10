package com.example.music;

public class Song {


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtists() {
        return artists;
    }

    public void setArtists(String artists) {
        this.artists = artists;
    }

    public String getCoverImage() {
        return coverImage;
    }

    public void setCoverImage(String coverImage) {
        this.coverImage = coverImage;
    }

    public String getSongUrl() {
        return songUrl;
    }

    public void setSongUrl(String songUrl) {
        this.songUrl = songUrl;
    }

    private String title;
    private String artists;
    private String coverImage;
    private String songUrl;


    public Song() {
        this.title = title;
        this.artists = artists;
        this.coverImage = coverImage;
        this.songUrl = songUrl;
    }




}
