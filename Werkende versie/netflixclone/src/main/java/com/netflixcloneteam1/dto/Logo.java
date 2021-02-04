
package com.netflixcloneteam1.dto;

import java.util.List;

public class Logo {

    private String name;
    private List<HdMovieLogo> hdMovieLogo = null;
//    private String tmdbId;
//    private String imdbId;
//    private List<Hdmovieclearart> hdmovieclearart = null;
//    private List<Moviedisc> moviedisc = null;
//    private List<Moviebanner> moviebanner = null;
//    private List<Moviethumb> moviethumb = null;
//    private List<Movieart> movieart = null;
//    private List<Movielogo> movielogo = null;
//    private List<Movieposter> movieposter = null;
//    private List<MovieBackground> moviebackground = null;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<HdMovieLogo> getHdMovieLogo() {
        return hdMovieLogo;
    }

    public void setHdMovieLogo(List<HdMovieLogo> hdMovieLogo) {
        this.hdMovieLogo = hdMovieLogo;
    }
}
