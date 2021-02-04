package com.netflixcloneteam1.service;

import com.netflixcloneteam1.api.FanArt_API;
import com.netflixcloneteam1.api.TMDB_API;
import com.netflixcloneteam1.dto.movieImagesFA.MovieImagesFA;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;


@Service
public class MovieService {

    private final String lang = "en-US";
    private final String include_adult = "false";
    private final String with_original_language = "en";
    private final String include_video = "true";
    private final String append_to_response = "credits";

    @Value("${tmdb.api_key}")
    private String api_keyMD;

    @Value("${fnrt.api_key}")
    private String api_keyFA;


    @Autowired
    private TMDB_API movieDbApi;

    @Autowired
    private FanArt_API fanArtApi;

    public MovieImagesFA getMovieImages(int id) {

        return fanArtApi.getMovieImages(id, api_keyFA);
    }

}
