package com.netflixcloneteam1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class NetflixcloneTeam1 {

	public static void main(String[] args) {
		SpringApplication.run(NetflixcloneTeam1.class, args);
	}


}
