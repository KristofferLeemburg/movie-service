
package com.netflixcloneteam1.dto;

// import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.List;

public class MovieDetails implements Serializable
{
//    @JsonProperty("backdrop_path")
    private String backdropPath;
//    private Object belongsToCollection;
    private List<Genre> genres = null;
//    private String homepage;
    private Integer id;
    private String overview;
//    private String releaseDate;
    private Integer runtime;
    private String title;
//    private Videos videos;
    private Credits credits;
    private final static long serialVersionUID = 1303507716553349424L;

    public String getBackdropPath() {
        return backdropPath;
    }

    public void setBackdropPath(String backdropPath) {
        this.backdropPath = backdropPath;
    }

//    public Object getBelongsToCollection() {
//        return belongsToCollection;
//    }
//
//    public void setBelongsToCollection(Object belongsToCollection) {
//        this.belongsToCollection = belongsToCollection;
//    }
//
    public List<Genre> getGenres() {
        return genres;
    }

    public void setGenres(List<Genre> genres) {
        this.genres = genres;
    }

//    public String getHomepage() {
//        return homepage;
//    }
//
//    public void setHomepage(String homepage) {
//        this.homepage = homepage;
//    }

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

//    public String getReleaseDate() {
//        return releaseDate;
//    }
//
//    public void setReleaseDate(String releaseDate) {
//        this.releaseDate = releaseDate;
//    }

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

//    public Videos getVideos() {
//        return videos;
//    }
//
//    public void setVideos(Videos videos) {
//        this.videos = videos;
//    }

    public Credits getCredits() {
        return credits;
    }

    public void setCredits(Credits credits) {
        this.credits = credits;
    }

}
