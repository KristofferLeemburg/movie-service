package com.netflixcloneteam1.feignclient;

import com.netflixcloneteam1.model.Logo;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(url = "http://webservice.fanart.tv/v3/", name = "fanart-api")
// API key 109b0569b2c53881c87d8878c0758403 - Netflixproject
    public interface FanArt_API {
    // http://webservice.fanart.tv/v3/movies/406?api_key=109b0569b2c53881c87d8878c0758403
    @GetMapping("movies/406?api_key=109b0569b2c53881c87d8878c0758403")
    Logo getLogo();
}
