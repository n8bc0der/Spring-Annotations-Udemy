package com.udemy.springAnnotation;

public class FootballCoach implements Coach {

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

}
