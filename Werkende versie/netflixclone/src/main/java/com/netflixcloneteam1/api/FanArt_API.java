package com.netflixcloneteam1.api;

import com.netflixcloneteam1.dto.movieImagesFA.MovieImagesFA;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(url = "http://webservice.fanart.tv/v3/", name = "fanart-api", decode404 = true)
// API key 109b0569b2c53881c87d8878c0758403 - Netflixproject

public interface FanArt_API {

    // get all possible images
    @GetMapping("movies/{id}")
    MovieImagesFA getMovieImages(@PathVariable("id") int movieId,
                                 @RequestParam(value="api_key") String api_key
    );

}
