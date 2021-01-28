
package com.netflixcloneteam1.model;

import java.util.List;

public class Logo {
    private String name;
    private List<HdMovieLogo> hdmovielogo = null;
    private List<MovieBackground> moviebackground = null;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<HdMovieLogo> getHdmovielogo() {
        return hdmovielogo;
    }

    public void setHdmovielogo(List<HdMovieLogo> hdmovielogo) {
        this.hdmovielogo = hdmovielogo;
    }

    public List<MovieBackground> getMoviebackground() {
        return moviebackground;
    }

    public void setMoviebackground(List<MovieBackground> moviebackground) {
        this.moviebackground = moviebackground;
    }
}
