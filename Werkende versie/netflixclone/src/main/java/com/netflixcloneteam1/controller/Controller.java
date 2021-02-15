package com.netflixcloneteam1.controller;

import com.netflixcloneteam1.api.FanArt_API;
import com.netflixcloneteam1.api.TMDB_API;
import com.netflixcloneteam1.dto.*;

import com.netflixcloneteam1.dto.movieImagesFA.MovieImagesFA;
import com.netflixcloneteam1.service.MovieService;

import com.netflixcloneteam1.view.moviesByGenreView.MoviesByGenreView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@CrossOrigin(origins = {"http://localhost:3000" , "http://localhost:3000/film"})
@RestController
public class Controller {

    @Autowired
    private MovieService movieService;

    @Autowired
    private TMDB_API tmdb_api;

    @Autowired
    private FanArt_API fanArt_api;

    @GetMapping("/movies/latest")
    public Latest getLatest() {
       return tmdb_api.getLatest();
    }

    // Get images from FanArt
    @GetMapping("/movies/images/{id}")
    public MovieImagesFA getMovieImages(@PathVariable int id){
        System.out.println(" ---> Movie images request from frontend");
        return movieService.getMovieImages(id);
    }

    @GetMapping("/movies/trailer/{id}")
    public String getMovieTrailer(@PathVariable int id) {
        System.out.println(" ---> Movie trailer request with movie id: " + id);
        return movieService.getMovieTrailer(id);
    }

//     movie details based on movie id
//    @GetMapping("/movies/details/{id}")
//    public MovieDetailsView getMovieDetails(@PathVariable int id) {
//        System.out.println(" ---> Movie details request with movie id: " + id);
//        return movieService.getDetails(id);
//    }

    // get movies based on genre id
    @GetMapping("/movies/genre/{genreId}")
    public MoviesByGenreView getMoviesByGenre(@PathVariable String genreId){
        System.out.println(" ---> Movies genre with id:"+ genreId +" requested from frontend");
        return movieService.getMoviesByGenre(genreId);
    }

    @GetMapping("/movies/discover/80s")
    public List<Result> get80s()
    {
        MovieDiscover movieDiscover = tmdb_api.get80s(1);
        MovieDiscover nextMovieDiscover = tmdb_api.get80s(movieDiscover.getPage()+1);
        List<Result> movies = new ArrayList<Result>(movieDiscover.getResults());
        movies.addAll(nextMovieDiscover.getResults());
        return movies;
    }

    @GetMapping("/movies/discover/90s")
    public List<Result> get90s()
    {
        MovieDiscover movieDiscover = tmdb_api.get90s(1);
        MovieDiscover nextMovieDiscover = tmdb_api.get90s(movieDiscover.getPage()+1);
        List<Result> movies = new ArrayList<Result>(movieDiscover.getResults());
        movies.addAll(nextMovieDiscover.getResults());
        return movies;
    }

    @GetMapping("/movies/discover/00s")
    public List<Result> get00s()
    {
        MovieDiscover movieDiscover = tmdb_api.get00s(1);
        MovieDiscover nextMovieDiscover = tmdb_api.get00s(movieDiscover.getPage()+1);
        List<Result> movies = new ArrayList<Result>(movieDiscover.getResults());
        movies.addAll(nextMovieDiscover.getResults());
        return movies;
    }

    @GetMapping("/movies/discover/disney")
    public List<Result> getDisney()
    {
        MovieDiscover movieDiscover = tmdb_api.getDisney(1);
        MovieDiscover nextMovieDiscover = tmdb_api.getDisney(movieDiscover.getPage()+1);
        List<Result> movies = new ArrayList<Result>(movieDiscover.getResults());
        movies.addAll(nextMovieDiscover.getResults());
        return movies;
    }

    @GetMapping("/movies/discover/johnnydepp")
    public List<Result> getJohnnyDepp()
    {
        MovieDiscover movieDiscover = tmdb_api.getJohnnyDepp(1);
        MovieDiscover nextMovieDiscover = tmdb_api.getJohnnyDepp(movieDiscover.getPage()+1);
        List<Result> movies = new ArrayList<Result>(movieDiscover.getResults());
        movies.addAll(nextMovieDiscover.getResults());
        return movies;
    }

    @GetMapping("/movies/discover/caricevanhouten")
    public List<Result> getCariceVanHouten()
    {
        MovieDiscover movieDiscover = tmdb_api.getCariceVanHouten(1);
        MovieDiscover nextMovieDiscover = tmdb_api.getCariceVanHouten(movieDiscover.getPage()+1);
        List<Result> movies = new ArrayList<Result>(movieDiscover.getResults());
        movies.addAll(nextMovieDiscover.getResults());
        return movies;
    }

    @GetMapping("/movies/discover/charlottegainsbourgh")
    public List<Result> getCharlotteGainbourgh()
    {
        MovieDiscover movieDiscover = tmdb_api.getCharlotteGainbourgh(1);
        MovieDiscover nextMovieDiscover = tmdb_api.getCharlotteGainbourgh(movieDiscover.getPage()+1);
        List<Result> movies = new ArrayList<Result>(movieDiscover.getResults());
        movies.addAll(nextMovieDiscover.getResults());
        return movies;
    }
}
