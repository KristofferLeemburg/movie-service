
package com.netflixcloneteam1.dto;

import java.util.List;

public class Result {
    private String backdropPath;
    private List<Integer> genreIds = null;
    private Integer id;
    private String overview;
    private String title;

    private Boolean adult;
    private String originalLanguage;
    private String originalTitle;
    private Float popularity;
    private String posterPath;
    private String releaseDate;
    private Boolean video;
    private Float voteAverage;
    private Integer voteCount;

    public String getBackdropPath() {
        return backdropPath;
    }

    public void setBackdropPath(String backdropPath) {
        this.backdropPath = backdropPath;
    }

    public List<Integer> getGenreIds() {
        return genreIds;
    }

    public void setGenreIds(List<Integer> genreIds) {
        this.genreIds = genreIds;
    }

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

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
