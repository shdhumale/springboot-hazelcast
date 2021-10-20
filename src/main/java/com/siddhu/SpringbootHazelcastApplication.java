package com.siddhu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@EnableCaching
@SpringBootApplication
public class SpringbootHazelcastApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootHazelcastApplication.class, args);
	}

}
