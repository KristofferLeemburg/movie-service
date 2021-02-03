package com.netflixcloneteam1.service;

import com.netflixcloneteam1.api.FanArt_API;
import com.netflixcloneteam1.api.TMDB_API;
import com.netflixcloneteam1.controller.MovieController;
import com.netflixcloneteam1.dto.Genre;
import com.netflixcloneteam1.dto.MovieDetails;
import com.netflixcloneteam1.view.LogoView;
import com.netflixcloneteam1.view.MovieDetailsView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MovieService {

    @Value("${tmdb.api_key}")
    private String api_key;

    @Value("${fnrt.api_key}")
    private String api_keyFA;

    @Autowired
    private FanArt_API fanArt_api;
    // bij Elmer: FanArtApi fanArtApi
    @Autowired
    private TMDB_API tmdb_api;
//    @Autowired
//    private MovieController controller;

    private final String lang = "en-US";
    private final String include_adult = "false";
    private final String videosAndCredits = "videos,credits";

    // fanart logo
    public LogoView getLogo(int id) {
        MovieLogo movieLogo = fanArt_api.getMovieLogo(id, api_keyFA);
        LogoView logoView = newLogoView();
//        List<Logos> logosList = new ArrayList<>();
//        Logos logos = new Logos();
        return logoView;
    }
    // Single movie requests
    public MovieDetailsView getMovieDetails(int id) {
        MovieDetails movieDetails = tmdb_api.getMovieDetails(id, tmdbApi);
        MovieDetailsView movieDetailsView = new MovieDetailsView();

        movieDetailsView.setId(movieDetails.getId());
        movieDetailsView.setTitle(movieDetails.getTitle());
        movieDetailsView.setOverview(movieDetails.getOverview());
        movieDetailsView.setBackdropPath(movieDetails.getBackdropPath());
        movieDetailsView.setRuntime(movieDetails.getRuntime());

        List<Genre> newGenreList = new ArrayList<>();

        for (int i = 0; i < movieDetails.getGenres().size(); i++) {
            Genre genresViewDetailList = new Genre();
            genresViewDetailList.setId(movieDetails.getGenres().get(i).getId());
            genresViewDetailList.setName(movieDetails.getGenres().get(i).getName());
            newGenreList.add(genresViewDetailList);
        }
        movieDetailsView.setGenres(newGenreList);

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
        return movieDetailsView;
    }
}
