package com.netflixcloneteam1.dto.movieImagesFA;

import java.util.List;

public class Logo {

    private String name;
    private String tmdbId;
    private String imdbId;
    private List<Hdmovielogo> hdmovielogo;


    public String getName() { return name; }

    public void setName(String name) {
        this.name = name;
    }

    public String getTmdbId() {
        return tmdbId;
    }

    public void setTmdbId(String tmdbId) {
        this.tmdbId = tmdbId;
    }

    public String getImdbId() {
        return imdbId;
    }

    public void setImdbId(String imdbId) {
        this.imdbId = imdbId;
    }

    public List<Hdmovielogo> getHdmovielogo() {
        return hdmovielogo;
    }

    public void setHdmovielogo(List<Hdmovielogo> hdmovielogo) {
        this.hdmovielogo = hdmovielogo;
    }
}
