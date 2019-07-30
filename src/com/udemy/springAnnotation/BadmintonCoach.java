package com.udemy.springAnnotation;

import org.springframework.stereotype.Component;

@Component
public class BadmintonCoach implements Coach {

	private FortuneService fortuneService;
	
	public BadmintonCoach(FortuneService fortuneService)  {
		this.fortuneService = fortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Play with Chachu and compete with him and his experience";
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
