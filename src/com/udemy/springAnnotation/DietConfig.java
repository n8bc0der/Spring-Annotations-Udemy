package com.udemy.springAnnotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
//@ComponentScan("com.udemy.springAnnotation")
@PropertySource("classpath:Diet.properties")
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
