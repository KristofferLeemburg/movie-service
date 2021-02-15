package com.netflixcloneteam1.api;

import com.netflixcloneteam1.dto.*;
import com.netflixcloneteam1.dto.movieTrailer.MovieTrailer;
import com.netflixcloneteam1.dto.moviesByGenres.MoviesByGenre;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

// Opdracht van Kim Sing: meer dingen variabel maken, zoals movie_id, api key
// elke query param variabel maken

@FeignClient(url = "https://api.themoviedb.org/3/", name = "tmdb-api")

public interface TMDB_API {
   // https://api.themoviedb.org/3/movie/latest?api_key=3754c9307adf71f6f0b05eba28de0b3c
    @GetMapping("movie/latest?api_key=3754c9307adf71f6f0b05eba28de0b3c&language=en-US")
    Latest getLatest();
   // https://api.themoviedb.org/3/movie/475557?api_key=33ea3e5328d23c13d33ed05add4783b7&append_to_response=credits


    // get movie details based on id
    @GetMapping("movie/{movieId}")
    MovieDetails getMovieDetails(@PathVariable("movieId") int movieId,
                              @RequestParam(value="api_key") String api_key,
                              @RequestParam(value="language") String language,
                              @RequestParam(value="append_to_response") String credits);

 // get trailer based on movie id
 @GetMapping("movie/{movieId}/videos")
 MovieTrailer getMovieTrailer(@PathVariable("movieId") int movieId,
                              @RequestParam(value="api_key") String api_key,
                              @RequestParam(value="language") String language);

    // get list of movies based on genre id
    @GetMapping("discover/movie")
    MoviesByGenre getMoviesByGenre(@RequestParam(value="api_key") String api_key,
                                   @RequestParam(value="with_genres") String genreId,
                                   @RequestParam(value="language") String language,
                                   @RequestParam (value="sort_by") String sort_by,
                                   @RequestParam int page);

    // get list of movies based on release date
//    @GetMapping("discover/movie")
//    MovieDiscover getMoviesDiscover(@RequestParam(value="api_key") String api_key,
//                                   // primary_release_date.gte=1980-01-01&primary_release_date.lte=1989-12-31
//                                   @RequestParam(value="primary_release_date") String release_date,
//                                   @RequestParam(value="language") String language,
//                                   @RequestParam (value="sort_by") String sort_by,
//                                   @RequestParam int page);

 // get list of movies based on actor
//    @GetMapping("discover/movie")
//    MovieDiscover getMoviesDiscover(@RequestParam(value="api_key") String api_key,
//                                   @RequestParam(value="with_people") String actorId,
//                                   @RequestParam(value="language") String language,
//                                   @RequestParam (value="sort_by") String sort_by,
//                                   @RequestParam int page);

 // get list of movies based on Production House (e.g. Disney (companyId = 2)
//    @GetMapping("discover/movie")
//    MovieDiscover getMoviesDiscover(@RequestParam(value="api_key") String api_key,
//                                   @RequestParam(value="with_companies") String companyId,
//                                   @RequestParam(value="language") String language,
//                                   @RequestParam (value="sort_by") String sort_by,
//                                   @RequestParam int page);

    // https://api.themoviedb.org/3/discover/movie?api_key=3754c9307adf71f6f0b05eba28de0b3c&primary_release_date.gte=1980-01-01&primary_release_date.lte=1989-12-31
    @GetMapping("discover/movie?api_key=3754c9307adf71f6f0b05eba28de0b3c&language=en-US&primary_release_date.gte=1980-01-01&primary_release_date.lte=1989-12-31&sort_by=vote_count.desc")
    MovieDiscover get80s(@RequestParam int page);

    @GetMapping("discover/movie?api_key=3754c9307adf71f6f0b05eba28de0b3c&language=en-US&primary_release_date.gte=1990-01-01&primary_release_date.lte=1999-12-31&sort_by=vote_count.desc")
    MovieDiscover get90s(@RequestParam int page);

    @GetMapping("discover/movie?api_key=3754c9307adf71f6f0b05eba28de0b3c&language=en-US&primary_release_date.gte=2000-01-01&primary_release_date.lte=2009-12-31&sort_by=vote_count.desc")
    MovieDiscover get00s(@RequestParam int page);

    // https://api.themoviedb.org/3/discover/movie?api_key=33ea3e5328d23c13d33ed05add4783b7&sort_by=popularity.desc&with_companies=2
    @GetMapping("discover/movie?api_key=3754c9307adf71f6f0b05eba28de0b3c&language=en-US&sort_by=vote_count.desc&with_companies=2")
    MovieDiscover getDisney(@RequestParam int page);

    @GetMapping("discover/movie?api_key=3754c9307adf71f6f0b05eba28de0b3c&language=en-US&with_people=85&sort_by=vote_count.desc")
    MovieDiscover getJohnnyDepp(@RequestParam int page);

    @GetMapping("discover/movie?api_key=3754c9307adf71f6f0b05eba28de0b3c&language=en-US&with_people=23229&sort_by=vote_count.desc")
    MovieDiscover getCariceVanHouten(@RequestParam int page);

    @GetMapping("discover/movie?api_key=3754c9307adf71f6f0b05eba28de0b3c&with_people=4273&sort_by=vote_count.desc&language=en-US")
    MovieDiscover getCharlotteGainbourgh(@RequestParam int page);
}


