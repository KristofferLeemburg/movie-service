package com.netflixcloneteam1.controller;

import com.netflixcloneteam1.api.FanArt_API;
import com.netflixcloneteam1.api.TMDB_API;
import com.netflixcloneteam1.dto.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class Controller {

    @Autowired
    private TMDB_API tmdb_api;

    // Opdracht van Kim Sing: maak 1 endpoint: /movies/discover en laat frontend bepalen of ie disney of johnnydepp
    // of etc wil fetchen vanuit movies

    @GetMapping("/movies/latest")
    public Latest getLatest() {
       return tmdb_api.getLatest();
    }

    @GetMapping("/movies/details")
    public MovieDetails getMovieDetails() {
        return tmdb_api.getDetails();
    }

    @GetMapping("/movies/trailer")
    public MovieTrailer getMovieTrailer() {
        return tmdb_api.getVideo();
    }

    @GetMapping("/movies/genre/action")
    public List<Result> getAction()
    {
        MovieGenre movieGenre = tmdb_api.getAction(1);
        MovieGenre nextMovieGenre = tmdb_api.getAction(movieGenre.getPage()+1);
        List<Result> movies = new ArrayList<Result>(movieGenre.getResults());
        movies.addAll(nextMovieGenre.getResults());
        return movies;
    }

    @GetMapping("/movies/genre/comedy")
    public List<Result> getComedy()
    {
        MovieGenre movieGenre = tmdb_api.getComedy(1);
        MovieGenre nextMovieGenre = tmdb_api.getComedy(movieGenre.getPage()+1);
        List<Result> movies = new ArrayList<Result>(movieGenre.getResults());
        movies.addAll(nextMovieGenre.getResults());
        return movies;
    }

    @GetMapping("/movies/genre/thriller")
    public List<Result> getThriller()
    {
        MovieGenre movieGenre = tmdb_api.getThriller(1);
        MovieGenre nextMovieGenre = tmdb_api.getThriller(movieGenre.getPage()+1);
        List<Result> movies = new ArrayList<Result>(movieGenre.getResults());
        movies.addAll(nextMovieGenre.getResults());
        return movies;
    }

    @GetMapping("/movies/genre/family")
    public List<Result> getFamily()
    {
        MovieGenre movieGenre = tmdb_api.getFamily(1);
        MovieGenre nextMovieGenre = tmdb_api.getFamily(movieGenre.getPage()+1);
        List<Result> movies = new ArrayList<Result>(movieGenre.getResults());
        movies.addAll(nextMovieGenre.getResults());
        return movies;
    }

    @GetMapping("/movies/genre/fantasy")
    public List<Result> getFantasy()
    {
        MovieGenre movieGenre = tmdb_api.getFantasy(1);
        MovieGenre nextMovieGenre = tmdb_api.getFantasy(movieGenre.getPage()+1);
        List<Result> movies = new ArrayList<Result>(movieGenre.getResults());
        movies.addAll(nextMovieGenre.getResults());
        return movies;
    }

    @GetMapping("/movies/genre/crime")
    public List<Result> getCrime()
    {
        MovieGenre movieGenre = tmdb_api.getCrime(1);
        MovieGenre nextMovieGenre = tmdb_api.getCrime(movieGenre.getPage()+1);
        List<Result> movies = new ArrayList<Result>(movieGenre.getResults());
        movies.addAll(nextMovieGenre.getResults());
        return movies;
    }

    @GetMapping("/movies/genre/adventure")
    public List<Result> getAdventure()
    {
        MovieGenre movieGenre = tmdb_api.getAdventure(1);
        MovieGenre nextMovieGenre = tmdb_api.getAdventure(movieGenre.getPage()+1);
        List<Result> movies = new ArrayList<Result>(movieGenre.getResults());
        movies.addAll(nextMovieGenre.getResults());
        return movies;
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

    @Autowired
    private FanArt_API fanArt_api;

    @GetMapping("/movies/logo")
    public Logo getLogo() {
        return fanArt_api.getLogo();
    }
}
