package com.udemy.springAnnotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BadmintonDemoJavaConfig {
	
	@Bean
	public FortuneService badmintonFortuneService() {
		return new BadmintonFortuneService();
	}
	
	@Bean
	public Coach badmintonChachuCoach() {
		return new BadmintonCoach(badmintonFortuneService());
	}

}
