package com.luan.spring.redis.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class SpringBootRedisPocApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootRedisPocApplication.class, args);
	}

}
