package com.netflixcloneteam1.view;
import com.netflixcloneteam1.dto.*;
import java.util.List;

public class LogoView {

    public String name;
    public List<HdMovieLogo> hdMovieLogo = null;
    public List<MovieBackground> movieBackground = null;

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

    public List<MovieBackground> getMovieBackground() {
        return movieBackground;
    }

    public void setMovieBackground(List<MovieBackground> movieBackground) {
        this.movieBackground = movieBackground;
    }

}
