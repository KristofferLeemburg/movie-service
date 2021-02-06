package com.netflixcloneteam1.service;

import com.netflixcloneteam1.api.FanArt_API;
import com.netflixcloneteam1.api.TMDB_API;
import com.netflixcloneteam1.dto.MovieDetails;

import com.netflixcloneteam1.dto.movieTrailer.MovieTrailer;

import com.netflixcloneteam1.dto.movieImagesFA.MovieImagesFA;
import com.netflixcloneteam1.dto.moviesByGenres.MoviesByGenre;

import com.netflixcloneteam1.view.movieImagesFaView.MovieLogos;
import com.netflixcloneteam1.view.movieImagesFaView.MovieLogosView;
import com.netflixcloneteam1.view.movieTrailerView.MovieTrailerView;
import com.netflixcloneteam1.view.moviesByGenreView.MoviesByGenreView;
import com.netflixcloneteam1.view.moviesByGenreView.Result;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


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


    // get images
    public MovieImagesFA getMovieImages(int id) {

        return fanArtApi.getMovieImages(id, api_keyFA);
    }


    // get movie details
    public MovieDetails getDetails(int id) {

        // here we should apply some filtering and choose what to return
        return movieDbApi.getMovieDetails(id, api_keyMD, lang, include_video, append_to_response);
    }

    // make a list of logos
    public MovieLogosView getMovieLogo(int movieId) {

        MovieImagesFA dtoImagesFA = fanArtApi.getMovieImages(movieId, api_keyFA);

        MovieLogosView logosView = new MovieLogosView();
        List<MovieLogos> logoList = new ArrayList<>();
        MovieLogos movielogos = new MovieLogos();

        if (dtoImagesFA.getMovielogo() != null && dtoImagesFA.getMovielogo().size() != 0 && dtoImagesFA.getMovielogo().get(0).getLang().equals("en")) {
            movielogos.setUrl(dtoImagesFA.getMovielogo().get(0).getUrl());
        } else {
            movielogos.setUrl("no (English) logo available");
        }


        if (dtoImagesFA.getHdmovielogo() != null && dtoImagesFA.getHdmovielogo().size() != 0 && dtoImagesFA.getHdmovielogo().get(0).getLang().equals("en")) {
                movielogos.setUrlHd(dtoImagesFA.getHdmovielogo().get(0).getUrl());
            } else {
                movielogos.setUrlHd("no (English) HD logo available");
            }

        logoList.add(movielogos);
        logosView.setMovielogos(logoList);
        return logosView;
    }

    // get the trailers
    public String getMovieTrailer(int movieId){

        MovieTrailer dtoTrailer = movieDbApi.getMovieTrailer(movieId,api_keyMD,lang);
        MovieTrailerView trailerView = new MovieTrailerView();

        if (dtoTrailer.getResults() == null || dtoTrailer.getResults().size() == 0){
            trailerView.setYoutubeId("not available");

        }
        else {
            trailerView.setYoutubeId(dtoTrailer.getResults().get(0).getKey());
        }


        return trailerView.getYoutubeId();
    }

    // movies by genre id with trailer and logos included
    public MoviesByGenreView getMoviesByGenre(String genreId) {

        // model object
        MoviesByGenre dtoObject = movieDbApi.getMoviesByGenre(api_keyMD, genreId);
        // view object
        MoviesByGenreView viewObject = new MoviesByGenreView();

        List<Result> newList = new ArrayList<>();

        viewObject.setPage(dtoObject.getPage());
        viewObject.setTotalPages(dtoObject.getTotalPages());
        viewObject.setTotalResults(dtoObject.getTotalResults());

        for (int i = 0; i<dtoObject.getResults().size(); i++) {

            Result result = new Result();
            result.setId(dtoObject.getResults().get(i).getId());
            result.setTitle(dtoObject.getResults().get(i).getTitle());
            result.setOriginalTitle(dtoObject.getResults().get(i).getOriginalTitle());
            result.setOverview(dtoObject.getResults().get(i).getOverview());
            result.setReleaseDate(dtoObject.getResults().get(i).getReleaseDate());
            result.setOriginalLanguage(dtoObject.getResults().get(i).getOriginalLanguage());
            result.setBackdropPath(dtoObject.getResults().get(i).getBackdropPath());
            result.setPosterPath(dtoObject.getResults().get(i).getPosterPath());

            int movieId = dtoObject.getResults().get(i).getId();

            //add trailer and logo
            result.setTrailer(getMovieTrailer(movieId));
            result.setMovieLogos(getMovieLogo(movieId));


            newList.add(result);

        }

        viewObject.setResults(newList);
        return viewObject;
    }
}
