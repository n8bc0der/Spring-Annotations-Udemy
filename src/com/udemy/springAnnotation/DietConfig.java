package com.udemy.springAnnotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan("com.udemy.springAnnotation")
public class DietConfig {
	
	@Bean
	public FortuneService dailyDietFortuneService() {
		return new RegularDietFortuneService();
		
	}
	
	@Bean
	public Coach footballCoach() {
		return new FootballCoach(dailyDietFortuneService());
	}

}
