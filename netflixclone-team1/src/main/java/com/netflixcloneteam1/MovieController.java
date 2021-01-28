package com.netflixcloneteam1;

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
//    public Latestdto getLatestdto() {
//       return tmdb_api.getLatest();
//    }

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
