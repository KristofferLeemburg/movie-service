package com.netflixcloneteam1.service;

import com.netflixcloneteam1.api.FanArt_API;
import com.netflixcloneteam1.api.TMDB_API;

import com.netflixcloneteam1.dto.MovieDetails;
import com.netflixcloneteam1.dto.movieTrailer.MovieTrailer;
import com.netflixcloneteam1.dto.movieImagesFA.MovieImagesFA;
import com.netflixcloneteam1.dto.moviesByGenres.MoviesByGenre;

import com.netflixcloneteam1.view.movieDetails.MovieDetailsView;
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

//    // get movie details
    public MovieDetailsView getDetails(int id) {
//        // here we should apply some filtering and choose what to return
        String append_to_response = "credits";
        MovieDetails movieDetailsDTO = movieDbApi.getMovieDetails(id, api_keyMD, lang, append_to_response);

        MovieDetailsView movieDetailsView = new MovieDetailsView();
        movieDetailsView.setBackdropPath(movieDetailsDTO.getBackdropPath());
        movieDetailsView.setGenres(movieDetailsDTO.getGenres());

        for (int i = 0; i<movieDetailsDTO.getCredits().getCrew().size(); i++) {
            String job = movieDetailsDTO.getCredits().getCrew().get(i).getJob();
          if (job.equals("Director")) {movieDetailsView.setDirector(movieDetailsDTO.getCredits().getCrew().get(i).getName());}
        }

        movieDetailsView.setId(movieDetailsDTO.getId());
        movieDetailsView.setOverview(movieDetailsDTO.getOverview());
        movieDetailsView.setRuntime(movieDetailsDTO.getRuntime());
        movieDetailsView.setTitle(movieDetailsDTO.getTitle());

//        int movieId = movieDetailsDTO.getId();
//        MovieDetailsView.setTrailer(getMovieTrailer(movieId));

        return movieDetailsView;
    }
    // make a list of logos
    public MovieLogosView getMovieLogo(int movieId) {

        // inside MovieImagesFA we have access to all the images
        MovieImagesFA dtoImagesFA = fanArtApi.getMovieImages(movieId, api_keyFA);

        // instantiate the view object, this class holds the MovieLogos list
        MovieLogosView logosView = new MovieLogosView();
        List<MovieLogos> logoList = new ArrayList<>();

        // access the url in MovieLogos
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
    public String getMovieTrailer(int id){

        MovieTrailer dtoTrailer = movieDbApi.getMovieTrailer(id,api_keyMD,lang);
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
        String sort_by = "vote_count.desc";
        MoviesByGenre movieByGenre = movieDbApi.getMoviesByGenre(api_keyMD, genreId, lang, sort_by, 1);
        MoviesByGenre nextMovieByGenre = movieDbApi.getMoviesByGenre(api_keyMD, genreId, lang, sort_by, 2);

        // view object
        MoviesByGenreView viewObject = new MoviesByGenreView();

        List<Result> newList = new ArrayList<>();

        viewObject.setPage(movieByGenre.getPage());
        viewObject.setTotalPages(movieByGenre.getTotalPages());
        viewObject.setTotalResults(movieByGenre.getTotalResults());

        for (int i = 0; i<movieByGenre.getResults().size(); i++) {

            Result result = new Result();
            result.setId(movieByGenre.getResults().get(i).getId());
            result.setTitle(movieByGenre.getResults().get(i).getTitle());
            result.setOverview(movieByGenre.getResults().get(i).getOverview());
            result.setBackdropPath(movieByGenre.getResults().get(i).getBackdropPath());

            int movieId = movieByGenre.getResults().get(i).getId();

            //add trailer, logo, runtime, Director, genres
            result.setTrailer(getMovieTrailer(movieId));
            result.setMovieLogos(getMovieLogo(movieId));
            result.setRuntime(getDetails(movieId).getRuntime());
            result.setDirector(getDetails(movieId).getDirector());
            result.setGenres(getDetails(movieId).getGenres());

            newList.add(result);
        }

            for (int i = 0; i<nextMovieByGenre.getResults().size(); i++) {

                Result result2 = new Result();
                result2.setId(nextMovieByGenre.getResults().get(i).getId());
                result2.setTitle(nextMovieByGenre.getResults().get(i).getTitle());
                result2.setOverview(nextMovieByGenre.getResults().get(i).getOverview());
                result2.setBackdropPath(nextMovieByGenre.getResults().get(i).getBackdropPath());

                int movieId = nextMovieByGenre.getResults().get(i).getId();

                //add trailer, logo, runtime, Director, genres
                result2.setTrailer(getMovieTrailer(movieId));
                result2.setMovieLogos(getMovieLogo(movieId));
                result2.setRuntime(getDetails(movieId).getRuntime());
                result2.setDirector(getDetails(movieId).getDirector());
                result2.setGenres(getDetails(movieId).getGenres());

                newList.add(result2);

        }

        viewObject.setResults(newList);
        return viewObject;
    }
}
