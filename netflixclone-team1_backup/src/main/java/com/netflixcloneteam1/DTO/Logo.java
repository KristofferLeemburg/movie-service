
package com.netflixcloneteam1.dto;

import java.util.List;

public class Logo {

    private String name;
//    private String tmdbId;
//    private String imdbId;
    private List<HdMovieLogo> hdmovielogo = null;
//    private List<Hdmovieclearart> hdmovieclearart = null;
//    private List<Moviedisc> moviedisc = null;
//    private List<Moviebanner> moviebanner = null;
//    private List<Moviethumb> moviethumb = null;
//    private List<Movieart> movieart = null;
//    private List<Movielogo> movielogo = null;
//    private List<Movieposter> movieposter = null;
    private List<MovieBackground> moviebackground = null;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

//    public String getTmdbId() {
//        return tmdbId;
//    }
//
//    public void setTmdbId(String tmdbId) {
//        this.tmdbId = tmdbId;
//    }

//    public String getImdbId() {
//        return imdbId;
//    }
//
//    public void setImdbId(String imdbId) {
//        this.imdbId = imdbId;
//    }

    public List<HdMovieLogo> getHdmovielogo() {
        return hdmovielogo;
    }

    public void setHdmovielogo(List<HdMovieLogo> hdmovielogo) {
        this.hdmovielogo = hdmovielogo;
    }

//    public List<Hdmovieclearart> getHdmovieclearart() {
//        return hdmovieclearart;
//    }
//
//    public void setHdmovieclearart(List<Hdmovieclearart> hdmovieclearart) {
//        this.hdmovieclearart = hdmovieclearart;
//    }

//    public List<Moviedisc> getMoviedisc() {
//        return moviedisc;
//    }
//
//    public void setMoviedisc(List<Moviedisc> moviedisc) {
//        this.moviedisc = moviedisc;
//    }
//
//    public List<Moviebanner> getMoviebanner() {
//        return moviebanner;
//    }
//
//    public void setMoviebanner(List<Moviebanner> moviebanner) {
//        this.moviebanner = moviebanner;
//    }
//
//    public List<Moviethumb> getMoviethumb() {
//        return moviethumb;
//    }
//
//    public void setMoviethumb(List<Moviethumb> moviethumb) {
//        this.moviethumb = moviethumb;
//    }
//
//    public List<Movieart> getMovieart() {
//        return movieart;
//    }
//
//    public void setMovieart(List<Movieart> movieart) {
//        this.movieart = movieart;
//    }

//    public List<Movielogo> getMovielogo() {
//        return movielogo;
//    }
//
//    public void setMovielogo(List<Movielogo> movielogo) {
//        this.movielogo = movielogo;
//    }

//    public List<Movieposter> getMovieposter() {
//        return movieposter;
//    }
//
//    public void setMovieposter(List<Movieposter> movieposter) {
//        this.movieposter = movieposter;
//    }

    public List<MovieBackground> getMoviebackground() {
        return moviebackground;
    }

    public void setMoviebackground(List<MovieBackground> moviebackground) {
        this.moviebackground = moviebackground;
    }

}
