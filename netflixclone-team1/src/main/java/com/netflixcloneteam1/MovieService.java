package com.netflixcloneteam1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MovieService {
    @Autowired
    private TMDB_API tmdb_api;
    public MovieDetailView retrieveMovieDetails() {
      Moviedetails moviedetails = tmdb_api.getDetails();
      // filteren op job:director
        MovieDetailView movieDetailView = new MovieDetailView();
        // Director informatie in de View zetten
      return movieDetailView;
    }
}
