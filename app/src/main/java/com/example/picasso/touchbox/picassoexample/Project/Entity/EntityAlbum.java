package com.example.picasso.touchbox.picassoexample.Project.Entity;

/**
 * Created by VinnY on 14/02/2015.
 */
public class EntityAlbum {
    private long id;
    private String name;
    private String linkAlbumCover;
    private String artistAlbum;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLinkAlbumCover() {
        return linkAlbumCover;
    }

    public void setLinkAlbumCover(String linkAlbumCover) {
        this.linkAlbumCover = linkAlbumCover;
    }

    public String getArtistAlbum() {
        return artistAlbum;
    }

    public void setArtistAlbum(String artistAlbum) {
        this.artistAlbum = artistAlbum;
    }
}
