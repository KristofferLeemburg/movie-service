package com.netflixcloneteam1.service;

import com.netflixcloneteam1.view.MovieDetailView;
import com.netflixcloneteam1.feignclient.TMDB_API;
import com.netflixcloneteam1.model.MovieDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MovieService {

    @Autowired
    private TMDB_API tmdb_api;
    public MovieDetailView retrieveMovieDetails() {
      MovieDetails movieDetails = tmdb_api.getDetails();

        List<Genre> newGenreList = new ArrayList<>();

        for (int i = 0; i < movieDetails.getGenres().size(); i++) {

            Genre genresViewDetailList = new Genre();
            genresViewDetailList.setId(movieDetails.getGenres().get(i).getId());
            genresViewDetailList.setName(movieDetails.getGenres().get(i).getName());
            newGenreList.add(genresViewDetailList);
        }

        movieDetailView.setGenres(newGenreList);

        // filteren op job:director
        for (int i = 0; i < movieDetails.getCredits().getCrew().size(); i++) {

            if (movieDetails.getCredits().getCrew().get(i).job.equals("Director")) {

                movieDetailsView.setDirector(movieDetails.getCredits().getCrew().get(i).getName());
                System.out.println(movieDetails.getCredits().getCrew().get(i).getName());
            }
            MovieDetailView movieDetailView = new MovieDetailView();
            movieDetailView.setDirector(movieDetailsView.getDirector());
            movieDetailView.setTite(movieDetails.getTitle());
            movieDetailView.setRuntime(movieDetails.getRuntime());
            movieDetailView.setBackdropPath(movieDetails.getBackdropPath());
            movieDetailView.setId(movieDetails.getId());
        }
      return movieDetailView;
    }
}
