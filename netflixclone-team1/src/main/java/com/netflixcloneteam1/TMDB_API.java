package com.netflixcloneteam1;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(url = "https://api.themoviedb.org/3/", name = "tmdb-api")
public interface TMDB_API {
   // https://api.themoviedb.org/3/movie/latest?api_key=3754c9307adf71f6f0b05eba28de0b3c&language=en-US
    @GetMapping("movie/latest?api_key=3754c9307adf71f6f0b05eba28de0b3c&language=en-US")
    LatestDto getLatest();

   // https://api.themoviedb.org/3/movie/406?api_key=33ea3e5328d23c13d33ed05add4783b7&append_to_response=credits,videos
    @GetMapping("movie/406?api_key=33ea3e5328d23c13d33ed05add4783b7&append_to_response=credits")
    MovieDetails getDetails();

    // https://api.themoviedb.org/3/movie/475557/videos?api_key=3754c9307adf71f6f0b05eba28de0b3c&language=en-US
    @GetMapping("movie/475557/videos?api_key=3754c9307adf71f6f0b05eba28de0b3c&language=en-US")
    MovieTrailer getVideo();
}
