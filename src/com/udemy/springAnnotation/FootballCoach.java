package com.udemy.springAnnotation;

import org.springframework.beans.factory.annotation.Value;

public class FootballCoach implements Coach {

	@Value("${foo.name}")
	private String Name;
	
	@Value("${foo.email}")
	private String Email;
	
	
	private FortuneService fortuneService;
	
	FootballCoach(FortuneService fortuneService) {
		
		this.fortuneService = fortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Practice defending and passing daily for 2 hrs in interval.";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

	@Override
	public String getFileFortune() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getName() {
		return Name;
	}

	public String getEmail() {
		return Email;
	}

}
