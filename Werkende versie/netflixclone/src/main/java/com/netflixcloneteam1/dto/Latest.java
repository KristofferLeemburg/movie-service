
package com.netflixcloneteam1.dto;

import java.util.List;

public class Latest {

    private Object backdropPath;
    private List<Object> genres = null;
    private Integer id;
    private String overview;
    private Integer runtime;
    private String title;
//    private Object belongsToCollection;
//    private Integer budget;
//    private String homepage;
//    private Object imdbId;
//    private String originalLanguage;
//    private String originalTitle;
//    private Float popularity;
//    private Object posterPath;
//    private List<Object> productionCompanies = null;
//    private List<Object> productionCountries = null;
//    private String releaseDate;
//    private Integer revenue;
//    private List<Object> spokenLanguages = null;
//    private String status;
//    private String tagline;
//    private Boolean video;
//    private Float voteAverage;
//    private Integer voteCount;

    public Object getBackdropPath() {
        return backdropPath;
    }

    public void setBackdropPath(Object backdropPath) {
        this.backdropPath = backdropPath;
    }

    public List<Object> getGenres() {
        return genres;
    }

    public void setGenres(List<Object> genres) {
        this.genres = genres;
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
