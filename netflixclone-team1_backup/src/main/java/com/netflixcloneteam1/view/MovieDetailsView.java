package com.netflixcloneteam1.view;

import com.netflixcloneteam1.dto.Genre;
import com.netflixcloneteam1.dto.*;

import java.util.List;

public class MovieDetailsView {
    private Integer id;
    private String title;
    private String overview;
    private Integer runtime;
    private String backdropPath;
    private List<Genre> genres;
    private String youtubeKey;
    private String logo;
    private String director;

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
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
    public String getYoutubeKey() {
        return youtubeKey;
    }
    public void setYoutubeKey(Result youtubeKey) {
        this.youtubeKey = youtubeKey.getKey();
    }
    public String getLogo() {
        return logo;
    }
    public void setLogo(String logo) {
        this.logo = logo;
    }
    public String getDirector() {
        return director;
    }
    public void setDirector(Credits credits) {
        this.director = credits.getDirector();
    }
}
