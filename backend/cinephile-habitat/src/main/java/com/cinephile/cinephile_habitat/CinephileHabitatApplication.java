package com.cinephile.cinephile_habitat;

import java.lang.System;
import io.github.cdimascio.dotenv.Dotenv;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CinephileHabitatApplication {
	Dotenv dotenv = Dotenv.load();
	System.setProperty("TMDB_API_KEY", dotenv.get("TMDB_API_KEY"));
	public static void main(String[] args) {
		SpringApplication.run(CinephileHabitatApplication.class, args);
	}
}
