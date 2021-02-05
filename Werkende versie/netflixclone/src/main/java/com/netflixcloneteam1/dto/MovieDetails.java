
package com.netflixcloneteam1.dto;


import java.io.Serializable;
import java.util.List;

public class MovieDetails implements Serializable
{

    private String backdropPath;
    private List<Genre> genres = null;

    // credits is getting the full cast and crew
    private Credits credits;

    private Integer id;
    private String overview;
    private Integer runtime;
    private String title;


    public String getBackdropPath() {
        return backdropPath;
    }

    public void setBackdropPath(String backdropPath) {
        this.backdropPath = backdropPath;
    }

    public List<Genre> getGenres() {
        return genres;
    }

    public void setGenres(List<Genre> genres) {
        this.genres = genres;
    }


    public Credits getCredits() { return credits; }

    public void setCredits(Credits credits) { this.credits = credits; }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOverview() {
        return overview;
    }

    public void setOverview(String overview) {
        this.overview = overview;
    }

    public Integer getRuntime() {
        return runtime;
    }

    public void setRuntime(Integer runtime) {
        this.runtime = runtime;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
