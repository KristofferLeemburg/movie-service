package com.netflixcloneteam1.api;

import com.netflixcloneteam1.dto.*;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

// Opdracht van Kim Sing: meer dingen variabel maken, zoals movie_id, api key
// elke query param variabel maken

@FeignClient(url = "https://api.themoviedb.org/3/", name = "tmdb-api")
public interface TMDB_API {
   // https://api.themoviedb.org/3/movie/latest?api_key=3754c9307adf71f6f0b05eba28de0b3c
    @GetMapping("movie/latest?api_key=3754c9307adf71f6f0b05eba28de0b3c&language=en-US")
    Latest getLatest();
   // https://api.themoviedb.org/3/movie/475557?api_key=33ea3e5328d23c13d33ed05add4783b7&append_to_response=credits
    @GetMapping("movie/475557?api_key=3754c9307adf71f6f0b05eba28de0b3c&language=en-US&append_to_response=credits")
    MovieDetails getDetails();
    // https://api.themoviedb.org/3/movie/475557/videos?api_key=3754c9307adf71f6f0b05eba28de0b3c
    @GetMapping("movie/475557/videos?api_key=3754c9307adf71f6f0b05eba28de0b3c&language=en-US")
    MovieTrailer getVideo();
    // Discover:
    // https://api.themoviedb.org/3/discover/movie?api_key=33ea3e5328d23c13d33ed05add4783b7&with_genres=28&without_genres=35,53,10751,14,80,12
    @GetMapping("discover/movie?api_key=3754c9307adf71f6f0b05eba28de0b3c&language=en-US&with_genres=28&without_genres=35,53,10751,14,80,12,878,18&sort_by=vote_count.desc")
    MovieGenre getAction(@RequestParam int page);

    @GetMapping("discover/movie?api_key=3754c9307adf71f6f0b05eba28de0b3c&language=en-US&with_genres=35&without_genres=28,53,10751,14,80,12&sort_by=vote_count.desc")
    MovieGenre getComedy(@RequestParam int page);

    @GetMapping("discover/movie?api_key=3754c9307adf71f6f0b05eba28de0b3c&language=en-US&with_genres=53&without_genres=28,35,10751,14,80,12&sort_by=vote_count.desc")
    MovieGenre getThriller(@RequestParam int page);

    @GetMapping("discover/movie?api_key=3754c9307adf71f6f0b05eba28de0b3c&language=en-US&with_genres=10751&without_genres=35,53,28,14,80,12&sort_by=vote_count.desc")
    MovieGenre getFamily(@RequestParam int page);

    @GetMapping("discover/movie?api_key=3754c9307adf71f6f0b05eba28de0b3c&language=en-US&with_genres=14&without_genres=35,53,10751,28,80,12&sort_by=vote_count.desc")
    MovieGenre getFantasy(@RequestParam int page);

    @GetMapping("discover/movie?api_key=3754c9307adf71f6f0b05eba28de0b3c&language=en-US&with_genres=80&without_genres=35,53,10751,28,14,12&sort_by=vote_count.desc")
    MovieGenre getCrime(@RequestParam int page);

    @GetMapping("discover/movie?api_key=3754c9307adf71f6f0b05eba28de0b3c&language=en-US&with_genres=12&without_genres=35,53,10751,28,80,14&sort_by=vote_count.desc")
    MovieGenre getAdventure(@RequestParam int page);

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


