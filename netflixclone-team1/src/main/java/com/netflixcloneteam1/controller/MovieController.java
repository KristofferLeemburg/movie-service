package com.netflixcloneteam1.controller;

import com.netflixcloneteam1.feignclient.TMDB_API;
import com.netflixcloneteam1.model.MovieTrailer;
import com.netflixcloneteam1.view.MovieDetailView;
import com.netflixcloneteam1.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class MovieController {

@Autowired
private MovieService movieService;
//    @GetMapping("/movies/latest")
//    public Latest getLatest() {
//       return tmdb_api.getLatest();
//    }
//    @Autowired
//    private TMDB_API tmdb_api;
//    @GetMapping("/movies/trailer")
//    public MovieTrailer getMovieTrailer() {
//        return tmdb_api.getVideo();
//    }
    
    @GetMapping("/movies/details")
    public MovieDetailView getDetails() {
        return movieService.retrieveMovieDetails();
    }

//    @Autowired
//    private FanArt_API fanArt_api;
//
//    @GetMapping("/movies/logo")
//    public Logo getLogo() {
//        return fanArt_api.getLogo();
//    }
}
